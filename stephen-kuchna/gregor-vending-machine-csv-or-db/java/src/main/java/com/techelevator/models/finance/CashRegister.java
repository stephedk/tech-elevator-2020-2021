package com.techelevator.models.finance;

import com.techelevator.models.data.Logger;
import com.techelevator.models.exceptions.InsuficientFundsException;
import com.techelevator.models.exceptions.OutOfStockException;
import com.techelevator.models.data.FileLogger;
import com.techelevator.models.Slot;
import com.techelevator.models.products.Product;

import java.math.BigDecimal;

public class CashRegister
{
    private Logger logger;
    private BigDecimal credit;

    public BigDecimal getCredit( )
    {
        return credit;
    }

    public CashRegister(Logger logger)
    {
        this.logger = logger;
        credit = new BigDecimal( 0 );
    }

    public void addMoney( int amount )
    {
        addMoney( "" + amount );
    }

    public void addMoney( String amount )
    {
        BigDecimal cash = new BigDecimal( amount );
        BigDecimal begin = new BigDecimal( credit.toString() );
        BigDecimal end = credit.add( cash );

        logger.log( "FEED MONEY:", begin, end );

        credit = end;
    }

    public void purchase( Slot slot ) throws InsuficientFundsException, OutOfStockException
    {
        Product product = slot.getProduct();
        if(!canPurchase( product ))
        {
            throw new InsuficientFundsException(credit,product);
        }

        slot.purchase();

        BigDecimal begin = new BigDecimal( credit.toString() );
        BigDecimal end = credit.subtract( product.getPrice() );

        String action = String.format( "%s %s", product.getName(), slot.getPosition() );
        logger.log( action, begin, end );

        credit = end;

    }

    public boolean canPurchase(Product product)
    {
        return credit.compareTo( product.getPrice() ) >= 0;
    }

    public Change dispenseChange()
    {
        Change change = new Change( credit );

        credit = new BigDecimal( 0 );

        return change;
    }
}
