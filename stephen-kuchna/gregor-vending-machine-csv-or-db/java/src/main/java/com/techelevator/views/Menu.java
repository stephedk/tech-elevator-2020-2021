package com.techelevator.views;

import com.techelevator.models.VendingMachine;

import java.io.PrintWriter;
import java.util.Scanner;

public abstract class Menu extends ViewBase
{
    public Menu(String title, VendingMachine vendingMachine)
    {
        super(title, vendingMachine);
    }

    public Menu(String title, VendingMachine vendingMachine, PrintWriter out, Scanner in)
    {
        super(title, vendingMachine, out, in);
    }

    public Object getChoiceFromOptions (Object[] options )
    {
        Object choice = null;
        while ( choice == null )
        {
            displayMenuOptions( options );
            choice = getChoiceFromUserInput( options );
        }
        return choice;
    }

    private Object getChoiceFromUserInput ( Object[] options )
    {
        Object choice = null;
        String userInput = nextLine();
        try
        {
            int selectedOption = Integer.valueOf( userInput );
            if ( selectedOption > 0 && selectedOption <= options.length )
            {
                choice = options[selectedOption - 1];
            }
        }
        catch ( NumberFormatException e )
        {
            // eat the exception, an error message will be displayed below since choice will be null
        }
        if ( choice == null )
        {
            printRedLine( "\n*** " + userInput + " is not a valid option ***\n" );
        }
        return choice;
    }

    private void displayMenuOptions ( Object[] options )
    {
        printLine();
        for ( int i = 0 ; i < options.length ; i++ )
        {
            int optionNum = i + 1;
            printYellow( optionNum + ") ");
            printGreenLine( options[i].toString() );
        }
        printCyan( "\nPlease enter a selection: " );
    }
}
