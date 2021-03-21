package com.techelevator.farm;

public class FarmAnimal implements Singable
{
	private String name;
	private String sound;

	public FarmAnimal(String name, String sound)
	{
		this.name = name;
		this.sound = sound;
	}
	
	public FarmAnimal()
	{
		// call a different constructor
		// with a different signature
		this("Cow", "moo!");
		
		// so that I don't repeat myself
		//		this.name = "Cow";
		//		this.sound = "moo!";
	}

	public String getName()
	{
		return name;
	}

	public String getSound()
	{
		return sound;
	}

}