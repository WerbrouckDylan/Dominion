import java.util.ArrayList;

public class Player {
    private int actions = 0;
    private int coins = 0;
    private int buys = 0;

    public void setActions(int actions) {
        this.actions = actions;
    }

    public int getActions() {
        return actions;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public int getBuys() {
        return buys;
    }

    public void setBuys(int buys) {
        this.buys = buys;
    }

    private String naam;
    private ArrayList<Card> spelerHand;

    public Player(ArrayList<Card> spelerHand, String naam) {
        this.spelerHand = spelerHand;
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public ArrayList<Card> getSpelerHand() {
        return spelerHand;
    }


}
