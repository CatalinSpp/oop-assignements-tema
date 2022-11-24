package models;

import models.cards.Card;
import models.cards.heroes.Hero;

import java.util.ArrayList;

public class Player {
    private Deck deck;
    private Hero hero;
    private int mana = 0;
    private ArrayList<Card> hand = new ArrayList<>();

    public Player(final Deck deck, final Hero hero) {
        this.deck = deck;
        this.hero = hero;
    }

    public final Deck getDeck() {
        return deck;
    }

    public final Hero getHero() {
        return hero;
    }

    public final int getMana() {
        return mana;
    }

    public final ArrayList<Card> getHand() {
        return hand;
    }

    public final void draw() {
        Card card = deck.draw();
        if (card != null) {
            hand.add(card);
        }
    }

    public final void addMana(final int mana) {
        this.mana += mana;
    }

    public final Card peekCard(final int handIdx) {
        if (handIdx >= hand.size()) {
            return null;
        }

        return hand.get(handIdx);
    }

    public final Card getCardToPlay(final int handIdx) {
        Card card = hand.remove(handIdx);
        mana -= card.getMana();
        return card;
    }
}
