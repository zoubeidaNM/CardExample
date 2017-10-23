package me.aoa4eva;

import java.util.Scanner;

public class Main {

    //This application fills a deck with 52 playing cards, and allows a user to pick cards from the deck.
    //1. Complete this application to remove a card from the deck. Hint: You CAN write your own method to do this. But you don't HAVE to.
    //2. Write a a method in main to show the cards in the deck
    //3. Extend this application to include players. Each player has a hand. Can you deal 4 cards to each player,
    // and then show the cards left in the deck?

    public static void main(String[] args) {
        String yesNo="";

        Scanner keyboard = new Scanner(System.in);
        Deck thisDeck = new Deck();
        Hand h = new Hand();
        thisDeck.fillDeck();

        do{
            Card drawnCard = thisDeck.dealCard();
            System.out.println("This is the card that was drawn: "+drawnCard.show());

            System.out.println(drawnCard.show() +" has been dealt") ;
            h.addCard(drawnCard);

            System.out.println("Do you want to pick a card?");
            yesNo = keyboard.nextLine();
        }while(yesNo.equalsIgnoreCase("y")||!yesNo.equalsIgnoreCase("n"));

        System.out.println("The dealt cards:");

        for(Card aCard:h.getCards())
        {
            System.out.println(aCard.show());
        }

        System.out.println("========================================================================");
        for(Card aCard:thisDeck.getCards())
        {
            System.out.println(aCard.show());
        }
        System.out.println("========================================================================");
    }
}
