package models.cards.minions;

import fileio.CardInput;
import models.Board;

public class Miraj extends SpecialMinion {
    public Miraj(final CardInput cardInput) {
        super(cardInput);
    }

    public Miraj(final Miraj miraj) {
        super(miraj);
    }

    @Override
    public final Board.RowType getPlaceOnBoard() {
        return Board.RowType.FRONT_ROW;
    }
}
