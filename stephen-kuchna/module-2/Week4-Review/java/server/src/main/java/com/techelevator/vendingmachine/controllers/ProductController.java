package com.techelevator.vendingmachine.controllers;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.vendingmachine.models.Product;

@RestController
public class ProductController
{
	@GetMapping("/products/{id}")
    public Product get(@PathVariable int id)
    {
    	Product product = new Product();
    	product.setId(id);
    	product.setName("Sunfried crisps");
    	product.setPrice(new BigDecimal(1.25));
    	product.setQuantity(5);
    	product.setSlot("A1");
    	product.setType("Chips");
    	
    	return product;
    }
}
