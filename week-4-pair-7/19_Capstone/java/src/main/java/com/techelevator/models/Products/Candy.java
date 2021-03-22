package com.techelevator.models.Products;

import java.math.BigDecimal;

public class Candy extends Products
{

	public Candy(String slotID, BigDecimal price, String productName, String productType) {
		super(slotID, price, productName, productType);
	}
	
	public void getSound() {
	System.out.println("Munch Munch, Yum!");
	}
	
}
