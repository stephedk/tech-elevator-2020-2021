package com.techelevator.models.finance;

import java.math.BigDecimal;

public class Change
{
    private int remainingChange = 0;
    private int quarters = 0;
    private int dimes = 0;
    private int nickles = 0;

    public Integer getQuarters ()
    {
        return quarters;
    }

    public Integer getDimes ()
    {
        return dimes;
    }

    public Integer getNickles ()
    {
        return nickles;
    }

    public Change ( BigDecimal amount )
    {
        BigDecimal pennies = new BigDecimal( 100 );
        BigDecimal totalCents = amount.multiply( pennies );
        remainingChange = totalCents.intValue();

        quarters = dispenseCoins( 25 );
        dimes = dispenseCoins( 10 );
        nickles = dispenseCoins( 5 );
    }

    private int dispenseCoins(int coin)
    {
        int coinCount = 0;
        while(remainingChange >= coin)
        {
            coinCount++;
            remainingChange -= coin;
        }
        return coinCount;
    }

    public boolean hasChange()
    {
        return quarters > 0 || dimes > 0 || nickles > 0;
    }
}
