package com.techelevator.models.finance;

//import com.sun.prism.impl.ps.CachingShapeRep;
import com.techelevator.models.Slot;
import com.techelevator.models.VendingMachine;
import com.techelevator.models.data.*;
import com.techelevator.models.products.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class CashRegisterTests
{
    private VendingMachine vendingMachine;
    private InventoryRepository inventoryRepository = new FileInventoryRepository();
    private Logger logger = new FileLogger();

    @Before
    public void testSetup()
    {
        vendingMachine = new VendingMachine(inventoryRepository, logger);
    }

    @Test
    public void Should_IncreaseCredit_WhenAddingCash()
    {
        //arrange
        CashRegister register = vendingMachine.getCashRegister();

        //act
        register.addMoney( 1 );
        register.addMoney( 2 );

        //assert
        BigDecimal credit = register.getCredit();
        Assert.assertEquals( new BigDecimal(3), credit );
    }

    @Test
    public void CanBePurchased_ShouldReturnFalse_WhenCreditIsLessThanPrice()
    {
        //arrange
        Product sunchips = ProductBuilder.build( "Sun Chips", "1.95", "Chip" );
        CashRegister register = vendingMachine.getCashRegister();

        register.addMoney( "1.00" );

        //act
        boolean canPurchase = register.canPurchase( sunchips);

        //assert
        Assert.assertEquals( false, canPurchase );
    }

    @Test
    public void CanBePurchased_ShouldReturnTrue_WhenCreditIsMoreThanPrice()
    {
        //arrange
        Product sunchips = ProductBuilder.build( "Sun Chips", "1.95", "Chip" );
        CashRegister register = vendingMachine.getCashRegister();

        register.addMoney( "2.00" );

        //act
        boolean canPurchase = register.canPurchase( sunchips);

        //assert
        Assert.assertEquals( true, canPurchase );
    }

    @Test
    public void CanBePurchased_ShouldReturnTrue_WhenCreditIsSameAsPrice()
    {
        //arrange
        Product sunchips = ProductBuilder.build( "Sun Chips", "1.95", "Chip" );
        CashRegister register = vendingMachine.getCashRegister();

        register.addMoney( "1.95" );

        //act
        boolean canPurchase = register.canPurchase( sunchips);

        //assert
        Assert.assertEquals( true, canPurchase );
    }

    @Test
    public void Should_DecreaseCredit_WhenPurchasingProduct() throws Exception
    {
        //arrange
        Product sunchips = ProductBuilder.build( "Sun Chips", "1.95", "Chip" );
        Slot slot = new Slot("A1", sunchips, 5);
        CashRegister register = vendingMachine.getCashRegister();
        register.addMoney( 5 );

        //act
        register.purchase(slot);

        //assert
        BigDecimal credit = register.getCredit();
        Assert.assertEquals( new BigDecimal("3.05"), credit );
    }

    @Test
    public void Should_DispenseFourQuarters_WithOneDollarCredit()
    {
        //arrange
        CashRegister register = vendingMachine.getCashRegister();
        register.addMoney( 1 );

        //act
        Change change = register.dispenseChange();

        //assert
        Assert.assertEquals(4,(int)change.getQuarters());
        Assert.assertEquals(0,(int)change.getDimes());
        Assert.assertEquals(0,(int)change.getNickles());
    }

    @Test
    public void Should_DispenseOneQuarter_OneDime_AndOneNickle_With40CentCredit()
    {
        //arrange
        CashRegister register = vendingMachine.getCashRegister();
        register.addMoney( ".40" );

        //act
        Change change = register.dispenseChange();

        //assert
        Assert.assertEquals(1,(int)change.getQuarters());
        Assert.assertEquals(1,(int)change.getDimes());
        Assert.assertEquals(1,(int)change.getNickles());
    }

    @Test
    public void Should_DispenseOneQuarter_AndTwoDimes_With45CentCredit()
    {
        //arrange
        CashRegister register = vendingMachine.getCashRegister();
        register.addMoney( ".45" );

        //act
        Change change = register.dispenseChange();

        //assert
        Assert.assertEquals(1,(int)change.getQuarters());
        Assert.assertEquals(2,(int)change.getDimes());
        Assert.assertEquals(0,(int)change.getNickles());
    }


}
