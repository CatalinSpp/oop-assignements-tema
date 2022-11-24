package models.cards.minions;

import fileio.CardInput;

public abstract class SpecialMinion extends Minion {

    public SpecialMinion(final CardInput cardInput) {
        super(cardInput);
    }

    public SpecialMinion(final SpecialMinion specialMinion) {
        super(specialMinion);
    }

}
