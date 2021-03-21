package com.techelevator.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import com.techelevator.model.CatPic;


@Component
public class RestCatPicService implements CatPicService {

	
	public static final String API_URL = "https://random-cat-image.herokuapp.com/";

	public RestTemplate restTemplate = new RestTemplate();
	
	
	@Override
	public CatPic getPic() {
		CatPic cats = null; 
		try {
			
			cats = restTemplate.getForObject(API_URL, CatPic.class); 
			} catch (RestClientResponseException ex) {
				
				System.out.println("We're sorry, we couldn't find any cats");
				
			} catch (ResourceAccessException ex) {
				
				System.out.println("A network error occured");
				
			}
		return cats; 
		
//		RestTemplate restTemplate = new RestTemplate(); 
//		Responseresponse = restTemplate.getForObject("https://random-cat-image.herokuapp.com", CatPic.class); 
//		
		
	}

}	

//public Auction[] listAllAuctions() {
//	Auction[] auctions = null;
//	try {
//		auctions = restTemplate.getForObject(API_URL, Auction[].class);
//	} catch (RestClientResponseException ex) {
//		console.printError("Could not retrieve the auctions. Is the server running?");
//	} catch (ResourceAccessException ex) {
//		console.printError("A network error occurred.");
//	}
//	return auctions;
//}