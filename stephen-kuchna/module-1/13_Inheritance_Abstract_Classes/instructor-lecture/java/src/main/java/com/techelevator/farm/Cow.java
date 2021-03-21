package com.techelevator.farm;

import java.math.BigDecimal;

public class Cow extends FarmAnimal implements Sellable
{
	private BigDecimal price;

	public Cow()
	{
		super("Cow", "moo!");
		price = new BigDecimal("1500.00");
	}

	public BigDecimal getPrice()
	{
		return price;
	}
	
	public String eat()
	{
		startEating();
		return "the cow is now eating";
	}

	// if the super class marks the function
	// as final - you CANNOT override it
//	@Override
//	public String getSound()
//	{
//		if (isEating())
//		{
//			return "chew!";
//		} 
//		else
//		{
//			return super.getSound();
//		}
//	}
	
	// toString is like your elevator pitch
	// it is a sentence that describes the object
//	@Override
//	public String toString()
//	{
//		return "A " + getName() + " says " + getSound();
//	}
}
