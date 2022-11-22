package models.cards.minions;

import fileio.CardInput;
import models.Board;

public class Sentinel extends Minion {
    public Sentinel(CardInput cardInput) {
        super(cardInput);
    }

    public Sentinel(Sentinel sentinel) {
        super(sentinel);
    }

    @Override
    public Board.RowType getPlaceOnBoard() {
        return Board.RowType.BACK_ROW;
    }
}
