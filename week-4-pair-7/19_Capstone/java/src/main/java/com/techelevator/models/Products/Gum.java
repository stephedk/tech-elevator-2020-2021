package com.techelevator.models.Products;

import java.math.BigDecimal;

public class Gum extends Products
{
	public Gum(String slotID, BigDecimal price, String productName, String productType) {
		super(slotID, price, productName, productType);
	}

	public void getSound() {
	System.out.println("Chew Chew, Yum!");
	}
	
}
