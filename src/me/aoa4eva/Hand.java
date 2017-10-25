package me.aoa4eva;

import java.util.ArrayList;

public class Hand {
    //List of the cards in a hand
    ArrayList<Card> cards;

    public Hand()
    {
        cards = new ArrayList<Card>();
    }
    //Gets the list of cards in the hand
    public ArrayList<Card> getCards() {
        return cards;
    }

    //Adds a card to the hand
    public void addCard(Card c)
    {
        cards.add(c);
    }

    public String showCards() {
        String str = "";
        for(Card card:cards){
            str += card.show()+"\n";
        }
        return str;
    }


}
