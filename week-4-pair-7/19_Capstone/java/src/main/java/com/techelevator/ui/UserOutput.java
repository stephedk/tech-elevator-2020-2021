package com.techelevator.ui;

import com.techelevator.models.Products.Inventory;
import com.techelevator.models.Products.Products;

public class UserOutput {
	
	public static void clearScreen() {  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
	}
	
	public void displayMainMenu()
	{
		clearScreen();
		
		System.out.println();
		System.out.println("***************************************************");
		System.out.println("               Vendo-Matic 800" );
		System.out.println("***************************************************");
		System.out.println();
		System.out.println("      (1) Display Vending Machine Items" );
		System.out.println("                (2) Purchase");
		System.out.println("                  (3) Exit");
		System.out.println();
		System.out.println("**************************************************");
		
		
	
	}
	
	public void displayPurchaseChoice()
	{
		clearScreen();
		System.out.println();
		System.out.println("***************************************************");
		System.out.println("              (1) Feed Money");
		System.out.println("            (2) Select Product");
		System.out.println("          (3) Finish Transaction");
		System.out.println("***************************************************");
	}
	
	public void displayMenuItems(Inventory inventory)
	{
		clearScreen();
		System.out.println();
		clearScreen();

		System.out.println();
		System.out.println("***************************************************");
		System.out.println("                    Menu");
		System.out.println("***************************************************");
		System.out.println();
		
		for(Products products: inventory.getProducts())
		{
			System.out.println(products.toString());
		}
		System.out.println();
	}
}
