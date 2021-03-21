package com.techelevator.models;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.techelevator.models.products.Product;

/**
 * Responsibilities:
 *      Add product to cart
 *      Calculate the cart total price
 * 
 * Dependencies:
 *      Product
 */
public class ShoppingCart 
{
	Map<Product, Integer> cart = new HashMap<Product, Integer>();
	
	public void add(Product product)
	{
		// add product or update quantity
		cart.put(product, 1);
	}
	
	public BigDecimal getCartTotal()
	{
		return BigDecimal.ONE;
	}
    
}
