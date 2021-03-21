package com.techelevator.models;

import com.techelevator.models.data.ProductBuilder;
import com.techelevator.models.exceptions.OutOfStockException;
import com.techelevator.models.products.Product;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SlotTests
{

    @Test
    public void Should_ReduceSlotQuantity_OnPurchase() throws OutOfStockException
    {
        //arrange
        Product sunchips = ProductBuilder.build( "Sun Chips", "1.95", "Chip" );
        Slot slot = new Slot("A1", sunchips, 5);

        //act
        slot.purchase();
        int quantity = slot.getQuantity();

        //assert
        Assert.assertEquals( 4, quantity );
    }

}
