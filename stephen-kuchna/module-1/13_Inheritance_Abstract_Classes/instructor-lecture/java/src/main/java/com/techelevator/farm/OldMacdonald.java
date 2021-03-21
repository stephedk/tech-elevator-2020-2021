package com.techelevator.farm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OldMacdonald
{
	public static void main(String[] args)
	{
		// how interfaces are used in Java
		// List is the interface		ArrayList is the Implementation
		List<Singable> farmThings = new ArrayList<Singable>();
		// Map is the interface			HashMap is the Implementation
		Map<String, String> myItems = new HashMap<String, String>();
		
		
		Cow cow = new Cow();
		System.out.println(cow.toString());
		
//		run();
	}


	public static void singSong()
	{
		System.out.println("**  Old Macdonald Had a Farm  **");
		System.out.println();

		List<Singable> farmThings = new ArrayList<Singable>();
		
		Cow cow = new Cow();
		cow.startEating();

		farmThings.add(cow);
		farmThings.add(new Chicken());
		farmThings.add(new Tractor());
//		farmThings.add(new FarmAnimal("Wolf", "ah-ooooo!"));
//		farmThings.add(new FarmAnimal("Gogledeegoop", "swishee!"));

		for (Singable thing : farmThings)
		{
			singVerse(thing);
		}
	}

	public static void singVerse(Singable singable)
	{
		String name = singable.getName();
		String sound = singable.getSound();

		System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
		System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
		System.out.println("With a " + sound + " " + sound + " here");
		System.out.println("And a " + sound + " " + sound + " there");
		System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
		System.out.println();

	}

	public static void goToMarket()
	{
		System.out.println("****     Farmers Market     ****");
		System.out.println();

		List<Sellable> sellables = new ArrayList<Sellable>();

		sellables.add(new Cow());
		sellables.add(new Egg());
		sellables.add(new Pig());

		for (Sellable sellable : sellables)
		{
			System.out.println("Step right up and get your " + sellable.getName());
			System.out.println("-- Only $" + sellable.getPrice());
			System.out.println();
		}
	}

	public static void run()
	{
		Scanner console = new Scanner(System.in);		
		
		System.out.println();
		System.out.println("****  Welcome to the farm!  ****");
		System.out.println("********************************");
		System.out.println();

		while(true)
		{
			// display the options
			System.out.println("Options ");
			System.out.println("**********");
			System.out.println("[1] sing");
			System.out.println("[2] sell");
			System.out.println("[3] exit");
			System.out.print("Select and option >>> ");

			// get the user selection
			String selection = console.nextLine();
			int option = Integer.parseInt(selection);

			System.out.println();

			// execute the option
			if(option == 1)
			{
				singSong();
			}
			else if(option == 2)
			{
				goToMarket();
			}
			else
			{
				// this is what takes 
				// me out of the loop
				break;
			}

			System.out.println();

		}

		console.close();

		System.out.println("********************************");
		System.out.println("Thank you for playing");
	}


}