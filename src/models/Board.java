package models;

import models.cards.Card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {
    public static final int MAX_CARDS_ON_ROW = 5;

    private ArrayList<Card> playTwoBackRow = new ArrayList<>();
    private ArrayList<Card> playerTwoFrontRow = new ArrayList<>();
    private ArrayList<Card> playerOneFrontRow = new ArrayList<>();
    private ArrayList<Card> playerOneBackRow = new ArrayList<>();

    public final List<ArrayList<Card>> getCardsOnTable() {
        return  Arrays.asList(playTwoBackRow,
                playerTwoFrontRow, playerOneFrontRow, playerOneBackRow);
    }
    public final boolean isRoom(final RowType rowType, final int currentPlayerIdx) {
        ArrayList<Card> row = getRow(rowType, currentPlayerIdx);
        if (row.size() >= MAX_CARDS_ON_ROW) {
            return false;
        }
        return true;
    }

    public final ArrayList<Card> getRow(final RowType rowType, final int currentPlayerIdx) {
        if (currentPlayerIdx == 1) {
            if (rowType == rowType.BACK_ROW) {
                return playerOneBackRow;
            } else {
                return playerOneFrontRow;
            }
        } else {
            if (rowType == rowType.BACK_ROW) {
                return playTwoBackRow;
            } else {
                return playerTwoFrontRow;
            }
        }
    }

    public final void playCard(final Card card, final RowType rowType, final int currentPlayerIdx) {
        ArrayList<Card> row = getRow(rowType, currentPlayerIdx);
        row.add(card);
    }

    public enum RowType {
        BACK_ROW,
        FRONT_ROW,
        OUTSIDE
    }
}
