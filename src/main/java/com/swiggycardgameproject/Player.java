package com.swiggycardgameproject;

import com.swiggycardgameproject.Card.Card;

public class Player {
    private final String name;
    private final Card[] hand;
    private int handSize;
    private final int maxHandLength = 5;

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
        if(hand.length == maxHandLength){
            System.out.println("Player hand is full, Cannot add card to the Player Hand");
            return;
        }
        for (int i = 0; i < hand.length; i++) {
            if(hand[i] == null){
                hand[i] = card;
                return;
            }
        }
        handSize = hand.length;
        return;
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

    private void printCardInPlayerHand(){
        System.out.println("Player: "+ name + "Cards in your hand.");
        System.out.println("Choose to draw a card to from your hand.");
        for (int i = 0; i < hand.length; i++) {
            if(hand[i] != null){
                System.out.println("Press "+ i + " : " + hand[i].getRank() + " : " + hand[i].getSuit());
            }
        }

    }
}
