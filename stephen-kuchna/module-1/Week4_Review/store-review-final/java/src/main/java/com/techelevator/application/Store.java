package com.techelevator.application;

import java.math.BigDecimal;

import com.techelevator.models.CashRegister;
import com.techelevator.models.Inventory;
import com.techelevator.models.ShoppingCart;
import com.techelevator.models.exceptions.InsuficientFundsException;
import com.techelevator.models.file_io.FileReceiptPrinter;
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
    private Logger activityLogger = new Logger("logs");
    
	
    public void run()
    {

        while(true)
        {
            // display main menu - get their selection
            UserOutput.displayHomeScreen();
            String option = UserInput.getHomeScreenOption();            

            if(option.equals("add"))
            {
                // do add item task
            	addToCart();
            }
            else if(option.equals("pay"))
            {
                // go to cash register to check out
                boolean isCheckedOut = checkOut();
                if(isCheckedOut)
                {
                    break;
                }
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
                UserOutput.displayMessage("You selected an invalid option:");
            }

            UserInput.waitForEnter();

        }

        UserOutput.clearScreen();
        UserOutput.displayMessage("Thank you! Come again!");

    }
    
    public void addToCart()
    {
    	// show the products
    	UserOutput.displayInventory(inventory);
    	
    	// prompt for input
    	String productId = UserInput.getSelectedProduct();
    	
    	// find the product based on the id
    	Product product = inventory.getProductById(productId);
                
        
        // add that product to the cart
        if(product != null)
        {
            shoppingCart.add(product);
            activityLogger.logMessage("Added to cart: " + product);
            
            UserOutput.displayMessage(product.getName() + " has been added to your cart.");
        }
        else
        {
            UserOutput.displayMessage("Product id [" + productId + "] is invalid");
        }
    }
    
    public void showCart()
    {
        // use the UserOutput to display the products in the ShoppingCart
        // need to call a function in UserOutput.displayShoppingCart
        UserOutput.displayShoppingCart(shoppingCart);
    }
    
    public boolean checkOut()
    {
        // User the UserOutput to display the products in the ShoppingCart
        // then prompt the user for payment
        UserOutput.displayShoppingCart(shoppingCart);

        try
        {
            BigDecimal paymentAmount = UserInput.getCash();
            BigDecimal change = CashRegister.pay(shoppingCart, paymentAmount);

            UserOutput.displayMessage("Your change is: $" + change);

            FileReceiptPrinter receipt = new FileReceiptPrinter();
            receipt.createReceipt(shoppingCart, paymentAmount, change);

            UserInput.waitForEnter();
        }
        catch(InsuficientFundsException ex)
        {
            UserOutput.displayMessage("You did not enter enough money to pay for your cart.");
            errorLogger.logMessage(ex.getMessage());
            return false;
        }
        catch(Exception ex)
        {
            UserOutput.displayMessage("There was a problem processing your payment.");
            errorLogger.logMessage(ex.getMessage());
            return false;
        }

        return true;
    }
}
