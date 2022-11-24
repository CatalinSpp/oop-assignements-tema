package models.actions;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Game;

public class GetPlayerTurnAction extends Action {

    public GetPlayerTurnAction(final String command) {
        super(command);
    }

    @Override
    public final JsonNode doAction(final Game game) {
        ObjectNode node = initializeNode();
        node.put("output", game.getCurrentPlayerIdx());
        return node;
    }

}
