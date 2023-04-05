package com.swiggycardgameproject;

import com.swiggycardgameproject.Card.Card;
import com.swiggycardgameproject.Card.Rank;
import com.swiggycardgameproject.Card.Suit;

import java.util.Random;

public class Deck {
    private final Card[] cards;
    private int topIndex;

//    Deck function - This function initialize and store card 13 card for each suit.
    public Deck(){
        cards = new Card[52];
        topIndex = 0;
        int index = 0;
        for (Suit suit : Suit.values()){
            for (Rank rank : Rank.values()){
                cards[index++] = new Card(rank, suit);
            }
        }
    }
//      shuffleCard function to shuffle all card the card and store it random index in Cards Array
    public void shuffleCard(){
        Random random = new Random();
        for (int i = 0; i < cards.length; i++) {
            int j = random.nextInt(cards.length);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }
//    drawCardFromDeck function is to draw a card to the player hand;
    public Card drawCardFromDeck(){
        if(topIndex >= cards.length){
            return null;
        }
        Card card = cards[topIndex++];
        return card;
    }
}
