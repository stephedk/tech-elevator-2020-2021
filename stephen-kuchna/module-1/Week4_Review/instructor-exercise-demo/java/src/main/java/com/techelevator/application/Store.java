package com.techelevator.application;

import java.math.BigDecimal;

import com.techelevator.models.CashRegister;
import com.techelevator.models.Inventory;
import com.techelevator.models.ShoppingCart;
import com.techelevator.models.file_io.Logger;
import com.techelevator.models.products.Product;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

/**
 * The store class is the main application.
 * 
 * Responsibilities:
 *      manage the flow of the application
 * 
 * Dependencies:
 *      Inventory
 *      ShoppingCart
 *      CashRegister
 * 
 *      UI:
 *      UserInput
 *      UserOutput
 * 
 *      Utility:
 *      Logger - used to log errors and transactions
 */
public class Store 
{	
	private Inventory inventory = new Inventory();
    private ShoppingCart shoppingCart = new ShoppingCart();

    private Logger errorLogger = new Logger("errors");
    
	
    public void run()
    {

        while(true)
        {
            // display main menu - get their selection
            String option = UserInput.getHomeScreenOption();            

            if(option.equals("add"))
            {
                // do add item task
            	addToCart();
            }
            else if(option.equals("pay"))
            {
                // go to cash register to check out
            	checkOut();
                break;
            }
            else if(option.equals("cart"))
            {
            	// display the cart
            	showCart();
            }
            else if(option.equals("quit"))
            {
            	break;
            }
            else
            {
                // invalid option try again
            }

        }

    }
    
    public void addToCart()
    {
    	// show the products
    	UserOutput.displayInventory(inventory);
    	
    	// prompt for input
    	String productId = UserInput.getSelectedProduct();
    	
    	// find the product based on the id
    	Product product = null;
    	for (Product p : inventory.getProducts())
		{
			if(p.getId().equals(productId))
			{
				product = p;
				break;
			}
		}
    	
    	// add that product to the cart
        shoppingCart.add(product);
        
    }
    
    public void showCart()
    {
    	// use the UserOutput to display the products in the ShoppingCart
    }
    
    public void checkOut()
    {
        // User the UserOutput to display the products in the ShoppingCart
        // then prompt the user for payment


        BigDecimal paymentAmount = new BigDecimal("0"); // get the value from user input
        try
        {
            CashRegister.pay(shoppingCart, paymentAmount);
        }
        catch(Exception ex)
        {
            // Log the error message to file
            // to implement this you need to open the Logger.java file
            // and complete the logMessage function
            errorLogger.logMessage(ex.getMessage());
        }
    }
}
