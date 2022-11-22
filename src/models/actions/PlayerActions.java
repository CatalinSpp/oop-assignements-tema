package models.actions;

import com.fasterxml.jackson.databind.node.ObjectNode;

public abstract class PlayerActions extends Action {

    protected int playerIdx;

    public PlayerActions(String command, int playerIdx) {
        super(command);
        this.playerIdx = playerIdx;
    }

    @Override
    protected ObjectNode initializeNode() {
        ObjectNode node = super.initializeNode();
        node.put("playerIdx", playerIdx);
        return node;
    }
}
