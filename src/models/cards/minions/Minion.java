package models.cards.minions;

import models.cards.Character;
import fileio.CardInput;

public abstract class Minion extends Character {
    protected int attackDamage;

    public Minion(final CardInput cardInput) {
        super(cardInput);
        this.attackDamage = cardInput.getAttackDamage();
    }

    public Minion(final Minion minion) {
        super(minion);
        this.attackDamage = minion.getAttackDamage();
    }

    public final int getAttackDamage() {
        return attackDamage;
    }

    public final void setAttackDamage(final int attackDamage) {
        this.attackDamage = attackDamage;
    }
}
