package com.swiggycardgameproject.Card;

public record Card(Rank rank, Suit suit) {

    @Override
    public String toString() {
        return rank.toString() + " of " + suit.toString();
    }
}
