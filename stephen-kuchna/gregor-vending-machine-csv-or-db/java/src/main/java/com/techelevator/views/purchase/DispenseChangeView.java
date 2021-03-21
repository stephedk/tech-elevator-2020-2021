package com.techelevator.views.purchase;

import com.techelevator.models.VendingMachine;
import com.techelevator.models.finance.Change;
import com.techelevator.views.ViewBase;

import java.io.PrintWriter;
import java.util.Scanner;

public class DispenseChangeView extends ViewBase
{
    public DispenseChangeView(String title, VendingMachine vendingMachine)
    {
        super(title, vendingMachine);
    }

    public DispenseChangeView(String title, VendingMachine vendingMachine, PrintWriter out, Scanner in)
    {
        super(title, vendingMachine, out, in);
    }

    @Override
    public void display()
    {
        displayPageHeader();

        //dispense change
        Change change = vendingMachine.getCashRegister().dispenseChange();
        if(change.hasChange())
        {
            printRedLine( "  Thank you for shopping." );
            printRedLine( "  Please take your change." );
            printYellow("  Quarters: ");
            printPurpleLine( change.getQuarters().toString() );
            printYellow("  Dimes: ");
            printPurpleLine( change.getDimes().toString() );
            printYellow("  Nickles: ");
            printPurpleLine( change.getNickles().toString() );
            printCyanLine( String.format( "|%s|", padString( pageWidth, '-' ) ) );
        }
    }
}
