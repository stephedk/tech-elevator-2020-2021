package com.techelevator.models.cards.facecards.enumerations;

import java.util.Arrays;
import java.util.List;

import com.techelevator.models.cards.facecards.*;
import com.techelevator.models.cards.facecards.cards.*;

public final class Cards
{
    public static final FaceCard ACE_SPADES = new Ace(Suits.SPADES);
    public static final FaceCard TWO_SPADES = new Two(Suits.SPADES);
    public static final FaceCard THREE_SPADES = new Three(Suits.SPADES);
    public static final FaceCard FOUR_SPADES = new Four(Suits.SPADES);
    public static final FaceCard FIVE_SPADES = new Five(Suits.SPADES);
    public static final FaceCard SIX_SPADES = new Six(Suits.SPADES);
    public static final FaceCard SEVEN_SPADES = new Seven(Suits.SPADES);
    public static final FaceCard EIGHT_SPADES = new Eight(Suits.SPADES);
    public static final FaceCard NINE_SPADES = new Nine(Suits.SPADES);
    public static final FaceCard TEN_SPADES = new Ten(Suits.SPADES);
    public static final FaceCard JACK_SPADES = new Jack(Suits.SPADES);
    public static final FaceCard QUEEN_SPADES = new Queen(Suits.SPADES);
    public static final FaceCard KING_SPADES = new King(Suits.SPADES);
    
    public static final FaceCard ACE_HEARTS = new Ace(Suits.HEARTS);
    public static final FaceCard TWO_HEARTS = new Two(Suits.HEARTS);
    public static final FaceCard THREE_HEARTS = new Three(Suits.HEARTS);
    public static final FaceCard FOUR_HEARTS = new Four(Suits.HEARTS);
    public static final FaceCard FIVE_HEARTS = new Five(Suits.HEARTS);
    public static final FaceCard SIX_HEARTS = new Six(Suits.HEARTS);
    public static final FaceCard SEVEN_HEARTS = new Seven(Suits.HEARTS);
    public static final FaceCard EIGHT_HEARTS = new Eight(Suits.HEARTS);
    public static final FaceCard NINE_HEARTS = new Nine(Suits.HEARTS);
    public static final FaceCard TEN_HEARTS = new Ten(Suits.HEARTS);
    public static final FaceCard JACK_HEARTS = new Jack(Suits.HEARTS);
    public static final FaceCard QUEEN_HEARTS = new Queen(Suits.HEARTS);
    public static final FaceCard KING_HEARTS = new King(Suits.HEARTS);
    
    public static final FaceCard ACE_CLUBS = new Ace(Suits.CLUBS);
    public static final FaceCard TWO_CLUBS = new Two(Suits.CLUBS);
    public static final FaceCard THREE_CLUBS = new Three(Suits.CLUBS);
    public static final FaceCard FOUR_CLUBS = new Four(Suits.CLUBS);
    public static final FaceCard FIVE_CLUBS = new Five(Suits.CLUBS);
    public static final FaceCard SIX_CLUBS = new Six(Suits.CLUBS);
    public static final FaceCard SEVEN_CLUBS = new Seven(Suits.CLUBS);
    public static final FaceCard EIGHT_CLUBS = new Eight(Suits.CLUBS);
    public static final FaceCard NINE_CLUBS = new Nine(Suits.CLUBS);
    public static final FaceCard TEN_CLUBS = new Ten(Suits.CLUBS);
    public static final FaceCard JACK_CLUBS = new Jack(Suits.CLUBS);
    public static final FaceCard QUEEN_CLUBS = new Queen(Suits.CLUBS);
    public static final FaceCard KING_CLUBS = new King(Suits.CLUBS);
    
    public static final FaceCard ACE_DIAMONDS = new Ace(Suits.DIAMONDS);
    public static final FaceCard TWO_DIAMONDS = new Two(Suits.DIAMONDS);
    public static final FaceCard THREE_DIAMONDS = new Three(Suits.DIAMONDS);
    public static final FaceCard FOUR_DIAMONDS = new Four(Suits.DIAMONDS);
    public static final FaceCard FIVE_DIAMONDS = new Five(Suits.DIAMONDS);
    public static final FaceCard SIX_DIAMONDS = new Six(Suits.DIAMONDS);
    public static final FaceCard SEVEN_DIAMONDS = new Seven(Suits.DIAMONDS);
    public static final FaceCard EIGHT_DIAMONDS = new Eight(Suits.DIAMONDS);
    public static final FaceCard NINE_DIAMONDS = new Nine(Suits.DIAMONDS);
    public static final FaceCard TEN_DIAMONDS = new Ten(Suits.DIAMONDS);
    public static final FaceCard JACK_DIAMONDS = new Jack(Suits.DIAMONDS);
    public static final FaceCard QUEEN_DIAMONDS = new Queen(Suits.DIAMONDS);
    public static final FaceCard KING_DIAMONDS = new King(Suits.DIAMONDS);

    public static List<FaceCard> getSpades()
    {
        FaceCard[] cards = new FaceCard[]{
            ACE_SPADES,
            TWO_SPADES,
            THREE_SPADES,
            FOUR_SPADES,
            FIVE_SPADES,
            SIX_SPADES,
            SEVEN_SPADES,
            EIGHT_SPADES,
            NINE_SPADES,
            TEN_SPADES,
            JACK_SPADES,
            QUEEN_SPADES,
            KING_SPADES,
        };

        return Arrays.asList(cards);
    }

    public static List<FaceCard> getHearts()
    {
        FaceCard[] cards = new FaceCard[]{
            ACE_HEARTS,
            TWO_HEARTS,
            THREE_HEARTS,
            FOUR_HEARTS,
            FIVE_HEARTS,
            SIX_HEARTS,
            SEVEN_HEARTS,
            EIGHT_HEARTS,
            NINE_HEARTS,
            TEN_HEARTS,
            JACK_HEARTS,
            QUEEN_HEARTS,
            KING_HEARTS,
        };

        return Arrays.asList(cards);
    }

    public static List<FaceCard> getClubs()
    {
        FaceCard[] cards = new FaceCard[]{
            ACE_CLUBS,
            TWO_CLUBS,
            THREE_CLUBS,
            FOUR_CLUBS,
            FIVE_CLUBS,
            SIX_CLUBS,
            SEVEN_CLUBS,
            EIGHT_CLUBS,
            NINE_CLUBS,
            TEN_CLUBS,
            JACK_CLUBS,
            QUEEN_CLUBS,
            KING_CLUBS,
        };

        return Arrays.asList(cards);
    }

    public static List<FaceCard> getDiamonds()
    {
        FaceCard[] cards = new FaceCard[]{
            ACE_DIAMONDS,
            TWO_DIAMONDS,
            THREE_DIAMONDS,
            FOUR_DIAMONDS,
            FIVE_DIAMONDS,
            SIX_DIAMONDS,
            SEVEN_DIAMONDS,
            EIGHT_DIAMONDS,
            NINE_DIAMONDS,
            TEN_DIAMONDS,
            JACK_DIAMONDS,
            QUEEN_DIAMONDS,
            KING_DIAMONDS,
        };

        return Arrays.asList(cards);
    }
 
    private Cards(){}
}
