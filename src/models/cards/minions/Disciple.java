package models.cards.minions;

import fileio.CardInput;
import models.Board;

public class Disciple extends SpecialMinion {
    public Disciple(CardInput cardInput) {
        super(cardInput);
    }

    @Override
    public Board.RowType getPlaceOnBoard() {
        return Board.RowType.BACK_ROW;
    }

    public Disciple(Disciple disciple) {
        super(disciple);
    }

}
