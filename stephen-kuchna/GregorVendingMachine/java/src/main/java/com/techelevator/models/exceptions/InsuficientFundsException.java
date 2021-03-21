package com.techelevator.models.exceptions;

import com.techelevator.models.products.Product;

import java.math.BigDecimal;

public class InsuficientFundsException extends Exception
{
    private static final String MESSAGE = "Insufficient credit to purchase the selected product.";
    private BigDecimal availableCredit;
    private Product selectedProduct;

    public InsuficientFundsException ( BigDecimal availableCredit, Product selectedProduct )
    {
        super(MESSAGE);

        this.availableCredit = availableCredit;
        this.selectedProduct = selectedProduct;
    }

    public BigDecimal getAvailableCredit ()
    {
        return availableCredit;
    }

    public Product getSelectedProduct ()
    {
        return selectedProduct;
    }

    @Override
    public String toString()
    {
        return String.format( "%s\nAvailable Credit: $%s\nSelected Product: %s\nProduct Price: $%s", getMessage(), availableCredit, selectedProduct.getName(), selectedProduct.getPrice());
    }
}
