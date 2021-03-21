package com.techelevator.models.products;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

public abstract class Product
{
    private String name;
    private BigDecimal price;

    public String getName ()
    {
        return name;
    }

    public BigDecimal getPrice ()
    {
        return price;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPrice(BigDecimal price)
    {
        this.price = price;
    }

    public Product()
    {

    }

    public Product ( String name, BigDecimal price )
    {
        this.name = name;
        this.price = price;
    }

    public abstract String consume ();
}
