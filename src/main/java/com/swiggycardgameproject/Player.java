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
    }

    public String getName() {
        return name;
    }

    public Card[] getHand() {
        return hand;
    }

    public int getHandSize() {
        return handSize;
    }

    public void addCardToPlayer(Card card){

        for (int i = 0; i < hand.length; i++) {
            if(hand[i] == null){
                hand[i] = card;
                return;
            }
            else {
                System.out.println("Player Hand is Full..");
            }
        }
    }

    public Card playCardFromPlayerHand(int index){
        if(index < 0 || index > hand.length){
            return null;
        }
        Card card = hand[index];
        for (int i = index; i < hand.length; i++) {
            hand[i] = hand[i + 1];
        }
        hand[hand.length - 1] = null;
        handSize = hand.length - 1;
        return card;
    }

    public void printCardInPlayerHand(){
        System.out.println("Player: "+ name + ", Cards in your hand.");
        System.out.println("Choose to draw a card to from your hand.");
        for (int i = 0; i < hand.length; i++) {
            if(hand[i] != null){
                System.out.println("Press "+ i + " : " + hand[i].getRank() + " : " + hand[i].getSuit());
            }
        }
        System.out.println("HandSize "+getHandSize());

    }
}
