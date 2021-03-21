package com.techelevator.controllers;

import com.techelevator.models.exceptions.InsuficientFundsException;
import com.techelevator.models.exceptions.InvalidSlotException;
import com.techelevator.models.exceptions.OutOfStockException;
import com.techelevator.models.finance.CashRegister;
import com.techelevator.models.VendingMachine;
import com.techelevator.views.menus.MoneyMenu;
import com.techelevator.views.menus.PurchaseMenu;
import com.techelevator.models.products.Product;
import com.techelevator.views.purchase.*;

import javax.swing.text.View;

public class PurchaseController extends Controller
{
    public PurchaseController ( VendingMachine vendingMachine )
    {
        super( vendingMachine );
    }

    @Override
    public void run ()
    {
        boolean goOn = true;
        PurchaseDefaultView view = new PurchaseDefaultView("Purchase Products", vendingMachine);

        do
        {
            view.display();

            String choice = view.getSelectedOption();

            switch ( choice )
            {
                case PurchaseMenu.Options.AddMoney:
                    addMoney();
                    break;
                case PurchaseMenu.Options.SelectProduct:
                    selectProduct();
                    break;
                case PurchaseMenu.Options.FinishTransaction:
                    finishTransaction();
                    goOn = false;
                    break;
            }

        } while ( goOn );
    }

    public void addMoney ()
    {
        AddMoneyView view = new AddMoneyView("Insert Money", vendingMachine);
        CashRegister register = vendingMachine.getCashRegister();

        String choice = "";
        while ( !choice.equals( MoneyMenu.Options.Finished ) )
        {
            view.display();

            choice = view.getSelectedOption();
            switch ( choice )
            {
                case MoneyMenu.Options.One:
                    register.addMoney( 1 );
                    break;
                case MoneyMenu.Options.Two:
                    register.addMoney( 2 );
                    break;
                case MoneyMenu.Options.Five:
                    register.addMoney( 5 );
                    break;
                case MoneyMenu.Options.Ten:
                    register.addMoney( 10 );
                    break;
            }
        }
    }

    public void selectProduct ()
    {
        PurchaseProductView view = new PurchaseProductView("Purchase Product", vendingMachine);
        view.display();

        String slotName = view.getSelectedOption();
        try
        {
            Product dispensedProduct = vendingMachine.purchase( slotName );
            ProductDispensedView productView = new ProductDispensedView("",vendingMachine, dispensedProduct);
            productView.display();
        }
        catch ( InsuficientFundsException | OutOfStockException | InvalidSlotException ex )
        {
            vendingMachine.setErrorMessage( ex.toString() );
        }
    }

    public void finishTransaction()
    {
        DispenseChangeView view = new DispenseChangeView("Complete Transaction", vendingMachine);
        view.display();
    }
}
