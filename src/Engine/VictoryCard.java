package engine;

import javax.swing.*;

public class VictoryCard extends Card {
    private int victoryPoints;

    public VictoryCard(int cost,int victoryPoints, String name, ImageIcon i) {
        super(cost, name, i);
        this.victoryPoints = victoryPoints;
    }

    public int getVictoryPoints() {
        return victoryPoints;
    }
}
