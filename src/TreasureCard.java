import javax.swing.*;

public class TreasureCard extends Card {
    private int coinValue;

    public TreasureCard(int cost,int coinValue, String name, ImageIcon i) {
        super(cost, name, i);
        this.coinValue = coinValue;

    }

    public int getCoinValue() {
        return coinValue;
    }
}
