package models.cards.env;

import fileio.CardInput;

public class Winterfell extends Environment {
    public Winterfell(CardInput cardInput) {
        super(cardInput);
    }

    public Winterfell(Winterfell winterfell) {
        super(winterfell);
    }

}
