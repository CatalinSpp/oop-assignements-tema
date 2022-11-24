package models.cards;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import fileio.CardInput;

import java.util.ArrayList;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,
        getterVisibility = JsonAutoDetect.Visibility.NONE)
public abstract class Card {
    protected String name;
    protected String description;
    protected int mana;
    protected ArrayList<String> colors;

    public Card(final CardInput cardInput) {
        this.name = cardInput.getName();
        this.description = cardInput.getDescription();
        this.mana = cardInput.getMana();
        this.colors = cardInput.getColors();
    }

    public Card(final Card card) {
        this.name = card.getName();
        this.description = card.getDescription();
        this.mana = card.getMana();
        this.colors = (ArrayList<String>) card.getColors().clone();
    }

    public final String getName() {
        return name;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public final String getDescription() {
        return description;
    }

    public final void setDescription(final String description) {
        this.description = description;
    }

    public final int getMana() {
        return mana;
    }

    public final void setMana(final int mana) {
        this.mana = mana;
    }

    public final ArrayList<String> getColors() {
        return colors;
    }

    public final void setColors(final ArrayList<String> colors) {
        this.colors = colors;
    }

}
