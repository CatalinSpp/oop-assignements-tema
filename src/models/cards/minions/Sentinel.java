package models.cards.minions;

import fileio.CardInput;

public class Sentinel extends Minion {
    public Sentinel(CardInput cardInput) {
        super(cardInput);
    }
    public Sentinel(Sentinel sentinel) {
        super(sentinel);
    }

}
