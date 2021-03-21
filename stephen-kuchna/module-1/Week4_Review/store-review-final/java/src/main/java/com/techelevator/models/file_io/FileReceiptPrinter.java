package com.techelevator.models.file_io;

import java.io.File;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import com.techelevator.models.ShoppingCart;
import com.techelevator.models.products.Product;

/**
 * Responsibilities:
 *      create a new receipt file and add the receipt details
 * 
 * Dependencies:
 *      ShoppingCart
 *      Product
 */
public class FileReceiptPrinter 
{
    
    public void createReceipt(ShoppingCart shoppingCart, BigDecimal paymentAmount, BigDecimal change)
    {
        // create a new file in the "receipt folder"
        // the file name will be the current date and time 20210106_140312.txt
        String receiptPath = "receipts/" + receiptName();
        File file = new File(receiptPath);

        try(PrintWriter fileWriter = new PrintWriter(file))
        {
            // print header
            fileWriter.println("Thank you for shopping at our store");
            fileWriter.println("--------------------------------------------------------------------------");
            
            // print date
            fileWriter.println(currentDate());
            fileWriter.println();

            // print all shopping cart items as line items 
            Map<Product, Integer> productMap = shoppingCart.getProducts();
            
            for(Map.Entry<Product, Integer> entry: productMap.entrySet())
            {
                Product product = entry.getKey();
                int quantity = entry.getValue();
                BigDecimal multiplier = new BigDecimal(quantity);

                String id = product.getId();
                String name = product.getName();
                BigDecimal price = product.getPrice();
                BigDecimal lineTotal = price.multiply(multiplier);

                String line = String.format("%-6s %-35s $ %6.2f     %-5d $ %10.2f", id, name, price, quantity, lineTotal);

                fileWriter.println(line);
            }
            
            //print total and payment summary
            fileWriter.println("--------------------------------------------------------------------------");
            fileWriter.println(String.format("%-61s $ %10.2f", "Cart Total:", shoppingCart.getCartTotal()));
            fileWriter.println(String.format("%-61s $ %10.2f", "Payment:", paymentAmount));
            fileWriter.println(String.format("%-61s $ %10.2f", "Change:", change));
            fileWriter.println();
            
        }
        catch(Exception ex)
        {
            // log any exceptions here
        }
    }

    private String currentDate()
    {
        LocalDateTime time = LocalDateTime.now();

        return time.format(DateTimeFormatter.ISO_DATE);
    }

    private String currentTime()
    {
        LocalDateTime time = LocalDateTime.now();
                                
        return time.format(DateTimeFormatter.ISO_LOCAL_TIME);
    }

    private String receiptName()
    {
        String dateString = currentDate().replace("-", "");
                                
        String timeString = currentTime().replace(":","")
                                         .substring(0,6);

        return dateString + "_" + timeString + ".txt";
    }
}
