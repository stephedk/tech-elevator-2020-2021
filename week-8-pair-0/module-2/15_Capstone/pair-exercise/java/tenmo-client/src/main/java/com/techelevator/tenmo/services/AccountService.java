package com.techelevator.tenmo.services;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import com.techelevator.tenmo.models.AuthenticatedUser;
import com.techelevator.tenmo.models.UserCredentials;
import com.techelevator.tenmo.models.Account;

public class AccountService {

	 	private String BASE_URL;
	    private RestTemplate restTemplate = new RestTemplate();
	    private AuthenticatedUser currentUser; 

	    public AccountService(String url, AuthenticatedUser currentUser) {
	    	this.currentUser = currentUser; 
	        this.BASE_URL = url;
	    }

//	  

	    public BigDecimal getBalance() {
			BigDecimal balance = new BigDecimal(0);
			try {
				balance = restTemplate.exchange(BASE_URL + "balance/" + currentUser.getUser().getId(), 
										HttpMethod.GET, makeAuthEntity(), BigDecimal.class).getBody();
				System.out.println("Your current balance is: $" + balance);
			} catch (RestClientException e) {
				System.out.println("Error retrieving balance");
			}
			return balance;
		}
		
		  private HttpEntity makeAuthEntity() {
			    HttpHeaders headers = new HttpHeaders();
			    headers.setBearerAuth(currentUser.getToken());
			    HttpEntity entity = new HttpEntity<>(headers);
			    return entity;
		}
	    
}
