package models.cards.minions;

import models.cards.Character;
import fileio.CardInput;

import javax.swing.plaf.basic.BasicRadioButtonMenuItemUI;

public abstract class Minion extends Character {
    protected int attackDamage;

    public Minion(CardInput cardInput) {
        super(cardInput);
        this.attackDamage = cardInput.getAttackDamage();
    }

    public Minion(Minion minion) {
        super(minion);
        this.attackDamage = minion.getAttackDamage();
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }
}
