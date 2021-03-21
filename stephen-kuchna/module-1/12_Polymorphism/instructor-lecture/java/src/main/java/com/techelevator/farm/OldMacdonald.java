package com.techelevator.farm;

import java.util.ArrayList;
import java.util.List;

public class OldMacdonald
{
	public static void main(String[] args)
	{

		// add logic to sing about the farm
		// when I create a list of Singables
		// I can add anything to the list
		// that implements the singable interface
		List<Singable> farmThings = new ArrayList<Singable>();
		
		farmThings.add(new Chicken());
		farmThings.add(new Cow());
		farmThings.add(new Pig());
		farmThings.add(new Tractor());
		
		for (Singable thing : farmThings)
		{
			singVerse(thing);
		}
		
	}
	

	// note that the input parameter for this function is a Singable
	// this gives us the flexibility to pass
	// any object that implements the Singable interface
	public static void singVerse(Singable farmItem)
	{
		String name = farmItem.getName();
		String sound = farmItem.getSound();

		System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
		System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
		System.out.println("With a " + sound + " " + sound + " here");
		System.out.println("And a " + sound + " " + sound + " there");
		System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
		System.out.println();

	}
	
	public static void cowDemo()
	{
		Cow cow = new Cow();
		System.out.println(cow.getSound());
		cow.startEating();
		cow.stopEating();
		System.out.println(cow.getSound());
		
		FarmAnimal animal = cow;
		System.out.println(animal.getSound());
	}
	
	public static void chickenDemo()
	{
		FarmAnimal pig = new FarmAnimal("Pig", "oink!");	
		
		
		Chicken chicken = new Chicken();
		
		// implicit conversion
		// because a chicken IS A FarmAnimal
		FarmAnimal animal = chicken;		
		System.out.println(animal.getName());
		
		// animal doesn't know that layEgg() is available
		// to do that we need to convert the animal to a chicken
		//  We have to do explicit conversion
		// because NOT every animal IS A chicken
		Chicken c2 = (Chicken)animal;
		c2.layEgg();
		

		
		System.out.println(pig.getName() + " says " + pig.getSound());
		System.out.println(chicken.getName() + " says " + chicken.getSound());
		chicken.layEgg();
	}
}