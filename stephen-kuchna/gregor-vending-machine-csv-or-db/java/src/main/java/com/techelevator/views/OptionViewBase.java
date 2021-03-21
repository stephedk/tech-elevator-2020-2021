package com.techelevator.views;

import com.techelevator.models.VendingMachine;

import java.io.PrintWriter;
import java.util.Scanner;

public abstract class OptionViewBase extends Menu
{
    private String selectedOption;

    protected void setSelectedOption(String selectedOption)
    {
        this.selectedOption = selectedOption;
    }

    public String getSelectedOption()
    {
        return selectedOption;
    }

    public OptionViewBase(String title, VendingMachine vendingMachine)
    {
        super(title, vendingMachine);
    }

    public OptionViewBase(String title, VendingMachine vendingMachine,PrintWriter out, Scanner in)
    {
        super(title, vendingMachine, out,in);
    }
}
