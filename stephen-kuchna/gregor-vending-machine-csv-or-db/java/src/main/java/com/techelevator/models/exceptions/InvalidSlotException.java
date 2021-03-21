package com.techelevator.models.exceptions;

public class InvalidSlotException extends Exception
{
    private static final String MESSAGE = "The selected slot is invalid.";

    private String selectedSlot;

    public String getSelectedSlot()
    {
        return selectedSlot;
    }

    public InvalidSlotException ( String selectedSlot )
    {
        super(MESSAGE);

        this.selectedSlot = selectedSlot.toUpperCase();
    }

    @Override
    public String toString()
    {
        return String.format( "%s\nSelected Slot: %s", getMessage(), selectedSlot );
    }
}
