package com.techelevator.application;

import java.util.ArrayList;
import java.util.List;

import com.techelevator.models.Chore;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

public class Application
{
    UserInput input = new UserInput();
    UserOutput output = new UserOutput();

    List<Chore> chores;
    
    public Application()
    {
        // create instance variables here
        chores = new ArrayList<Chore>();
    }

    public void run()
    {
        output.displayWelcomeScreen();

        while(true)
        {
            int choice = input.getMainMenuChoice();

            if(choice == 1)
            {
                addChore();
            }
            else if(choice == 2)
            {
                showChores();
            }
            else if(choice == 3)
            {
                break;
            }
            else
            {
                output.displayMessage("Please select from the list of options.");
            }

        }

        output.displayGoodbye();

    }

    private void addChore()
    {

    }

    private void showChores()
    {

    }
    
}
