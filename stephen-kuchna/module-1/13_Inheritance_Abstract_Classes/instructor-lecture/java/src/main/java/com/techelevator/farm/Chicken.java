package com.techelevator.farm;

// final means
// you CANNOT create a child class
// that inherits from chicken
public final class Chicken extends FarmAnimal
{

	public Chicken()
	{
		super("Chicken", "cluck!");
	}

	public void layEgg()
	{
		System.out.println("Chicken laid an egg!");
	}
	
	public String eat()
	{
		startEating();
		return "the chicken is now eating";
	}

	// if the super class marks the function
	// as final - you CANNOT override it
//	@Override
//	public String getSound()
//	{
//		return "revolt!";
//	}

}