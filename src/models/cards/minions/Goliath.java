package models.cards.minions;

import fileio.CardInput;
import models.Board;

public class Goliath extends Minion {
    public Goliath(final CardInput cardInput) {
        super(cardInput);
    }

    public Goliath(final Goliath goliath) {
        super(goliath);
    }

    @Override
    public final Board.RowType getPlaceOnBoard() {
        return Board.RowType.FRONT_ROW;
    }

}
