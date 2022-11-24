package models.cards.minions;

import fileio.CardInput;
import models.Board;

public class Berserker extends Minion {

    public Berserker(final CardInput cardInput) {
        super(cardInput);
    }

    @Override
    public final Board.RowType getPlaceOnBoard() {
        return Board.RowType.BACK_ROW;
    }

    public Berserker(final Berserker berserker) {
        super(berserker);
    }


}
