package models;

import com.fasterxml.jackson.databind.JsonNode;
import fileio.CardInput;
import fileio.DecksInput;
import fileio.GameInput;
import fileio.Input;
import models.cards.Card;
import services.CardsFactory;

import java.util.ArrayList;

public class Tournament {

    private ArrayList<Deck> playerOneDecks;
    private ArrayList<Deck> playerTwoDecks;
    private ArrayList<GameInput> gameInputs;


    public Tournament(Input input) {
        playerOneDecks = parseDeckInput(input.getPlayerOneDecks());
        playerTwoDecks = parseDeckInput(input.getPlayerTwoDecks());
        gameInputs = input.getGames();
    }

    public ArrayList<JsonNode> play() {
        ArrayList<JsonNode> results = new ArrayList<>();
        for (GameInput gameInput : gameInputs) {
            Game game = new Game(playerOneDeck, playerTwoDeck, playerOneHero, playerTwoHero, startingPlayer);
            ArrayList<JsonNode> gameResult = game.play();
            results.addAll(gameResult);
        }
        return results;
    }

    private Game parseGame(GameInput gameInput) {
        Deck playerOneDeck = playerOneDecks.get(gameInput.getStartGame().getPlayerOneDeckIdx()).clone();

    }

    private ArrayList<Deck> parseDeckInput(DecksInput decksInput) {
        ArrayList<Deck> result = new ArrayList<>();
        for (ArrayList<CardInput> deckInput : decksInput.getDecks()) {
            ArrayList<Card> cards = new ArrayList<>();
            for (CardInput cardInput : deckInput) {
                Card card = CardsFactory.createCard(cardInput);
                cards.add(card);
            }
            Deck deck = new Deck(cards);
            result.add(deck);
        }
        return result;
    }
}
