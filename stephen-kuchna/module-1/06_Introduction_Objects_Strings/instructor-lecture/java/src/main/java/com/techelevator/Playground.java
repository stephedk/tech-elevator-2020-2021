package com.techelevator;

public class Playground
{
	
	public static void main(String[] args)
	{
		// create new strings as separate objects
		String name1 = new String("Gregor");
		String name2 = new String("Gregor");
		
		// strings are not equal
		// because == determines if the 2 strings
		// live at the same address
		boolean areEqual = name1 == name2;		
		System.out.println("name1 == name2: " + areEqual);
		
		// the built in equals function compares the 
		// value of the strings for equality
		boolean haveSameValue = name1.equals(name2);
		System.out.println("name1.equlas(name2): " + haveSameValue);
		
		// equalsIgnoreCase compares 2 strings
		// iven if they use different upper and lower case
		haveSameValue = name1.equalsIgnoreCase(name2);
		
		
		// a string stores it's letters in an array
		// so use what you know about an array
		// to work with strings
		int[] numbers = new int[] {1,2,3,4,5};
		
		// get the first element of an array
		int first = numbers[0];
		// get the first letter of a string
		char firstLetter = name1.charAt(0);
		
		// loop through all letters of a string
		for (int i = 0; i < name1.length(); i++)
		{
			System.out.println(name1.charAt(i));
		}
		
		// Strings are immutable - they cannot change
		// whenever we add on to a string
		// we are actually creating a new string
		// not modifying the current one
		name1 += " ";
		name1 += "Dzierzon";
		System.out.println(name1);
		
		
		// when comparing hard  coded literal 
		// values 2 strings are equal
		// because of how java works with string literals
		String name3 = "Gregor";
		String name4 = "Gregor";
		
		// even though this works
		// with hard-coded strings
		areEqual = name3 == name4;
		// you should always compare 
		// with the equals function
		areEqual = name3.equals(name4);
	
		
		System.out.println("Name 3 = Name 4: " + areEqual);
	}

}
