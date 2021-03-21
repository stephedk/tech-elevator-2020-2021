package com.techelevator;

public class Program 
{
	private static final int MONDAY = 1;
	private static final int TUESDAY = 2;
	private static final int WEDNESDAY = 3;
	private static final int THURSDAY = 4;
	private static final int FRIDAY = 5;
	private static final int SATURDAY = 6;
	private static final int SUNDAY = 7;
	
	
	public static void main(String[] args)
	{	
		// check if I can eat out on Wednesday with $25
		boolean canEatOut = canIEatOut(WEDNESDAY, 25);				
		System.out.println("I am eating out: " + canEatOut);
		
		
		// Simple check to where I should eat on Tuesday if I have money
		String whereToEat = whereCanIEatSimple(TUESDAY, true);		
		System.out.println("I am eating at " + whereToEat);
		
		// More complete check to where I should eat
		// if I have $25
		whereToEat = whereCanIEat(TUESDAY, 25);
		System.out.println("I am eating at " + whereToEat);
		
		
	}	
	
	public static boolean canIEatOut(int dayOfWeek, int moneyInWallet)
	{		
		boolean isTodayMonday = dayOfWeek == MONDAY;
		boolean hasEnoughMoney = moneyInWallet > 20;
		boolean canEatOut = isTodayMonday && hasEnoughMoney;
		
		return canEatOut;		
	}
	

	// this example checks what day it is
	// and if I have money
	// If it is Tuesday, I should have tacos
	// If it is Wednseday, I should have pizza
	// but ONLY if I have money
	// Otherwise I'm eating at home
	public static String whereCanIEatSimple(int dayOfWeek, boolean hasMoney)
	{
		// test this first
		// if I don't have money, there is no need to check anything else
		if(!hasMoney)
		{
			return "Home";
		}
		
		
		if(dayOfWeek == TUESDAY)
		{
			return "Costa Vida";
		}
		else if(dayOfWeek == WEDNESDAY)
		{
			return "Papa John's Pizza";
		}
		else
		{		
			return "Home";
		}
	}
	
	// this example checks what day it is
	// and depending on how much money I have...
	// If it is Tuesday, 
	// 		if I have more than $20 I eat at Costa Vida
	//      if I have between 5 and 20 I eat at Taco Bell
	// Otherwise I'm eating at home
	public static String whereCanIEat(int dayOfWeek, int moneyInWallet)
	{
		String location; 
		
		if(dayOfWeek == TUESDAY)
		{
			if(moneyInWallet > 20)
			{
				location = "Costa Vida";
			}
			else if(moneyInWallet > 5)
			{
				location = "Taco Bell";
			}
			else
			{
				location = "home";
			}
		}
		else
		{
			location = "Home";
		}
		
		return location;
	}
	
	
	// Here is another option of the above example	
	public static String whereCanIEat_option2(int dayOfWeek, int moneyInWallet)
	{
		String location; 
		
		if(dayOfWeek == TUESDAY && moneyInWallet > 20)
		{
			location = "Costa Vida";
		}
		else if (dayOfWeek == TUESDAY && moneyInWallet > 5)
		{
			location = "Taco Bell";
		}
		else
		{
			location = "Home";
		}
		
		return location;
	}

}
