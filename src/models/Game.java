package models;

import models.actions.PlaceCardAction;
import models.cards.Card;
import models.cards.Character;
import models.cards.env.Environment;
import models.cards.heroes.Hero;

public class Game {
    private Player playerOne;
    private Player playerTwo;
    private int currentPlayerIdx;

    private int startingPlayer;
    private int currentRound = 1;
    private final static int MAX_MANA_TO_ADD = 10;
    private final Board board = new Board();

    public Game(Deck playerOneDeck, Deck playerTwoDeck, Hero playerOneHero, Hero playerTwoHero, int startingPlayer) {
        this.playerOne = new Player(playerOneDeck, playerOneHero);
        this.playerTwo = new Player(playerTwoDeck, playerTwoHero);
        this.startingPlayer = startingPlayer;
        this.currentPlayerIdx = startingPlayer;

        startNextRound();
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public int getCurrentPlayerIdx() {
        return currentPlayerIdx;
    }

    public int getCurrentRound() {
        return currentRound;
    }

    public Board getBoard() {
        return board;
    }

    private void startNextRound() {
        playerOne.draw();
        playerTwo.draw();

        playerOne.addMana(Math.min(currentRound, MAX_MANA_TO_ADD));
        playerTwo.addMana(Math.min(currentRound, MAX_MANA_TO_ADD));

        // System.out.println("Round started");
    }

    private void endRound() {
        currentRound++;
        // System.out.println("Round ended");
    }

    public void endPlayerTurn() {
        // System.out.println("Player " + currentPlayerIdx + " turn ended");

        currentPlayerIdx = 3 - currentPlayerIdx;
        if(currentPlayerIdx == startingPlayer) {
            endRound();
            startNextRound();
        }
    }

    private Player getCurrentPlayer() {
        if(currentPlayerIdx == 1) {
            return playerOne;
        } else {
            return playerTwo;
        }
    }

    public PlaceCardAction.PlaceCardResult placeCard(int handIdx) {
        Card card = getCurrentPlayer().peekCard(handIdx);

        if(card == null) {
            return PlaceCardAction.PlaceCardResult.CARD_IS_ENV;
        }

        if(card instanceof Environment) {
            return PlaceCardAction.PlaceCardResult.CARD_IS_ENV;
        }
        Character character = (Character) card;

        if(getCurrentPlayer().getMana() < card.getMana()) {
            return PlaceCardAction.PlaceCardResult.NOT_ENOUGH_MANA;
        }
        if(!board.isRoom(character.getPlaceOnBoard(), currentPlayerIdx)) {
            return PlaceCardAction.PlaceCardResult.ROW_IS_FULL;
        }

        Card cardToPlay = getCurrentPlayer().getCardToPlay(handIdx);
        board.playCard(cardToPlay, character.getPlaceOnBoard(), currentPlayerIdx);

        return PlaceCardAction.PlaceCardResult.OK;
    }

}
