package models.cards.minions;

import fileio.CardInput;
import models.Board;

public class Berserker extends Minion {

    public Berserker(CardInput cardInput) {
        super(cardInput);
    }

    @Override
    public Board.RowType getPlaceOnBoard() {
        return Board.RowType.BACK_ROW;
    }

    public Berserker(Berserker berserker) {
        super(berserker);
    }



}
