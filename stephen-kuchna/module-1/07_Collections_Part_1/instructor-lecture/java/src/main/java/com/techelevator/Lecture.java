package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.print.attribute.Size2DSyntax;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		
		// List is comparable to an array
		int[] numbersArray = new int[5];
		List<Integer> numbers = new ArrayList<Integer>();
		
		// int is managed on the Stack
		// Java has wrapper classes for ALL primitives
		// Integer is a wrapper for int and is managed on the heap
				
		numbers.add(25);
		numbers.add(13);
		// numbers.add("Gregor"); // this is not legal
		
		
		List<String> names = new ArrayList<String>();
		
		names.add("Wolverine");
		names.add("Iron Man");
		names.add("Captain America");
		names.add("Deadpool");

		System.out.println();
		System.out.println();

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");
		
		String firstNameString = names.get(0);
		System.out.println("The first hero is: " + firstNameString);
		
		// can loop through lists the same way 
		// that we loop through arrays
		for(int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		

		System.out.println();
		System.out.println();

		
		
		

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");
		
		
		names.add("Wolverine");
		for(int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		

		System.out.println();
		System.out.println();


		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");
		
		names.add(3, "The Incredible Hulk");
		for(int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		

		System.out.println();
		System.out.println();


		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");
		
		//remove by index
//		names.remove(2);
		names.remove("Wolverine");
		for(int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		

		System.out.println();
		System.out.println();


		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");
		
		boolean hasWolverine = names.contains("Wolverine");
		
		System.out.println("Wolverine is in list: " + hasWolverine);
		
		System.out.println();
		System.out.println();


		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");
		
		// where is wolverine?
		int wolverineIndex = names.indexOf("Wolverine");
		System.out.println("Wolverine was found at index: " + wolverineIndex);
		
		System.out.println();
		System.out.println();


		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");
		
		String[] namesArray = names.toArray(new String[names.size()]);
		
		System.out.println("Looping through the array, NOT the list:");
		for(int i = 0; i < namesArray.length; i++)
		{
			System.out.println(namesArray[i]);
		}
		

		System.out.println();
		System.out.println();
		


		
		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");
		
		names.sort(null);
		for(int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		

		System.out.println();
		System.out.println();
		
	


		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");
		
		// Collections is a class
		// that has a library of common functions
		// that work with lists
		Collections.reverse(names);
		for(int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		

		System.out.println();
		System.out.println();


		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();
		
		for(int i = 0; i < names.size(); i++)
		{
			String name = names.get(i);
			System.out.println(name);
		}

		// foreach loop -> for each String in the names list
		for(String name: names)
		{
			System.out.print(name + " ");
		}
		
	}
}
