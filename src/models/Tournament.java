package models;

import com.fasterxml.jackson.databind.JsonNode;
import fileio.*;
import models.cards.Card;
import models.cards.heroes.Hero;
import services.CardsFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

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
            Game game = parseGame(gameInput);
            ArrayList<JsonNode> gameResult = game.play();
            results.addAll(gameResult);
        }
        return results;
    }

    private Game parseGame(GameInput gameInput) {
        Deck playerOneDeck = playerOneDecks.get(gameInput.getStartGame().getPlayerOneDeckIdx()).clone();
        Deck playerTwoDeck = playerTwoDecks.get(gameInput.getStartGame().getPlayerTwoDeckIdx()).clone();
        Hero playerOneHero = (Hero) CardsFactory.createCard(gameInput.getStartGame().getPlayerOneHero());
        Hero playerTwoHero = (Hero) CardsFactory.createCard(gameInput.getStartGame().getPlayerTwoHero());

        shuffleCards(playerOneDeck, gameInput.getStartGame().getShuffleSeed());
        shuffleCards(playerTwoDeck, gameInput.getStartGame().getShuffleSeed());

        int startingPlayer = gameInput.getStartGame().getStartingPlayer();

        return new Game(playerOneDeck, playerTwoDeck, playerOneHero, playerTwoHero, startingPlayer,
                gameInput.getActions());
    }

    private void shuffleCards(Deck deck, long shuffleSeed) {
        Random random = new Random(shuffleSeed);
        Collections.shuffle(deck.getCards(), random);
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
