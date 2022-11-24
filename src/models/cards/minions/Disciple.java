package models.cards.minions;

import fileio.CardInput;
import models.Board;

public class Disciple extends SpecialMinion {
    public Disciple(final CardInput cardInput) {
        super(cardInput);
    }

    @Override
    public final Board.RowType getPlaceOnBoard() {
        return Board.RowType.BACK_ROW;
    }

    public Disciple(final Disciple disciple) {
        super(disciple);
    }

}
