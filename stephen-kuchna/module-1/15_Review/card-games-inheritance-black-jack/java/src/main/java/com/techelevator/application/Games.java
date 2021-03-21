package com.techelevator.application;

import java.lang.instrument.ClassFileTransformer;

import com.techelevator.models.cards.Card;
import com.techelevator.models.cards.Deck;
import com.techelevator.models.cards.Hand;
import com.techelevator.models.cards.facecards.FaceCardDeck;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

public class Games
{
    UserOutput output = new UserOutput();
    UserInput input = new UserInput();

    private Deck deck;
    private Hand hand;

    public Games()
    {
        deck = new FaceCardDeck();
    }

    public void run()
    {
        output.displaySplashScreen();

        createHand();

        while(true)
        {
            output.showHand(hand);

            int choice = input.hitOrStay();
            if(choice == 1)
            {
                hit();

                if(isBust())
                {
                    break;
                }
            }
            else
            {
                break;
            }
        }

        output.showHand(hand);
        if(isBust())
        {
            output.loser(hand);
        }
        else
        {
            output.winner(hand);
        }



    }

    private void createHand()
    {
        String player = input.getPlayerName();
        hand = new Hand(player);

        hit();
        hit();
    }

    private void hit()
    {
        Card card = deck.deal();
        card.flip();
        hand.deal(card);
    }

    private boolean isBust()
    {
        int score = hand.getValue();
        return score > 21;
    }

}
