package com.techelevator.models;

import java.math.BigDecimal;

import com.techelevator.models.exceptions.InsuficientFundsException;

/**
 * Responsibilities:
 *      Manage all payment transactions
 *      Accept payment
 * 
 * Dependencies:
 *      ShoppingCart
 */
public class CashRegister 
{
    public static BigDecimal pay(ShoppingCart cart, BigDecimal paymentAmount) throws InsuficientFundsException
    {
        // get the amount owed
        BigDecimal cartTotal = cart.getCartTotal();
        //calculate change from payment
        BigDecimal change = paymentAmount.subtract(cartTotal);

        // throw an exception if the payment is not enough
        if(change.compareTo(BigDecimal.ZERO) < 0 )
        {
            throw new InsuficientFundsException("The provided payment is not sufficient.", cartTotal, paymentAmount);
        }

        return change;
    }
}
