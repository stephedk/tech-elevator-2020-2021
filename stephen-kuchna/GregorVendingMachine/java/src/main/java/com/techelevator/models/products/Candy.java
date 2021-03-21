package com.techelevator.models.products;

import java.math.BigDecimal;

public class Candy extends Product
{
    public Candy(){
        super();
    }

    public Candy ( String name, BigDecimal price )
    {
        super( name, price );
    }

    @Override
    public String consume ()
    {
        return "Munch Munch, Yum!";
    }

}
