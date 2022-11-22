package models.actions;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Game;

public class PlaceCardAction extends Action{

    private final int handIdx;

    public PlaceCardAction(String command, int handIdx) {
        super(command);
        this.handIdx = handIdx;
    }

    @Override
    public JsonNode doAction(Game game) {

        PlaceCardResult result = game.placeCard(handIdx);
        if(result == PlaceCardResult.OK) {
            return null;
        }

        ObjectNode node = initializeNode();
        node.put("handIdx", handIdx);
        String error = "";

        switch (result) {
            case CARD_IS_ENV -> {
                error = "Cannot place environment card on table.";
            }
            case NOT_ENOUGH_MANA -> {
                error = "Not enough mana to place card on table.";
            }
            case ROW_IS_FULL -> {
                error = "Cannot place card on table since row is full.";
            }
        }
        node.put("error", error);

        return node;
    }

    public static enum PlaceCardResult {
        OK,
        CARD_IS_ENV,
        NOT_ENOUGH_MANA,
        ROW_IS_FULL
    }

}
