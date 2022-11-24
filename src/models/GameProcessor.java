package models;

import com.fasterxml.jackson.databind.JsonNode;
import fileio.ActionsInput;
import models.actions.Action;
import services.ActionFactory;

import java.util.ArrayList;

public class GameProcessor {

    private final ArrayList<ActionsInput> actions;
    private final Game game;

    public GameProcessor(final Game game, final ArrayList<ActionsInput> actions) {
        this.game = game;
        this.actions = actions;
    }

    public final ArrayList<JsonNode> play() {
        ArrayList<JsonNode> results = new ArrayList<>();
        for (ActionsInput action : actions) {
            JsonNode result = doAction(action);
            if (result != null) {
                results.add(result);
            }
        }
        return results;
    }

    private JsonNode doAction(final ActionsInput actionInput) {
        Action action = ActionFactory.createAction(actionInput);
        // System.out.println(action.getClass().toString());
        if (action == null) {
            return null;
        }
        return action.doAction(game);
    }
}
