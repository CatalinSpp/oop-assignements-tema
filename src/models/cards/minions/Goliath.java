package models.cards.minions;

import fileio.CardInput;
import models.Board;

public class Goliath extends Minion {
    public Goliath(CardInput cardInput) {
        super(cardInput);
    }

    public Goliath(Goliath goliath) {super(goliath);}

    @Override
    public Board.RowType getPlaceOnBoard() {
        return Board.RowType.FRONT_ROW;
    }
}
