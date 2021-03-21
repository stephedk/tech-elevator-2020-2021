package com.techelevator.farm;

import java.math.BigDecimal;

public class Cow extends FarmAnimal implements Sellable
{
	private BigDecimal price;
	private boolean isEating;

	public Cow()
	{
		super("Cow", "moo!");
		price = new BigDecimal("1500.00");
	}

	public BigDecimal getPrice()
	{
		return price;
	}

	public void startEating()
	{
		isEating = true;
	}

	public void stopEating()
	{
		isEating = false;
	}

	@Override
	public String getSound()
	{
		if (isEating)
		{
			return "chew!";
		} else
		{
			return super.getSound();
		}
	}
}
