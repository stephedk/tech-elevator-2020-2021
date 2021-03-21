package com.techelevator.models;

import com.techelevator.models.exceptions.InsuficientFundsException;
import com.techelevator.models.exceptions.InvalidSlotException;
import com.techelevator.models.exceptions.OutOfStockException;
import com.techelevator.models.finance.CashRegister;
import com.techelevator.models.data.FileInventoryRepository;
import com.techelevator.models.products.Product;

import java.util.List;

public class VendingMachine
{
    private Inventory inventory;
    private CashRegister cashRegister;
    private String errorMessage = null;

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

    public VendingMachine ()
    {
        loadInventory();
        cashRegister = new CashRegister();
    }

    private void loadInventory ()
    {
        try
        {
            FileInventoryRepository repo = new FileInventoryRepository();
            List< Slot > slots = repo.loadInventory();
            inventory = new Inventory( slots );
        }
        catch ( Exception ex )
        {
            // log exception here
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
