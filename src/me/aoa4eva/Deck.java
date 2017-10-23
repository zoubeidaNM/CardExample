package me.aoa4eva;
import java.util.ArrayList;
import java.util.Random;

public class Deck {

    //Setting up for cards in deck

    ArrayList<Card> cards;

    //Initialising the arraylist of cards in the deck
    public Deck()
    {
        cards = new ArrayList<Card>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }



    public Card dealCard()
    {
        //Randomises cards in the deck. The upper boundary is 10 (non face cards only).
        Random cardsInDeck;
        int cardNumber;
        cardsInDeck = new Random();
        cardNumber = cardsInDeck.nextInt(9)+2;

        //Lists the symbols of cards in the deck
        String cardSymbols[]={"Spades","Clubs","Diamonds","Hearts"};
        Random symbolChoice = new Random();
        String thisCardSymbol = cardSymbols[symbolChoice.nextInt(3)];
        return new Card(Integer.toString(cardNumber),thisCardSymbol);
    }

    public void fillDeck()
    {
        //Populates the deck with face cards and number cards
        //Why are arrays used here?
        String cardSymbols[]={"Spades","Clubs","Diamonds","Hearts"};
        String faceCards[]={"Jack","Queen","King","Ace"};

        //For each symbol (spades, clubs, diamonds, hearts)
        //add number cards from 2 to 10 to the deck,
        //and face cards for each symbol.

        for(int aSymbol=0; aSymbol <cardSymbols.length; aSymbol++)
        {
            for(int cardCounter=2; cardCounter<11; cardCounter++)
            {
                //Populate the deck with number Cards from 1 to 10
                Card c = new Card(Integer.toString(cardCounter),cardSymbols[aSymbol]);
                this.addCard(c);

            }
            //Populate the deck with face cards from the array
            for(int faceCardCounter=0; faceCardCounter<4;faceCardCounter++)
            {
                Card c = new Card(faceCards[faceCardCounter],cardSymbols[aSymbol]);
                this.addCard(c);
            }

        }


    }

    public Card getSelectedCard(Card c)
    {
        //Check to see if the card that was selected is in the deck. If it is, return the actual card from the deck
        ArrayList<Card> chosenCard = new ArrayList<Card>();
        for(Card aCard: this.cards)
        {
            if(c.isThisCard(aCard))
            {
                return aCard;
            }
        }
        return c;
    }

    //Adds a card to the deck
    public void addCard(Card card)
    {
        this.cards.add(card);
    }

    public void removeCard(Card card)
    {
        //Removes the selected card
        this.cards.remove(getSelectedCard(card));
    }


}
