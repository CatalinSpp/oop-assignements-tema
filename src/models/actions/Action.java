package models.actions;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Game;

public abstract class Action {
    protected String command;

    public Action(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

    protected ObjectNode initializeNode() {
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectNode objectNode = objectMapper.createObjectNode();
        objectNode.put("command", command);
        return objectNode;
    }

    public abstract JsonNode doAction(Game game);
}
