package com.techelevator.models.data;

import com.techelevator.models.Slot;
import com.techelevator.models.products.Product;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileInventoryRepository implements InventoryRepository
{
    private static final String productsPath = "vendingmachine.csv";
    private Scanner reader = null;

    public List< Slot > loadInventory ()
    {
        List< Slot > slots = new ArrayList<>();
        File productsFile = new File( productsPath ).getAbsoluteFile();
        try
        {
            reader = new Scanner( productsFile );
            while ( reader.hasNext() )
            {
                String line = reader.nextLine();
                slots.add( createSlot( line ) );
            }
        }
        catch ( Exception ex )
        {
            //log exception
        }
        finally
        {
            if ( reader != null )
            {
                reader.close();
            }
        }

        return slots;

    }

    private Slot createSlot( String productLine )
    {
        String[] details = productLine.split( "\\|" );

        String slotNumber = details[0];
        String name = details[1];
        String priceString = details[2];
        String productType = details[3];
        BigDecimal price = new BigDecimal(priceString);

        Product product = ProductBuilder.build( slotNumber, price, productType);
        return new Slot( slotNumber, product, 5 );
    }
}