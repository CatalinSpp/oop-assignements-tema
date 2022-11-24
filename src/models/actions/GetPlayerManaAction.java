package models.actions;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Game;

public class GetPlayerManaAction extends PlayerActions {

    public GetPlayerManaAction(final String command, final int playerIdx) {
        super(command, playerIdx);
    }

    @Override
    public final JsonNode doAction(final Game game) {
        ObjectNode node = initializeNode();

        if (playerIdx == 1) {
            node.put("output", game.getPlayerOne().getMana());
        } else {
            node.put("output", game.getPlayerTwo().getMana());
        }

        return node;
    }
}
