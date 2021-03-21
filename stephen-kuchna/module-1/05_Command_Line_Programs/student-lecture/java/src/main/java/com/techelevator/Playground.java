package com.techelevator;

import java.util.Scanner;

public class Playground 
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the child's name:");
		String name = scanner.nextLine();
		
		System.out.print("Please entr your age: ");
		String ageInput = scanner.nextLine();
		int age = Integer.parseInt(ageInput);
		
		String ageGroup;
		ageGroup = determineAgeGroup(age);
		
		System.out.println("Name: " + name);
		System.out.println("Age group: " + ageGroup);
		
	}
		
	public static String determineAgeGroup(int age)
	{
		String nameOfAgeGroup;
		
		if(age < 10) 
		{
			nameOfAgeGroup = "too young to play";
		}
		else if(age <= 11)
		{
			nameOfAgeGroup = "mighty mites";
		}
		else if(age <= 13)
		{
			nameOfAgeGroup = "bantam";
		}
		else if(age <= 15)
		{
			nameOfAgeGroup = "junior";
		}
		else 
		{
			nameOfAgeGroup = "too old to play";
		}
	
		return nameOfAgeGroup;
	}
}
