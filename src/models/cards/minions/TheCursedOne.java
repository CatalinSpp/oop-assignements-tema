package models.cards.minions;

import fileio.CardInput;
import models.Board;

public class TheCursedOne extends SpecialMinion {
    public TheCursedOne(CardInput cardInput) {
        super(cardInput);
    }

    @Override
    public Board.RowType getPlaceOnBoard() {
        return Board.RowType.BACK_ROW;
    }

    public TheCursedOne(TheCursedOne theCursedOne) {
        super(theCursedOne);
    }
}
