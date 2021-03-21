package com.techelevator.farm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OldMacdonald
{
	public static void main(String[] args)
	{
		singSong();
	}


	public static void singSong()
	{
		System.out.println("**  Old Macdonald Had a Farm  **");
		System.out.println();

		List<Singable> farmThings = new ArrayList<Singable>();

		farmThings.add(new Cow());
		farmThings.add(new Chicken());
		farmThings.add(new Pig());
		farmThings.add(new Tractor());

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
			System.out.println("Options ");
			System.out.println("**********");
			System.out.println("[1] sing");
			System.out.println("[2] sell");
			System.out.println("[3] exit");
			System.out.print("Select and option >>> ");

			String selection = console.nextLine();
			int option = Integer.parseInt(selection);

			System.out.println();

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
				break;
			}

			System.out.println();

		}

		console.close();

		System.out.println("********************************");
		System.out.println("Thank you for playing");
	}


}