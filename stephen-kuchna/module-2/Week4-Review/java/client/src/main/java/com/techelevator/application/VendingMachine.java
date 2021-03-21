package com.techelevator.application;

import com.techelevator.services.AuthenticationService;
import com.techelevator.services.ProductService;

public class VendingMachine
{
    AuthenticationService authenticationService;
    ProductService productService;
    
    public VendingMachine(String baseUrl)
    {
    	authenticationService = new AuthenticationService(baseUrl);
    	productService = new ProductService(baseUrl);
    }

    public void run()
    {
    	 int menuSelection;

         while (true) 
         {             
             // Ensure loop continues until the user quits the application
             menuSelection = 999;
         }
    }
    
}
