package models.cards.minions;

import fileio.CardInput;
import models.Board;

public class TheRipper extends SpecialMinion {
    public TheRipper(CardInput cardInput) {
        super(cardInput);
    }

    @Override
    public Board.RowType getPlaceOnBoard() {
        return Board.RowType.FRONT_ROW;
    }

    public TheRipper(TheRipper theRipper) {super(theRipper);}


}
