package com.swiggycardgameproject;

import com.swiggycardgameproject.Card.Card;

public class Player {
    private final String name;
    private final Card[] hand;
    private int handSize;
    public final int maxHandLength = 5;

    public Player(String name) {
        this.name = name;
        this.hand = new Card[maxHandLength];
        this.handSize = 0;
    }

    public String getName() {
        return name;
    }

    public Card[] getHand() {
        return hand;
    }

    public int getHandSize() {
        return this.handSize;
    }

    public void addCardToPlayer(Card card){

        for (int i = 0; i < hand.length; i++) {
            if(hand[i] == null){
                hand[i] = card;
                handSize++;
                return;
            }
        }
    }

    public Card playCardFromPlayerHand(int index){
        if(index < 0 || index > hand.length){
            return null;
        }
        Card card = hand[index];
        System.out.println(card.toString());
        return card;
    }

    public void removeCardFromHand(Card card) {
        for (int i = 0; i < this.handSize; i++) {
            if (this.hand[i].equals(card)) {
                // Shift cards left to fill the gap
                for (int j = i; j < this.handSize - 1; j++) {
                    this.hand[j] = this.hand[j + 1];
                }
                // Set last card in hand to null
                this.hand[this.handSize - 1] = null;
                this.handSize--;
                break;
            }
        }
        System.out.println("Card Removed.....");
    }

    public void printCardInPlayerHand(){
        System.out.println("Player: "+ name + ", Cards in your hand.");
        System.out.println("Choose to draw a card to from your hand.");
        for (int i = 0; i < hand.length; i++) {
            if(hand[i] != null){
                System.out.println("Press "+ i + " : " + hand[i].getRank() + " : " + hand[i].getSuit());
            }
        }


    }
}
