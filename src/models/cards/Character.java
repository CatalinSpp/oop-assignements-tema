package models.cards;

import fileio.CardInput;
import models.Board;

public abstract class Character extends Card {
    protected int health;

    public Character(final CardInput cardInput) {
        super(cardInput);
        this.health = cardInput.getHealth();
    }

    public Character(final Character character) {
        super(character);
        this.health = character.getHealth();
    }

    public final int getHealth() {
        return health;
    }

    public final void setHealth(final int health) {
        this.health = health;
    }

    public abstract Board.RowType getPlaceOnBoard();
}
