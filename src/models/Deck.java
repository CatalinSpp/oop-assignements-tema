package models;

import models.cards.Card;
import services.CardsFactory;

import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(final ArrayList<Card> cards) {
        this.cards = cards;
    }

    public final ArrayList<Card> getCards() {
        return cards;
    }

    public final void setCards(final ArrayList<Card> cards) {
        this.cards = cards;
    }

    public final Deck clone() {
        ArrayList<Card> cardsClones = new ArrayList<>();
        for (Card card : cards) {
            cardsClones.add(CardsFactory.cloneCard(card));
        }
        return new Deck(cardsClones);
    }

    public final Card draw() {
        if (cards.size() >= 1) {
            return cards.remove(0);
        } else {
            return null;
        }
    }
}
