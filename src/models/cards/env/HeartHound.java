package models.cards.env;

import fileio.CardInput;

public class HeartHound extends Environment {
    public HeartHound(CardInput cardInput) {
        super(cardInput);
    }

    public HeartHound(HeartHound heartHound) {
        super(heartHound);
    }

}
