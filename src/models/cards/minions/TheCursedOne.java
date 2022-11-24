package models.cards.minions;

import fileio.CardInput;
import models.Board;

public class TheCursedOne extends SpecialMinion {
    public TheCursedOne(final CardInput cardInput) {
        super(cardInput);
    }

    @Override
    public final Board.RowType getPlaceOnBoard() {
        return Board.RowType.BACK_ROW;
    }

    public TheCursedOne(final TheCursedOne theCursedOne) {
        super(theCursedOne);
    }
}
