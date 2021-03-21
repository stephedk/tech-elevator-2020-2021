package com.techelevator.models.exceptions;

import com.techelevator.models.Slot;

import java.math.BigDecimal;

public class OutOfStockException extends Exception
{
    private static final String MESSAGE = "The selected product is out of stock.";

    private Slot slot;

    public String getSelectedSlot()
    {
        return slot.getPosition();
    }

    public String getProductName()
    {
        return slot.getName();
    }

    public BigDecimal getProductPrice ()
    {
        return slot.getPrice();
    }

    public int getQuantity()
    {
        return slot.getQuantity();
    }

    public OutOfStockException (Slot slot )
    {
        super(MESSAGE);

        this.slot = slot;
    }

    @Override
    public String toString()
    {
        return String.format( "%s\nSelected Slot: %s\nProduct: %s\nAvailable Quantity: %s", getMessage(), getSelectedSlot(), getProductName(), getQuantity() );
    }
}
