package com.techelevator.farm;

// abstract means
// this is only a super class
// can never be created directly
public abstract class FarmAnimal implements Singable
{
	private String name;
	private String sound;
	private boolean isEating;

	public FarmAnimal(String name, String sound)
	{
		this.name = name;
		this.sound = sound;
		this.isEating = false;
	}

	public String getName()
	{
		return name;
	}

	// mark as final - so that it CANNOT be overriden
	public final String getSound()
	{
		return sound;
	}
	
	public boolean isEating()
	{
		return isEating;
	}

	public void startEating()
	{
		isEating = true;
	}

	public void stopEating()
	{
		isEating = false;
	}

	// all children MUST override this function
	// because of the abstract keyword
	// it's a contract similar to interfaces
	public abstract String eat();
}