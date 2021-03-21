package com.techelevator.views.purchase;

import com.techelevator.models.VendingMachine;
import com.techelevator.models.products.Product;
import com.techelevator.views.ViewBase;

import java.io.PrintWriter;
import java.util.Scanner;

public class ProductDispensedView extends ViewBase
{
    private Product product;

    public ProductDispensedView(String title, VendingMachine vendingMachine, Product product)
    {
        super(title, vendingMachine);
        this.product = product;
    }

    public ProductDispensedView(String title, VendingMachine vendingMachine, Product product, PrintWriter out, Scanner in)
    {
        super(title, vendingMachine, out, in);
        this.product = product;
    }

    @Override
    public void display()
    {
        printYellowLine( String.format( "  Product: %s", product.getName() ));
        printGreenLine( "  " + product.consume() );
        printCyanLine( String.format( "|%s|", padString( pageWidth, '-' ) ) );
    }
}
