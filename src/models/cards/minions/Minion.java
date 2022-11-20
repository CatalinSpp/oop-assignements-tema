package models.cards.minions;

import models.cards.Character;
import fileio.CardInput;

public abstract class Minion extends Character {
    protected int attackDamage;

    public Minion(CardInput cardInput) {
        super(cardInput);
        this.attackDamage = cardInput.getAttackDamage();
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }
}
