package engine;

import javax.swing.*;

public class KingdomCard extends Card {
    private AbilityEnum ability;

    public KingdomCard(int cost,AbilityEnum ability ,String name, ImageIcon i) {
        super(cost, name, i);
        this.ability = ability;
    }

    public void doAbility(){
        AbilityEnum.doShit(ability);
    }
}
