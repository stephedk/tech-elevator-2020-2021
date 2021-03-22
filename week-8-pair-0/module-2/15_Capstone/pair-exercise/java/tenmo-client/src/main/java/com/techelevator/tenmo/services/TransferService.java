package com.techelevator.tenmo.services;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Scanner;

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
import com.techelevator.tenmo.models.Transfer;
import com.techelevator.tenmo.models.User;;

public class TransferService {
	
	private String BASE_URL;
    private RestTemplate restTemplate = new RestTemplate();
    private AuthenticatedUser currentUser; 
    
    public TransferService(String url, AuthenticatedUser currentUser) {
    	this.BASE_URL = url + "transfer"; 
    	this.currentUser = currentUser; 
    }
    
    private HttpEntity<Transfer> makeAuthEntity(Transfer transfer) {
    	
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    headers.setBearerAuth(currentUser.getToken());
	    return  new HttpEntity<Transfer>(transfer, headers);
	    
}
    
    public void sendBucks(Transfer transfer) {
    	Integer transferId = transfer.getTransferId();
    	
    	restTemplate.put(BASE_URL + "/{transferId}", makeAuthEntity(transfer));
		
    }
	
	  
    
		
    private void requestBucks() {
		// TODO Auto-generated method stub
		
	}
}
