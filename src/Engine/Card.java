package engine;

import javax.swing.*;

public class Card {
    private int cost;
    private String name;
    private ImageIcon picture;

    public String getName() {
        return name;
    }

    public ImageIcon getPicture() {
        return picture;
    }

    public int getCost() {
        return cost;
    }

    public Card(int cost,String name, ImageIcon i) {
        this.cost = cost;
        this.picture = i;
        this.name = name;
    }
}


