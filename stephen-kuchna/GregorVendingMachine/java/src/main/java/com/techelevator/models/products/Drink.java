package com.techelevator.models.products;

import java.math.BigDecimal;

public class Drink extends Product
{
    public Drink(){
        super();
    }

    public Drink ( String name, BigDecimal price )
    {
        super( name, price );
    }

    @Override
    public String consume ()
    {
        return "Glug Glug, Yum!";
    }

}
