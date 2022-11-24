package models.cards.env;

import fileio.CardInput;

public class Winterfell extends Environment {
    public Winterfell(final CardInput cardInput) {
        super(cardInput);
    }

    public Winterfell(final Winterfell winterfell) {
        super(winterfell);
    }

}
