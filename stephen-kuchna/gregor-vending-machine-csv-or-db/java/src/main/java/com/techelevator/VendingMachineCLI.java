package com.techelevator;

import com.techelevator.controllers.Controller;
import com.techelevator.controllers.HomeController;
import com.techelevator.models.VendingMachine;
import com.techelevator.models.data.*;
import org.apache.commons.dbcp2.BasicDataSource;

public class VendingMachineCLI
{
    private static final String SOURCE = "db";

    public static void main ( String[] args )
    {
        InventoryRepository inventoryRepository;
        Logger logger;

        if(SOURCE.toLowerCase().equals("db"))
        {
            BasicDataSource dataSource = new BasicDataSource();
            dataSource.setUrl("jdbc:postgresql://localhost:5432/vendingmachine");
            dataSource.setUsername("postgres");
            dataSource.setPassword("postgres1");

            inventoryRepository = new DatabaseInventoryRepository(dataSource);
            logger = new DatabaseLogger(dataSource);
        }
        else
        {
            inventoryRepository = new FileInventoryRepository();
            logger = new FileLogger();
        }

        VendingMachine vendingMachine = new VendingMachine(inventoryRepository,logger);
        Controller homeController = new HomeController( vendingMachine );
        homeController.run();
    }
}
