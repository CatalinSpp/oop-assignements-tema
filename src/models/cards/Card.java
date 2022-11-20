package models.cards;

import fileio.CardInput;

import java.util.ArrayList;

public abstract class Card {
    protected String name;
    protected String description;
    protected int mana;
    protected ArrayList<String> colors;

    public Card(CardInput cardInput) {
        this.name = cardInput.getName();
        this.description = cardInput.getDescription();
        this.mana = cardInput.getMana();
        this.colors = cardInput.getColors();
    }

    public Card(Card card) {
        this.name = card.getName();
        this.description = card.getDescription();
        this.mana = card.getMana();
        this.colors = (ArrayList<String>) card.getColors().clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

}
