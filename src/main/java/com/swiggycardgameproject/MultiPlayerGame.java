package com.swiggycardgameproject;

import com.swiggycardgameproject.Card.Card;
import com.swiggycardgameproject.Card.Rank;

import java.util.Scanner;

public class MultiPlayerGame {
    private final Deck deck;
    private final Player[] players;
    private final Card[] discardPile;
    private int topDiscard;
    private int currentPlayer;
    private boolean reversed;

    public MultiPlayerGame(Player[] players){
        deck = new Deck();
        deck.shuffleCard();
        this.players = players;
        discardPile = new Card[52];
        topDiscard = 0;
        currentPlayer = -1;
        reversed = false;
        dealCards();
        discardPile[topDiscard++] = deck.drawCardFromDeck();
    }

    private void dealCards() {
        for(Player player : players){
            for (int i = 0; i < player.maxHandLength; i++) {
                player.addCardToPlayer(deck.drawCardFromDeck());
            }
        }
    }
    Scanner sc = new Scanner(System.in);
    Player currentPlayerHand;
    public void playGame(){
        while (true){
            currentPlayerHand = players[getNextPlayer()];
//            Checking for deck Pile is empty on not;
            if(deck.isGameDraw()){
                System.out.println("Draw pile is empty. Game ends in a draw.");
                break;
            }
            if(currentPlayerHand.getHandSize() == 0){
                System.out.println("Congratulation !!!, " + currentPlayerHand.getName() + " You are Winner of the Game");
                System.out.println("Thank you for playing, I hope you enjoyed the Game!!!");
                break;
            }

            System.out.println("Player " + currentPlayerHand.getName() + "'s turn.");
//            Displaying Card left with the currentHandPlayer
            currentPlayerHand.printCardInPlayerHand();
            // Display top card on discard pile
            System.out.println("Top card on discard pile: " + discardPile[0]);
            int index = getCardIndex();
            Card selectedCard = currentPlayerHand.playCardFromPlayerHand(index);


//            Checking for Action Card.........
            if(selectedCard.rank() == Rank.ACE){
                System.out.println("Skipping the next player in turn");
                currentPlayerHand.removeCardFromHand(currentPlayerHand.getHand()[index]);
                continue;
            }
            if(selectedCard.rank() == Rank.KING){
                currentPlayerHand.removeCardFromHand(currentPlayerHand.getHand()[index]);
                reversed = !reversed;
                System.out.println("Reversing the playing turn.....");
            }
            if(selectedCard.rank().equals(Rank.QUEEN)){
                currentPlayerHand.removeCardFromHand(currentPlayerHand.getHand()[index]);
                System.out.println("Adding 2 to next player's turn.");
                currentPlayer = (currentPlayer + 2) % (players.length - 1);
            }
            if(selectedCard.rank().equals(Rank.JACK)){
                currentPlayerHand.removeCardFromHand(currentPlayerHand.getHand()[index]);
                System.out.println("Adding 2 to next player's turn.");
                currentPlayer = (currentPlayer + 4) % (players.length - 1);

            }
            if(selectedCard.suit().equals(discardPile[0].suit()) || selectedCard.rank().equals(discardPile[0].rank())){
                currentPlayerHand.removeCardFromHand(currentPlayerHand.getHand()[index]);
            }
            else{
                System.out.println("Card not matches, Drawing a card from Deck pile....");
                currentPlayerHand.removeCardFromHand(currentPlayerHand.getHand()[index]);
                int len = currentPlayerHand.getHandSize() - 1;
                if(len < 5){
                    currentPlayerHand.addCardToPlayer(deck.drawCardFromDeck());
                }
                else{
                    System.out.println(("Player Hand is full...."));
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
            if(currentPlayer < players.length - 1){
                currentPlayer++;
            }
            else{
                currentPlayer = 0;
            }
        }
        else {
            if(currentPlayer <= 0){
                currentPlayer = players.length - 2;
            }
            else{
                currentPlayer--;
            }
        }
        return currentPlayer;
    }

}
