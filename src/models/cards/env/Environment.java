package models.cards.env;

import models.cards.Card;
import fileio.CardInput;

public abstract class Environment extends Card {

    public Environment(CardInput cardInput) {
        super(cardInput);
    }
}
