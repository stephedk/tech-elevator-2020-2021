package com.techelevator;

import java.math.BigDecimal;

public class FlowerShopOrder
{
	// private variables
	private String bouquetType;
	private int numberOfRoses;
	
	// constructor
	public FlowerShopOrder(String bouquetType, int numberOfRoses)
	{
		this.bouquetType = bouquetType;
		this.numberOfRoses = numberOfRoses;
	}
	
	// getters
	public String getBouquetType()
	{
		return bouquetType;
	}
	public int getNumberOfRoses()
	{
		return numberOfRoses;
	}
	
	// derived properties
	public BigDecimal getSubTotal()
	{		
		BigDecimal subTotal = new BigDecimal("19.99");
		BigDecimal rosePrice = new BigDecimal("2.99");
				
		BigDecimal numberRoses = new BigDecimal(numberOfRoses);
		rosePrice = rosePrice.multiply(numberRoses);
		subTotal = subTotal.add(rosePrice);
		
		return subTotal;
	}
	
	// methods
	public BigDecimal calculateDelivery(boolean isSameDay, String zipCode)
	{
		BigDecimal delivery;
		
		try
		{
						
			int zipNumber = Integer.parseInt(zipCode);
	
			// 10000 - 19999 free
			// 20000 - 29999 3.99
			if(zipNumber >= 10000 && zipNumber <= 19999)
			{
				delivery = new BigDecimal("0");
			}
			else if(zipNumber >= 20000 && zipNumber <= 29999)
			{
				delivery = new BigDecimal("3.99");
			}
			else if(zipNumber >= 30000 && zipNumber <= 39999)
			{
				delivery = new BigDecimal("6.99");
			}
			else 
			{
				delivery = new BigDecimal("19.99");
			}

		} 
		catch (Exception e)
		{
			// TODO: handle exception
			//System.out.println(e.getMessage());
			delivery = new BigDecimal("19.99");
		}		
		
		return delivery;
	}
	
	@Override
	public String toString()
	{
		return "ORDER - " + getBouquetType() + " - " + getNumberOfRoses() + " roses - $" + getSubTotal();
	}
}
