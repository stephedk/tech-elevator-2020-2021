package com.techelevator.farm;

import java.math.BigDecimal;

public class Pig extends FarmAnimal implements Sellable
{
    private BigDecimal price;

    public Pig()
    {
        super("Pig", "oink!");
        price = new BigDecimal("300.00");
    }

    public BigDecimal getPrice()
    {
        return price;
    }
	
	public String eat()
	{
		startEating();
		return "the pig is now eating";
	}
}