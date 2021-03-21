package com.techelevator.models.data;

import com.techelevator.models.Slot;

import java.util.List;

public interface InventoryRepository
{
    List<Slot> loadInventory ();
}
