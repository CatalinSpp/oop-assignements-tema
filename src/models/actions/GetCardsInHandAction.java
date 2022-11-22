package models.actions;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Game;

public class GetCardsInHandAction extends PlayerActions {

    public GetCardsInHandAction(String command, int playerIdx) {
        super(command, playerIdx);
    }

    @Override
    public JsonNode doAction(Game game) {
        ObjectNode node = initializeNode();

        if (playerIdx == 1) {
            node.put("output", new ObjectMapper().valueToTree(game.getPlayerOne().getHand()));
        } else {
            node.put("output", new ObjectMapper().valueToTree(game.getPlayerTwo().getHand()));
        }

        return node;
    }
}
