package models.actions;

import com.fasterxml.jackson.databind.JsonNode;
import models.Game;

public class EndPlayerTurnAction extends Action {

    public EndPlayerTurnAction(final String command) {
        super(command);
    }

    @Override
    public final JsonNode doAction(final Game game) {
        game.endPlayerTurn();
        return null;
    }

}
