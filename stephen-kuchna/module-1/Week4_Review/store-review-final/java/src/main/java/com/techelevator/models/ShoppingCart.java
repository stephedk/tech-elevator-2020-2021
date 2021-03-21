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
		if(cart.containsKey(product))
		{
			// update the quantity
			int quantity = cart.get(product);
			quantity++;
			cart.put(product, quantity);
		}
		else
		{
			// not in cart - so just add it
			cart.put(product, 1);
		}
	}
	
	public BigDecimal getCartTotal()
	{
		BigDecimal total = BigDecimal.ZERO;

		for(Map.Entry<Product, Integer> entry: cart.entrySet())
		{
			Product product = entry.getKey();
			int quantity = entry.getValue();
			BigDecimal multiplier = new BigDecimal(quantity);
			BigDecimal price = product.getPrice();
			BigDecimal lineTotal = price.multiply(multiplier);

			total = total.add(lineTotal);
		}
		return total;
	}

	public Map<Product, Integer> getProducts()
	{
		return cart;
	}

	
    
}
