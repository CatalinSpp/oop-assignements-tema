package models.actions;

import com.fasterxml.jackson.databind.JsonNode;
import models.Game;

public class EndPlayerTurnAction extends Action{

    public EndPlayerTurnAction(String command) {
        super(command);
    }

    @Override
    public JsonNode doAction(Game game) {
        game.endPlayerTurn();
        return null;
    }

}
