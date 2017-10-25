package me.aoa4eva;

import java.util.ArrayList;
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

        // initialize 4 players
        ArrayList<Player> players = new ArrayList<Player>();

        Player player1= new Player("Player 1");
        players.add(player1);
        Player player2= new Player("Player 2");
        players.add(player2);
        Player player3= new Player("Player 3");
        players.add(player3);
        Player player4= new Player("Player 4");
        players.add(player4);


        for (Player player:players) {
            // draw 4 cards to each player
            Card drawnCard1 = thisDeck.dealCard2();
            player.addCard(drawnCard1);
            Card drawnCard2 = thisDeck.dealCard2();
            player.addCard(drawnCard2);
            Card drawnCard3 = thisDeck.dealCard2();
            player.addCard(drawnCard3);
            Card drawnCard4 = thisDeck.dealCard2();
            player.addCard(drawnCard4);

        }

        //show player cards
        for (Player player:players) {
            System.out.println("-------------------------------------");
            System.out.println("Player " +player.getName().toUpperCase());
            System.out.println("-------------------------------------");
            System.out.println((player.showCards()));
         }

        System.out.println("========================================================================");
        //int the cards left in the deck
        showDeckCards(thisDeck);
        System.out.println("========================================================================");


    }

    public static void showDeckCards(Deck deck){
        System.out.println(deck.showCards());

    }
}
