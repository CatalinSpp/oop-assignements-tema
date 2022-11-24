package models.cards.minions;

import fileio.CardInput;
import models.Board;

public class TheRipper extends SpecialMinion {
    public TheRipper(final CardInput cardInput) {
        super(cardInput);
    }

    @Override
    public final Board.RowType getPlaceOnBoard() {
        return Board.RowType.FRONT_ROW;
    }

    public TheRipper(final TheRipper theRipper) {
        super(theRipper);
    }


}
