package com.swiggycardgameproject;

import com.swiggycardgameproject.Card.Card;
import com.swiggycardgameproject.Card.Rank;
import com.swiggycardgameproject.Card.Suit;

import java.util.Scanner;

public class MultiPlayerGame {
    private final Deck deck;
    private final Player[] players;
    private final Card[] discardPile;
    private int topDiscard;
    private int currentPlayer;
    private boolean reversed;
    private int drawCount;

    public MultiPlayerGame(Player[] players){
        deck = new Deck();
        deck.shuffleCard();
        this.players = players;
        discardPile = new Card[52];
        topDiscard = 0;
        currentPlayer = -1;
        reversed = false;
        drawCount = 0;
        dealCards();
        discardPile[topDiscard++] = deck.drawCardFromDeck();
    }

    private void dealCards() {
        for(Player player : players){
            for (int i = 0; i < player.maxHandLength; i++) {
                player.addCardToPlayer(deck.drawCardFromDeck());
            }
        }
        return;
    }
    Scanner sc = new Scanner(System.in);
    Player currentPlayerHand;
    public void playGame(){
        while (true){
            currentPlayerHand = players[getNextPlayer()];
            if(currentPlayerHand.getHandSize() == 0){
                System.out.println("");
            }
            System.out.println("Player " + currentPlayerHand.getName() + "'s turn.");
            currentPlayerHand.printCardInPlayerHand();
            // Display top card on discard pile
            System.out.println("Top card on discard pile: " + discardPile[0]);
            int index = getCardIndex();
            Card selectedCard = currentPlayerHand.playCardFromPlayerHand(index);
            if(selectedCard.getRank() == Rank.ACE){
                System.out.println("Skipping the next player in turn");
                currentPlayerHand.removeCardFromHand(currentPlayerHand.getHand()[index]);
                continue;
            }
            if(selectedCard.getRank() == Rank.KING){
                currentPlayerHand.removeCardFromHand(currentPlayerHand.getHand()[index]);
                reversed = !reversed;
                System.out.println("Reversing the playing turn.....");
            }
            if(selectedCard.getRank().equals(Rank.QUEEN)){
                currentPlayerHand.removeCardFromHand(currentPlayerHand.getHand()[index]);
                System.out.println("Adding 2 to next player's turn.");
                currentPlayer = (currentPlayer + 2) % (players.length - 1);
            }
            if(selectedCard.getRank().equals(Rank.JACK)){
                currentPlayerHand.removeCardFromHand(currentPlayerHand.getHand()[index]);
                System.out.println("Adding 2 to next player's turn.");
                currentPlayer = (currentPlayer + 4) % (players.length - 1);

            }
            if(selectedCard.getSuit().equals(discardPile[0].getSuit()) || selectedCard.getRank().equals(discardPile[0].getRank())){
                currentPlayerHand.removeCardFromHand(currentPlayerHand.getHand()[index]);
            }
            else{
                System.out.println("Card not matches, Draw a card from Deck pile....");
                currentPlayerHand.removeCardFromHand(currentPlayerHand.getHand()[index]);
                int len = currentPlayerHand.getHandSize() - 1;
                if(len < 5){
                    currentPlayerHand.addCardToPlayer(deck.drawCardFromDeck());
                }
                else{
                    System.out.println(("Player Hand is full...."));
                    continue;
                }
            }



        }
    }

    private int getCardIndex(){
            int index = sc.nextInt();
            while(index < 0 || index > currentPlayerHand.getHandSize() - 1){
                System.out.println("Invalid Choice, Please draw a card from player hand ");
                index = sc.nextInt();
            }
            return index;
    }

    public int getNextPlayer(){
        if(!reversed){
            if(currentPlayer < players.length){
                currentPlayer++;
            }
            else{
                currentPlayer = 0;
            }
        }
        else {
            if(currentPlayer <= 0){
                currentPlayer = players.length - 1;
            }
            else{
                currentPlayer--;
            }
        }
        return currentPlayer;
    }

}