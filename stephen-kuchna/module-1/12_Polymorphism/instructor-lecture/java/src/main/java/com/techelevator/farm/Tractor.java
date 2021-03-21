package com.techelevator.farm;

public class Tractor implements Singable
{
	private String name;
	private String sound;
	
	public Tractor()
	{
		this.name = "Big Red";
		this.sound = "clank!";
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
