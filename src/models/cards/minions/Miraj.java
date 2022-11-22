package models.cards.minions;

import fileio.CardInput;
import models.Board;

public class Miraj extends SpecialMinion {
    public Miraj(CardInput cardInput) {
        super(cardInput);
    }

    public Miraj(Miraj miraj) {
        super(miraj);
    }

    @Override
    public Board.RowType getPlaceOnBoard() {
        return Board.RowType.FRONT_ROW;
    }
}
