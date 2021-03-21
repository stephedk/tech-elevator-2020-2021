package com.techelevator.models;

import com.techelevator.models.data.InventoryRepository;
import com.techelevator.models.data.Logger;
import com.techelevator.models.exceptions.InsuficientFundsException;
import com.techelevator.models.exceptions.InvalidSlotException;
import com.techelevator.models.exceptions.OutOfStockException;
import com.techelevator.models.finance.CashRegister;
import com.techelevator.models.data.FileInventoryRepository;
import com.techelevator.models.finance.Change;
import com.techelevator.models.products.Product;

import java.util.List;

public class VendingMachine
{
    private Inventory inventory;
    private CashRegister cashRegister;
    private String errorMessage = null;
    private InventoryRepository inventoryRepository;

    public String getErrorMessage()
    {
        return errorMessage;
    }

    public void setErrorMessage(String value)
    {
        errorMessage = value;
    }

    public boolean hasError()
    {
        return this.errorMessage != null;
    }

    public void clearError()
    {
        errorMessage = null;
    }

    public Inventory getInventory ()
    {
        return inventory;
    }

    public CashRegister getCashRegister ()
    {
        return cashRegister;
    }

    public VendingMachine (InventoryRepository repository, Logger logger)
    {
        inventoryRepository = repository;
        loadInventory();
        cashRegister = new CashRegister(logger);
    }

    private void loadInventory ()
    {
        try
        {
            List< Slot > slots = inventoryRepository.loadInventory();
            inventory = new Inventory( slots );
        }
        catch ( Exception ex )
        {

        }
    }

    public Product purchase ( String slotName ) throws InvalidSlotException, OutOfStockException, InsuficientFundsException
    {

        Slot slot = inventory.getSlot( slotName );

        if(!slot.hasProducts())
        {
            throw new OutOfStockException( slot );
        }

        cashRegister.purchase( slot );

        return slot.getProduct();
    }
}
