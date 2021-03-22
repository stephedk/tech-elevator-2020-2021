package com.techelevator.application;

import com.techelevator.ui.Logger;

import java.math.BigDecimal;
import java.util.Scanner;
import com.techelevator.models.InventoryReader;
import com.techelevator.models.Products.Inventory;
import com.techelevator.models.Products.Products;
import com.techelevator.models.Products.Transaction;
import com.techelevator.ui.UserOutput;

public class VendingMachine {
	private Logger errorLogger = new Logger("errors");
	private Logger activityLogger = new Logger("logs");

	public void run() {

		UserOutput userOutput = new UserOutput();
		Inventory inventory = new Inventory();
		Transaction transaction = new Transaction();

		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Please choose an option");		

		while (true) {
			userOutput.displayMainMenu();
			
			System.out.print("Please choose an option: ");
			String choice = inputScanner.nextLine();
			
			if (choice.trim().equals("1")) {
				userOutput.displayMenuItems(inventory);
				
			} else if (choice.trim().equals("2")) {
				userOutput.displayPurchaseChoice();
				System.out.print("Please choose an option: ");
				String purchaseChoice = inputScanner.nextLine();
				
				if (purchaseChoice.trim().equals("1")) {
					System.out.print("How many dollars would you like to insert: ");
					String moneyInput = inputScanner.nextLine();
					transaction.feedMoney(moneyInput.trim());
					// need error handling for incorrect input
				} else if (purchaseChoice.trim().equals("2")) {
					System.out.print("What is the slot value of the item being purchased: ");
					String idInput = inputScanner.nextLine();
//					inventory.getProductById(idInput);
					transaction.selectProduct(idInput.trim());
					// need error handling for if incorrect input
				} else if (purchaseChoice.trim().equals("3")) {
					transaction.finishTransaction();
					break;
				} else {
					System.out.println("Sorry that is an incorrect option!");
				}
			} else if (choice.trim().equals("3")) {
				System.out.println("Thank you for visiting the Vendo-Matic 800");
				break;
			}  else {
				System.out.println("Sorry that is an incorrect option!");
			}
		}
		inputScanner.close();
	}

}
