package models.cards.env;

import fileio.CardInput;

public class Firestorm extends Environment {
    public Firestorm(final CardInput cardInput) {
        super(cardInput);
    }

    public Firestorm(final Firestorm firestorm) {
        super(firestorm);
    }

}
