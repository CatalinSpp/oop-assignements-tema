package models.cards;

import fileio.CardInput;
import models.Board;

public abstract class Character extends Card {
    protected int health;

    public Character(CardInput cardInput) {
        super(cardInput);
        this.health = cardInput.getHealth();
    }

    public Character(Character character) {
        super(character);
        this.health = character.getHealth();
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract Board.RowType getPlaceOnBoard();
}
