package com.techelevator.models.products;

import java.math.BigDecimal;

public class Chip extends Product
{
    public Chip(){
        super();
    }

    public Chip(String name, BigDecimal price)
    {
        super( name, price );
    }

    @Override
    public String consume ()
    {
        return "Crunch Crunch, Yum!";
    }

}
