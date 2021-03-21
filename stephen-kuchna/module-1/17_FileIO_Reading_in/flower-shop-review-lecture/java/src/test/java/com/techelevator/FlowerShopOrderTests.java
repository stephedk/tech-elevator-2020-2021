package com.techelevator;

import java.math.BigDecimal;

import org.junit.Assert;

import org.junit.Test;


public class FlowerShopOrderTests
{

	@Test
	public void constructor_createsCorrectBouquetName()
	{
		// arrange
		String expected = "standard";
		// act
		FlowerShopOrder order = new FlowerShopOrder("standard", 0);
		String actual = order.getBouquetType();
				
		//assert
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getSubTotal_returns1999_forNoRoses()
	{
		// arrange
		FlowerShopOrder order = new FlowerShopOrder("standard", 0);
		BigDecimal expected = new BigDecimal("19.99");
		
		// act
		BigDecimal actual = order.getSubTotal();
				
		//assert
		Assert.assertEquals("because bouquets with no roses have a standard price of 19.99",expected, actual);
		
	}
	
	@Test
	public void getSubTotal_returns2298_forOneRose()
	{
		// arrange
		FlowerShopOrder order = new FlowerShopOrder("one roser", 1);
		BigDecimal expected = new BigDecimal("22.98");
		
		// act
		BigDecimal actual = order.getSubTotal();
				
		//assert
		Assert.assertEquals("because bouquets with one rose adds 2.99 to the standard 19.99",expected, actual);
		
	}
	
	@Test
	public void getSubTotal_returns31899_forOneHundredRose()
	{
		// arrange
		FlowerShopOrder order = new FlowerShopOrder("massive apology", 100);
		BigDecimal expected = new BigDecimal("318.99");
		
		// act
		BigDecimal actual = order.getSubTotal();
				
		//assert
		Assert.assertEquals("because 100 roses cost $299",expected, actual);
		
	}	

	
	@Test
	public void toString_returnsTheCorretFormat()
	{
		// arrange
		FlowerShopOrder order = new FlowerShopOrder("massive apology", 100);
		String expected = "ORDER - massive apology - 100 roses - $318.99";
		
		// act
		String actual = order.toString();
				
		//assert
		Assert.assertEquals(expected, actual);
		
	}

	
	@Test
	public void calculateDelivery_waivesFee_for10000_19999ZipCodes()
	{
		// arrange
		FlowerShopOrder order = new FlowerShopOrder("standard", 0);
		boolean isSameDay = false;
		String zipCode = "10000";
		
		BigDecimal expected = new BigDecimal(0);
		
		// act
		BigDecimal actual = order.calculateDelivery(isSameDay, zipCode);
				
		//assert
		Assert.assertEquals("because close deliveries are free",expected, actual);
		
	}

	
	@Test
	public void calculateDelivery_is399_for20000_29999ZipCodes()
	{
		// arrange
		FlowerShopOrder order = new FlowerShopOrder("standard", 0);
		boolean isSameDay = false;
		String zipCode = "20000";
		
		BigDecimal expected = new BigDecimal("3.99");
		
		// act
		BigDecimal actual = order.calculateDelivery(isSameDay, zipCode);
				
		//assert
		Assert.assertEquals("because 1 area distance delivery is 3.99", expected, actual);
		
	}

	
	@Test
	public void calculateDelivery_charges1999_forInvalidZipCode()
	{
		// arrange
		FlowerShopOrder order = new FlowerShopOrder("standard", 0);
		boolean isSameDay = false;
		String zipCode = "axb123";
		
		BigDecimal expected = new BigDecimal("19.99");
		
		// act
		BigDecimal actual = order.calculateDelivery(isSameDay, zipCode);
				
		//assert
		Assert.assertEquals("because invalid zip codes should default to the max price", expected, actual);
		
	}

}
