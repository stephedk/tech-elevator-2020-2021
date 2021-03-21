package com.techelevator.services;

import java.io.Console;

import org.springframework.stereotype.Component;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import com.techelevator.model.CatFact;
import com.techelevator.model.CatPic;

@Component
public class RestCatFactService implements CatFactService {

	public static final String API_URL_2 = "https://cat-fact.herokuapp.com/facts/random ";

	public RestTemplate restTemplate = new RestTemplate();
	
	
	@Override
	public CatFact getFact() {
		
		CatFact cats = null; 
		try {
			
			cats = restTemplate.getForObject(API_URL_2, CatFact.class); 
			} catch (RestClientResponseException ex) {
				
				System.out.println("We're sorry, we couldn't find any cats");
				
			} catch (ResourceAccessException ex) {
				
				System.out.println("A network error occured");
				
			}
		return cats; 
		
	
	}

}
