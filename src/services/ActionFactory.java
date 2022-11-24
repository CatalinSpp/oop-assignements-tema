package services;

import fileio.ActionsInput;
import models.actions.*;

public class ActionFactory {

    public static Action createAction(final ActionsInput action) {
        switch (action.getCommand()) {
            case "getPlayerDeck":
                return new GetPlayerDeckAction(action.getCommand(), action.getPlayerIdx());
            case "getPlayerHero":
                return new GetPlayerHeroAction(action.getCommand(), action.getPlayerIdx());
            case "getPlayerTurn":
                return new GetPlayerTurnAction(action.getCommand());
            case "endPlayerTurn":
                return new EndPlayerTurnAction(action.getCommand());
            case "getCardsInHand":
                return new GetCardsInHandAction(action.getCommand(), action.getPlayerIdx());
            case "placeCard":
                return new PlaceCardAction(action.getCommand(), action.getHandIdx());
            case "getPlayerMana":
                return new GetPlayerManaAction(action.getCommand(), action.getPlayerIdx());
            case "getCardsOnTable":
                return new GetCardsOnTableAction(action.getCommand());
            default:
        }

        return null;
    }

}
