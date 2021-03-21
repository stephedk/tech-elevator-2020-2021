package com.techelevator.views;

import com.techelevator.models.VendingMachine;
import com.techelevator.models.finance.Change;

import java.io.PrintWriter;
import java.util.Scanner;

public abstract class ViewBase extends Console
{

    protected VendingMachine vendingMachine;
    protected String pageTitle = "";
    protected final static int pageWidth = 103;

    public ViewBase(String title, VendingMachine vendingMachine)
    {
        super();
        this.pageTitle = title;
        this.vendingMachine = vendingMachine;
    }

    public ViewBase(String title, VendingMachine vendingMachine, PrintWriter out, Scanner in)
    {
        super(out,in);
        this.pageTitle = title;
        this.vendingMachine = vendingMachine;
    }

    public abstract void display();

    public void displayPageHeader ()
    {
        printGreenLine( String.format( "|%s|", padString( pageWidth, '-' ) ));
        printBlueLine( String.format( "%s", centerString( pageTitle, pageWidth, ' ' ) ) );
        printGreenLine( String.format( "|%s|", padString( pageWidth, '-' ) ));

        //display credit
        printYellow( "  Credit: ");
        printPurpleLine( "$" + vendingMachine.getCashRegister().getCredit() );
        printCyanLine( String.format( "|%s|", padString( pageWidth, '-' ) ) );
        displayError();
    }

    public void displayError()
    {
        //display error
        if(this.vendingMachine.hasError())
        {
            printRedLine( this.vendingMachine.getErrorMessage());
            printCyanLine( String.format( "|%s|", padString( pageWidth, '-' ) ) );
            this.vendingMachine.clearError();
        }
    }

    protected String centerString( String text, int length, char fill)
    {
        int totalLength = text.length();
        int prefixLength = ( pageWidth - totalLength ) / 2;
        int suffixLength = prefixLength + ( pageWidth - ( prefixLength + prefixLength + totalLength ) );

        String prefix = padString( prefixLength, fill );
        String suffix = padString( suffixLength, fill );

        return prefix + text + suffix;
    }

    protected String padString ( int length, char fill )
    {
        StringBuilder builder = new StringBuilder( length );
        for ( int i = 0 ; i < length ; i++ )
        {
            builder.append( fill );
        }

        return builder.toString();
    }
}
