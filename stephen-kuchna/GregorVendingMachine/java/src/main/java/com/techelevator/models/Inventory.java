package com.techelevator.models;

import com.techelevator.models.exceptions.InvalidSlotException;
import com.techelevator.views.menus.Colors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Inventory
{
    private Map< String, Slot > slots;

    public Inventory ( List< Slot > slotList )
    {
        slots = new TreeMap<>();

        for ( Slot slot : slotList )
        {
            this.slots.put( slot.getPosition(), slot );
        }
    }

    public Set< String > getPositions ()
    {
        return slots.keySet();
    }


    public Slot getSlot ( String position ) throws InvalidSlotException
    {
        if ( !slots.containsKey( position ) )
        {
            throw new InvalidSlotException( position );
        }

        return slots.get( position );
    }

    public Map<String, Slot> getSlots()
    {
        return slots;
    }
}
