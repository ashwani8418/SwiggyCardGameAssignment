package com.swiggycardgameproject;

import com.swiggycardgameproject.Card.Card;

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
        currentPlayer = 0;
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

        for (Player player : players){
            player.printCardInPlayerHand();
        }
    }

}
