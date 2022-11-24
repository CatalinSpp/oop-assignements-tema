package models.cards.env;

import fileio.CardInput;

public class HeartHound extends Environment {
    public HeartHound(final CardInput cardInput) {
        super(cardInput);
    }

    public HeartHound(final HeartHound heartHound) {
        super(heartHound);
    }

}
