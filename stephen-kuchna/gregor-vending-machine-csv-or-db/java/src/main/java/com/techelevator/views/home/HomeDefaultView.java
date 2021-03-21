package com.techelevator.views.home;

import com.techelevator.models.VendingMachine;
import com.techelevator.views.OptionViewBase;
import com.techelevator.views.menus.MainMenu;

import java.io.PrintWriter;
import java.util.Scanner;

public class HomeDefaultView extends OptionViewBase
{
    public HomeDefaultView(String title, VendingMachine vendingMachine)
    {
        super(title, vendingMachine);
    }

    public HomeDefaultView(String title, VendingMachine vendingMachine, PrintWriter out, Scanner in)
    {
        super(title, vendingMachine, out, in);
    }

    @Override
    public void display()
    {
        displayPageHeader();

        String selectedOption = (String)getChoiceFromOptions(MainMenu.Choices);
        setSelectedOption(selectedOption);
    }
}
