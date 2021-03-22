package com.techelevator.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techelevator.models.Products.Products;
import com.techelevator.application.VendingMachine;

public class InventoryReader {

	public List<Products> getProductInfo() {

		List<Products> productList = new ArrayList<Products>();

		File productFile = new File("vendingmachine.csv");

		try (Scanner productScanner = new Scanner(productFile)) {
			while (productScanner.hasNext()) {
				String productInfo = productScanner.nextLine();
				String[] item = productInfo.split("\\|");

				String slotID = item[0];
				String productName = item[1];
				BigDecimal price = new BigDecimal(item[2]);
				String productType = item[3];

				Products product = new Products(slotID, price, productName, productType);

				productList.add(product);

			}
			productScanner.close();

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}

		return productList;

	}

}
