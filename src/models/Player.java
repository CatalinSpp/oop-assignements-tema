package models;

import models.cards.Card;
import models.cards.heroes.Hero;

import java.util.ArrayList;

public class Player {
    private Deck deck;
    private Hero hero;
    private int mana = 0;
    private ArrayList<Card> hand = new ArrayList<>();

    public Player(Deck deck, Hero hero) {
        this.deck = deck;
        this.hero = hero;
    }

    public Deck getDeck() {
        return deck;
    }

    public Hero getHero() {
        return hero;
    }

    public int getMana() {
        return mana;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void draw() {
        Card card = deck.draw();
        if(card != null) {
            hand.add(card);
        }
    }

    public void addMana(int mana) {
        this.mana += mana;
    }

    public Card peekCard(int handIdx) {
        if(handIdx >= hand.size()) {
            return null;
        }

        return hand.get(handIdx);
    }

    public Card getCardToPlay(int handIdx) {
        Card card = hand.remove(handIdx);
        mana -= card.getMana();
        return card;
    }
}
