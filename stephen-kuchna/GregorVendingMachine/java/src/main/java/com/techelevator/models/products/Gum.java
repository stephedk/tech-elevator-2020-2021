package com.techelevator.models.products;

import java.math.BigDecimal;

public class Gum extends Product
{
    public Gum(){
        super();
    }

    public Gum ( String name, BigDecimal price )
    {
        super( name, price );
    }

    @Override
    public String consume ()
    {
        return "Chew Chew, Yum!";
    }

}
