package com.techelevator;

import com.techelevator.controllers.Controller;
import com.techelevator.controllers.HomeController;
import com.techelevator.models.VendingMachine;

public class VendingMachineCLI
{
    public static void main ( String[] args )
    {
        VendingMachine vendingMachine = new VendingMachine();
        Controller homeController = new HomeController( vendingMachine );
        homeController.run();
    }
}
