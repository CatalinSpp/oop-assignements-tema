package models.cards.minions;

import fileio.CardInput;
import models.Board;

public class Warden extends Minion {
    public Warden(CardInput cardInput) {
        super(cardInput);
    }

    public Warden(Warden warden) {
        super(warden);
    }

    @Override
    public Board.RowType getPlaceOnBoard() {
        return Board.RowType.FRONT_ROW;
    }

}
