package com.techelevator.models.Products;

import java.math.BigDecimal;

public class Drink extends Products
{
	public Drink(String slotID, BigDecimal price, String productName, String productType) {
		super(slotID, price, productName, productType);
	}

	public void getSound() {
		System.out.println("Glug Glug, Yum!");
	}
	
}
