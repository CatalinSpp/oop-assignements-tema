package services;

import models.cards.Card;
import models.cards.env.Firestorm;
import models.cards.env.HeartHound;
import models.cards.env.Winterfell;
import models.cards.heroes.EmpressThorina;
import models.cards.heroes.GeneralKocioraw;
import models.cards.heroes.KingMudface;
import models.cards.heroes.LordRoyce;
import models.cards.minions.*;
import fileio.CardInput;

public class CardsFactory {
    public static Card createCard(CardInput cardInput) {

        switch (cardInput.getName()) {
            case "Sentinel":
                return new Sentinel(cardInput);
            case "Berserker":
                return new Berserker(cardInput);
            case "Goliath":
                return new Goliath(cardInput);
            case "Warden":
                return new Warden(cardInput);
            case "The Ripper":
                return new TheRipper(cardInput);
            case "Miraj":
                return new Miraj(cardInput);
            case "The Cursed One":
                return new TheCursedOne(cardInput);
            case "Disciple":
                return new Disciple(cardInput);
            case "Firestorm":
                return new Firestorm(cardInput);
            case "Winterfell":
                return new Winterfell(cardInput);
            case "Heart Hound":
                return new HeartHound(cardInput);
            case "Lord Royce":
                return new LordRoyce(cardInput);
            case "Empress Thorina":
                return new EmpressThorina(cardInput);
            case "King Mudface":
                return new KingMudface(cardInput);
            case "General Kocioraw":
                return new GeneralKocioraw(cardInput);
        }

        return null;
    }
}
