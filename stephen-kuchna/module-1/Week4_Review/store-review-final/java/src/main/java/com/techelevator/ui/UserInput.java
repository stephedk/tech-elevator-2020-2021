package com.techelevator.ui;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Responsibilities:
 *      This class should handle receiving ALL input from the User
 * 
 * Dependencies:
 *      None
 */
public class UserInput 
{
	private static Scanner scanner = new Scanner(System.in);
	
	public static String getHomeScreenOption()
	{
		System.out.println("What would you like to do?");
		System.out.println();

		System.out.println("a) Add Product to Cart");
		System.out.println("b) View Cart");
		System.out.println("c) Check Out");
		System.out.println("d) Quit");
		
		System.out.println();
		System.out.print("Please select an option: ");
		
		String selectedOption = scanner.nextLine();
		String option = selectedOption.trim().toLowerCase();
		
		if(option.equals("a"))
		{
			return "add";
		}
		else if(option.equals("b"))
		{
			return "cart";
		}
		else if(option.equals("c"))
		{
			return "pay";
		}
		else if(option.equals("d"))
		{
			return "quit";
		}
		else
		{
			return "";
		}
		
	}
  
	public static String getSelectedProduct()
	{
		System.out.print("Enter the product id: ");
		String productId = scanner.nextLine();
		
		return productId.toUpperCase().trim();
	}

	public static void waitForEnter()
	{
		System.out.print("Press enter to continue...");
		scanner.nextLine();
	}

	public static BigDecimal getCash()
	{
		System.out.print("Enter the payment amount: ");
		String payment = scanner.nextLine().trim();
		BigDecimal paymentAmount = new BigDecimal(payment);

		return paymentAmount;
	}
}
