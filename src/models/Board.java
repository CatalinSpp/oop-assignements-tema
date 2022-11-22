package models;

import models.cards.Card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {

    public ArrayList<Card> playTwoBackRow = new ArrayList<>();
    public ArrayList<Card> playerTwoFrontRow = new ArrayList<>();
    public ArrayList<Card> playerOneFrontRow = new ArrayList<>();
    public ArrayList<Card> playerOneBackRow = new ArrayList<>();

    public List<ArrayList<Card>> getCardsOnTable() {
        return  Arrays.asList(playTwoBackRow, playerTwoFrontRow, playerOneFrontRow, playerOneBackRow);
    }
    public boolean isRoom(RowType rowType, int currentPlayerIdx) {
        ArrayList<Card> row = getRow(rowType, currentPlayerIdx);
        if (row.size() >= 5) {
            return false;
        }
        return true;
    }

    public ArrayList<Card> getRow(RowType rowType, int currentPlayerIdx) {
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

    public void playCard(Card card, RowType rowType, int currentPlayerIdx) {
        ArrayList<Card> row = getRow(rowType, currentPlayerIdx);
        row.add(card);
    }

    public enum RowType {
        BACK_ROW,
        FRONT_ROW,
        OUTSIDE
    }
}
