package com.techelevator.farm;

public class Cow extends FarmAnimal
{
	private boolean isEating;

	public Cow()
	{
		super("Cow", "moo!");
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
		if(isEating)
		{
			return "chew!";
		}
		else 
		{
			return super.getName();
		}
	}

}