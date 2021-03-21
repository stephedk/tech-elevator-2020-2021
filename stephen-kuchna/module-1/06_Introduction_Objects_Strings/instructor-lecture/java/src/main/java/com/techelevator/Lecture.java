package com.techelevator;

import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal */
		String name = "Gregor Dzierzon";
		
		String firstName = name.substring(0,6);
		System.out.println(firstName);
		
		String lastName = name.substring(7);
		System.out.println(lastName);
		
		
		// getting input from a user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your first and lastName: ");
		
		// you don't know how long the first 
		// and last names are
		name = scanner.nextLine();	
		System.out.println("Full Name: " + name);
		
		// use indexof() to find the space
		// then use the index to determine where 
		// to use the substring
		int index = name.indexOf(" ");
		System.out.println("Space found at " + index);
		
		firstName = name.substring(0, index);
		System.out.println("First Name: " + firstName);
		
		lastName = name.substring(index + 2);
		System.out.println("Last Name: " + lastName);
		


		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */


	}
}
