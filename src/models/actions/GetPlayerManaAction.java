package models.actions;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Game;

public class GetPlayerManaAction extends PlayerActions {

    public GetPlayerManaAction(String command, int playerIdx) {
        super(command, playerIdx);
    }

    @Override
    public JsonNode doAction(Game game) {
        ObjectNode node = initializeNode();

        if (playerIdx == 1) {
            node.put("output", game.getPlayerOne().getMana());
        } else {
            node.put("output", game.getPlayerTwo().getMana());
        }

        return node;
    }
}
