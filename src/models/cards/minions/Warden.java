package models.cards.minions;

import fileio.CardInput;
import models.Board;

public class Warden extends Minion {
    public Warden(final CardInput cardInput) {
        super(cardInput);
    }

    public Warden(final Warden warden) {
        super(warden);
    }

    @Override
    public final Board.RowType getPlaceOnBoard() {
        return Board.RowType.FRONT_ROW;
    }

}
