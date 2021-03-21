package com.techelevator.ui;

import java.math.BigDecimal;
import java.util.Map;

import javax.sound.sampled.SourceDataLine;

import com.techelevator.models.Inventory;
import com.techelevator.models.ShoppingCart;
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
	public static void clearScreen() {  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
	}

	public static void displayMessage(String message)
	{
		System.out.println();
		System.out.println(message);
		System.out.println();
	}

	public static void displayHomeScreen()
	{
		clearScreen();
		
		System.out.println();
		System.out.println("***************************************************");
		System.out.println("                      Home");
		System.out.println("***************************************************");
		System.out.println();
	}
	
	public static void displayInventory(Inventory inventory)
	{
		clearScreen();

		System.out.println();
		System.out.println("***************************************************");
		System.out.println("                    Products");
		System.out.println("***************************************************");
		System.out.println();
		
		for(Product product: inventory.getProducts())
		{
			System.out.println(product.toString());
		}
		System.out.println();
		
	}

	public static void displayShoppingCart(ShoppingCart shoppingCart)
	{
		clearScreen();
		
		System.out.println();
		System.out.println("***************************************************");
		System.out.println("                      Cart");
		System.out.println("***************************************************");
		System.out.println();

		Map<Product, Integer> productMap = shoppingCart.getProducts();
		
		for(Map.Entry<Product, Integer> entry: productMap.entrySet())
		{
			Product product = entry.getKey();
			int quantity = entry.getValue();
			BigDecimal multiplier = new BigDecimal(quantity);

			String id = product.getId();
			String name = product.getName();
			BigDecimal price = product.getPrice();
			BigDecimal lineTotal = price.multiply(multiplier);

			String line = String.format("%-6s %-35s $ %6.2f     %-5d $ %10.2f", id, name, price, quantity, lineTotal);

			System.out.println(line);
		}

		System.out.println("--------------------------------------------------------------------------");
		System.out.println(String.format("%-61s $ %10.2f", "Cart Total", shoppingCart.getCartTotal()));

		System.out.println();
	}
    
}
