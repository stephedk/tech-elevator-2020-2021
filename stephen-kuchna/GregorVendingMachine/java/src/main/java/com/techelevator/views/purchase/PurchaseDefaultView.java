package com.techelevator.views.purchase;

import com.techelevator.models.VendingMachine;
import com.techelevator.views.OptionViewBase;
import com.techelevator.views.menus.PurchaseMenu;

import java.io.PrintWriter;
import java.util.Scanner;

public class PurchaseDefaultView extends OptionViewBase
{
    public PurchaseDefaultView(String title, VendingMachine vendingMachine)
    {
        super(title, vendingMachine);
    }

    public PurchaseDefaultView(String title, VendingMachine vendingMachine, PrintWriter out, Scanner in)
    {
        super(title, vendingMachine, out, in);
    }

    @Override
    public void display()
    {
        displayPageHeader();

        String selectedOption = (String)getChoiceFromOptions(PurchaseMenu.Choices);
        setSelectedOption(selectedOption);
    }
}
