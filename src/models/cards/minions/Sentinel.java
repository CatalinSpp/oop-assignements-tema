package models.cards.minions;

import fileio.CardInput;
import models.Board;

public class Sentinel extends Minion {
    public Sentinel(final CardInput cardInput) {
        super(cardInput);
    }

    public Sentinel(final Sentinel sentinel) {
        super(sentinel);
    }

    @Override
    public final Board.RowType getPlaceOnBoard() {
        return Board.RowType.BACK_ROW;
    }
}
