package models.actions;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Game;

public class GetCardsOnTableAction extends Action {

    public GetCardsOnTableAction(final String command) {
        super(command);
    }

    @Override
    public final JsonNode doAction(final Game game) {
        ObjectNode node = initializeNode();
        node.put("output", new ObjectMapper().valueToTree(game.getBoard().getCardsOnTable()));
        return node;
    }

}
