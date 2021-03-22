package com.techelevator.models.Products;

import java.math.BigDecimal;

public class Transaction extends Inventory {

	private int dollars;
	public BigDecimal cost;
	public BigDecimal total;
	public BigDecimal itemPrice;

	public void feedMoney(String moneyInput) {
		Integer moneyIn = Integer.parseInt(moneyInput);
		dollars += moneyIn;
		System.out.println("Current Money Provided: " + dollars);
	}
	
	public void selectProduct(String productId) {
		
		System.out.println(getProductById(productId).getPrice());

		
//		Inventory purchaseProduct = new Inventory();
//		BigDecimal itemPrice = new BigDecimal(0);
//		itemPrice.add(getProductById(productId).getPrice());
//		total.add(getProductById(productId).getPrice());
//		total.add(itemPrice);
//		System.out.println(total);
//		purchaseProduct.getProductById(productId).getSound();

		// Still need to update quantity and total
	}

	public void finishTransaction() {
		BigDecimal paidAmount = new BigDecimal(dollars);
		cost.add(total);

		BigDecimal toOnehundred = new BigDecimal(100);
		BigDecimal change = paidAmount.subtract(cost);

		BigDecimal totalToInt = change.multiply(toOnehundred);
		int totalToChange = totalToInt.intValue();
		int quarters = totalToChange / 25;
		int dimes = (totalToChange % 25) / 10;
		int nickels = ((totalToChange % 25) % 10) / 5;

		System.out.println("Your change is " + quarters + " quarter(s), " + dimes + " dime(s) and, " + nickels + " nickel(s). Thank you!");
	}

}
