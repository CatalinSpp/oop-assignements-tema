package models;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import fileio.ActionsInput;
import models.cards.Card;
import models.cards.heroes.Hero;

import java.util.ArrayList;

public class Game {

    private final Deck playerOneDeck;
    private final Deck playerTwoDeck;
    private final Hero playerOneHero;
    private final Hero playerTwoHero;
    private final int startingPlayer;
    private final ArrayList<ActionsInput> actions;

    private int currentPlayer;

    private ArrayList<Card> playerOneHand = new ArrayList<>();
    private ArrayList<Card> playerTwoHand = new ArrayList<>();

    public Game(Deck playerOneDeck, Deck playerTwoDeck, Hero playerOneHero, Hero playerTwoHero, int startingPlayer, ArrayList<ActionsInput> actions) {
        this.playerOneDeck = playerOneDeck;
        this.playerTwoDeck = playerTwoDeck;
        this.playerOneHero = playerOneHero;
        this.playerTwoHero = playerTwoHero;
        this.startingPlayer = startingPlayer;
        this.actions = actions;

        initializeGame();
    }

    private void initializeGame() {
        currentPlayer = startingPlayer;
        playerOneHand.add(playerOneDeck.draw());
        playerTwoHand.add(playerTwoDeck.draw());
    }

    public ArrayList<JsonNode> play() {
        ArrayList<JsonNode> results = new ArrayList<>();
        for (ActionsInput action : actions) {
            JsonNode result = doAction(action);
            results.add(result);
        }
        return results;
    }

    private JsonNode doAction(ActionsInput action) {
        switch (action.getCommand()) {
            case "getPlayerDeck":
                return getPlayerDeck(action);
            case "getPlayerHero":
                return getPlayerHero(action);
            case "getPlayerTurn":
                return getPlayerTurn(action);
        }

        return null;
    }

    private JsonNode getPlayerDeck(ActionsInput action) {
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectNode objectNode = objectMapper.createObjectNode();
        objectNode.put("command", action.getCommand());
        objectNode.put("playerIdx", action.getPlayerIdx());

        if (action.getPlayerIdx() == 1) {
            objectNode.put("output", objectMapper.valueToTree(playerOneDeck.getCards()));
        } else {
            objectNode.put("output", objectMapper.valueToTree(playerTwoDeck.getCards()));
        }

        return objectNode;
    }

    private JsonNode getPlayerHero(ActionsInput action) {
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectNode objectNode = objectMapper.createObjectNode();
        objectNode.put("command", action.getCommand());
        objectNode.put("playerIdx", action.getPlayerIdx());

        if (action.getPlayerIdx() == 1) {
            objectNode.put("output", objectMapper.valueToTree(playerOneHero));
        } else {
            objectNode.put("output", objectMapper.valueToTree(playerTwoHero));
        }

        return objectNode;
    }

    private JsonNode getPlayerTurn(ActionsInput action) {
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectNode objectNode = objectMapper.createObjectNode();
        objectNode.put("command", action.getCommand());
        objectNode.put("output", currentPlayer);

        return objectNode;
    }

}
