package com.techelevator.models.Products;

import java.math.BigDecimal;

public class Chip extends Products 
{
	public Chip(String slotID, BigDecimal price, String productName, String productType) {
		super(slotID, price, productName, productType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getSound() {
	System.out.println("Crunch Crunch, Yum!");
	}
}
