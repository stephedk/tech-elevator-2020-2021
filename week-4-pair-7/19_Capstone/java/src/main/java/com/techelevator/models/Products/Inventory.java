package com.techelevator.models.Products;

import java.util.ArrayList;
import java.util.List;

import com.techelevator.models.InventoryReader;

public class Inventory {
	Products product = null;

	private List<Products> products = new ArrayList<Products>();

	public Inventory() {
		loadInventory();
	}

	private void loadInventory() {
		InventoryReader loader = new InventoryReader();
		products = loader.getProductInfo();
	}

	public List<Products> getProducts() {
		return products;
	}

	public Products getProductById(String productId) {

		if (productId != null) {
			for (Products p : products) {
				if (p.getSlotID().equals(productId)) {
					product = p;
					break;
				}
			}
		}

		return product;
	}

}
