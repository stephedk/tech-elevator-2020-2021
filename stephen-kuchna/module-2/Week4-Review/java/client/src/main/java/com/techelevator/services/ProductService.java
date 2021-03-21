package com.techelevator.services;

import org.springframework.web.client.RestTemplate;

public class ProductService
{

	private String BASE_URL;
	private RestTemplate restTemplate = new RestTemplate();

	public ProductService(String url)
	{
		this.BASE_URL = url;
	}
}
