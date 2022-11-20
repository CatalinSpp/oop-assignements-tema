package models;

import models.cards.Card;
import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public Deck clone() {
        ArrayList<Card> cardsClones = new ArrayList<>();
        for(Card card : cards) {
            cardsClones.add(card.clone());
        }
        return new Deck(cardsClones);
    }

}
