package com.techelevator.views.purchase;

import com.techelevator.models.VendingMachine;
import com.techelevator.views.OptionViewBase;
import com.techelevator.views.menus.MoneyMenu;

import java.io.PrintWriter;
import java.util.Scanner;

public class AddMoneyView extends OptionViewBase
{
    public AddMoneyView(String title, VendingMachine vendingMachine)
    {
        super(title, vendingMachine);
    }

    public AddMoneyView(String title, VendingMachine vendingMachine, PrintWriter out, Scanner in)
    {
        super(title, vendingMachine, out, in);
    }

    @Override
    public void display()
    {
        displayPageHeader();
        String option = (String)getChoiceFromOptions(MoneyMenu.Choices);
        setSelectedOption(option);
    }
}
