package com.techelevator;

import com.techelevator.application.VendingMachine;
import com.techelevator.models.InventoryReader;
import com.techelevator.models.Products.Inventory;
import com.techelevator.models.Products.Products;
import com.techelevator.ui.UserOutput;

public class Program 
{
    public static void main(String[] args) 
    {
        VendingMachine vendingMachine = new VendingMachine();
////    	InventoryReader runInventory = new InventoryReader();
//    	Inventory inventory = new Inventory();
//    	UserOutput display = new UserOutput();
//    	display.displayMenuItems(inventory);
////    	System.out.println(display.displayMenuItems(inventory));
        vendingMachine.run();
        
    }
    
//    public static void display(Inventory inventory) {
//		for(Products product: inventory.getProducts())
//		{
//			System.out.println(product.toString());
//		}
//		System.out.println();
//    }
    
}
