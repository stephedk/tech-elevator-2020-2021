package com.techelevator.models.Products;

import java.math.BigDecimal;

public class Products {

	private String slotID;
	private BigDecimal price;
	private int stock = 5;
	private String productName;
	private String productType;

	public Products(String slotID, BigDecimal price, String productName, String productType) {
		super();
		this.slotID = slotID;
		this.price = price;
		this.productName = productName;
		this.productType = productType;
	}

	public String getSlotID() {
		return slotID;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public String getProductName() {
		return productName;
	}

	public String getProductType() {
		return productType;
	}

	@Override
	public String toString() {
		return slotID + " - " + productName + " - $" + price + " Quantity: " + stock;
	}

	public void stockPurchase(int stock) {
		if (stock > 0) {
			stock -= 1;
		}
	}

	public void getSound() {
		
	}

}
