package com.techelevator.ui;

import com.techelevator.models.Inventory;
import com.techelevator.models.products.Product;

/**
 * Responsibilities:
 *      This class should handle formatting and displaying ALL messages to the user
 * 
 * Dependencies:
 *      None
 */
public class UserOutput 
{
	
	public static void displayInventory(Inventory inventory)
	{
		System.out.println();
		System.out.println("*****************");
		System.out.println("    Products");
		System.out.println("*****************");
		System.out.println();
		
		for(Product product: inventory.getProducts())
		{
			System.out.println(product.toString());
		}
		System.out.println();
		
	}
    
}
