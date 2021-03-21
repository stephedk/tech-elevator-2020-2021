package com.techelevator.views.purchase;

import com.techelevator.models.VendingMachine;
import com.techelevator.views.OptionViewBase;
import com.techelevator.views.common.InventoryView;

import java.io.PrintWriter;
import java.util.Scanner;

public class PurchaseProductView extends OptionViewBase
{
    public PurchaseProductView(String title, VendingMachine vendingMachine)
    {
        super(title, vendingMachine);
    }

    public PurchaseProductView(String title, VendingMachine vendingMachine, PrintWriter out, Scanner in)
    {
        super(title, vendingMachine, out, in);
    }

    @Override
    public void display()
    {
        InventoryView view = new InventoryView(vendingMachine);
        view.display();
        print("Enter a slot number: ");
        String slot = nextVendingSlot();

        setSelectedOption(slot);

    }
}
