package models.cards.env;

import models.cards.Card;
import fileio.CardInput;

public abstract class Environment extends Card {
    public Environment(final CardInput cardInput) {
        super(cardInput);
    }

    public Environment(final Environment environment) {
        super(environment);
    }

}
