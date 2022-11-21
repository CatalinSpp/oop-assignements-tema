package models.cards.heroes;

import models.cards.Character;
import fileio.CardInput;

public abstract class Hero extends Character {
    public Hero(CardInput cardInput) {
        super(cardInput);
        this.health = 30;
    }
    public Hero(Hero hero) {
        super(hero);
        this.health = 30;
    }

}
