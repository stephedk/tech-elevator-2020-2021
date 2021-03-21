package com.techelevator.views.common;

import com.techelevator.models.Inventory;
import com.techelevator.models.Slot;
import com.techelevator.models.VendingMachine;
import com.techelevator.views.ViewBase;
import com.techelevator.views.menus.Colors;

import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;

public class InventoryView extends ViewBase
{
    public InventoryView(VendingMachine vendingMachine)
    {
        super("", vendingMachine);
    }

    public InventoryView(VendingMachine vendingMachine, PrintWriter out, Scanner in)
    {
        super("", vendingMachine, out, in);
    }

    @Override
    public void display()
    {
        printLine(formatProducts());
    }

    private String formatProducts()
    {
        Inventory inventory = this.vendingMachine.getInventory();
        Map<String, Slot> slots = inventory.getSlots();

        StringBuilder builder = new StringBuilder();
        String pipe = Colors.YELLOW + "|" + Colors.RESET;
        String lineOneFormat = Colors.YELLOW + "|%1$s " + Colors.PURPLE + "%2$s" + Colors.YELLOW +  " %1$s|   " + Colors.RESET;
        String lineSeparatorFormat = Colors.YELLOW + "|%1$s|   |%1$s|   |%1$s|   |%1$s|" + Colors.RESET;
        String lineNameFormat = "%s" + Colors.CYAN + "%-22s" + Colors.RESET + "%s   ";
        String linePrice = "%s" + Colors.GREEN + "$%-5s    " + Colors.WHITE + "Remaining: " + Colors.RESET + "%s%s   ";

        String[] rows = new String[]{ "A", "B", "C", "D" };
        for(String row: rows)
        {
            Slot one = slots.get( row + "1" );
            Slot two = slots.get( row + "2" );
            Slot three = slots.get( row + "3" );
            Slot four = slots.get( row + "4" );

            builder.append(String.format( lineOneFormat, "---------", one.getPosition() ));
            builder.append(String.format( lineOneFormat, "---------", two.getPosition() ));
            builder.append(String.format( lineOneFormat, "---------", three.getPosition() ));
            builder.append(String.format( lineOneFormat, "---------", four.getPosition() ));
            builder.append( "\n" );
            builder.append(String.format( lineNameFormat, pipe, one.getName(), pipe));
            builder.append(String.format( lineNameFormat, pipe, two.getName(), pipe));
            builder.append(String.format( lineNameFormat, pipe, three.getName(), pipe));
            builder.append(String.format( lineNameFormat, pipe, four.getName(), pipe));
            builder.append( "\n" );
            builder.append(String.format( lineSeparatorFormat, "----------------------"));
            builder.append( "\n" );
            builder.append(String.format( linePrice, pipe, one.getPrice(), one.getQuantity(), pipe ));
            builder.append(String.format( linePrice, pipe, two.getPrice(), two.getQuantity(), pipe ));
            builder.append(String.format( linePrice, pipe, three.getPrice(), three.getQuantity(), pipe ));
            builder.append(String.format( linePrice, pipe, four.getPrice(), four.getQuantity(), pipe ));
            builder.append( "\n" );
            builder.append(String.format( lineSeparatorFormat, "----------------------"));
            builder.append( "\n" );
            builder.append( "\n" );
            builder.append( "\n" );
        }

        return builder.toString();
    }
}
