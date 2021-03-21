package com.techelevator.models;

import com.techelevator.models.exceptions.OutOfStockException;
import com.techelevator.models.products.Product;

import java.math.BigDecimal;

public class Slot
{
    private String position;
    private Product product;
    private int quantity;

    public String getPosition( )
    {
        return position;
    }

    public Product getProduct( )
    {
        return product;
    }

    public String getName( )
    {
        return product.getName();
    }

    public BigDecimal getPrice( )
    {
        return product.getPrice();
    }

    public int getQuantity( )
    {
        return quantity;
    }

    public Slot( String position, Product product, int quantity )
    {
        this.position = position;
        this.product = product;
        this.quantity = quantity;
    }

    public boolean hasProducts()
    {
        return quantity > 0;
    }

    public void purchase( ) throws OutOfStockException
    {
        if ( !hasProducts() )
        {
            throw new OutOfStockException( this );
        }
        quantity -= 1;
    }
}
