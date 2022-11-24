package models.cards.heroes;

import models.Board;
import models.cards.Character;
import fileio.CardInput;

public abstract class Hero extends Character {
    public static final int MAX_HERO_HEALTH = 30;
    public Hero(final CardInput cardInput) {
        super(cardInput);
        this.health = MAX_HERO_HEALTH;
    }
    public Hero(final Hero hero) {
        super(hero);
        this.health = MAX_HERO_HEALTH;
    }

    @Override
    public final Board.RowType getPlaceOnBoard() {
        return Board.RowType.OUTSIDE;
    }
}
