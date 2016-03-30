import java.util.ArrayList;
import java.util.Stack;

public class Player {
    private int actions = 0;
    private int coins = 0;
    private int buys = 0;
    private String naam;
    private ArrayList<Card> spelerHand;
    private ArrayList<Card> PlayArea;
    private Stack<Card> DiscardPile;
    private Stack<Card> SpelerDeck;

    public Player(Stack<Card> spelerDeck, String naam) {
        this.SpelerDeck= spelerDeck;
        this.naam = naam;
    }

    public void takeCardsFromDeck(){
        spelerHand.add(SpelerDeck.pop());
    }

    public void playAreaToDiscardpile(){
        PlayArea.addAll(DiscardPile);
    }

    public Stack<Card> getDeck() {
        return SpelerDeck;
    }

    public Stack<Card> getDiscardPile() {
        return DiscardPile;
    }

    public ArrayList<Card> getPlayArea() {
        return PlayArea;
    }

    public void setPlayArea(ArrayList<Card> playArea) {
        PlayArea = playArea;
    }

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

    public String getNaam() {
        return naam;
    }

    public ArrayList<Card> getSpelerHand() {
        return spelerHand;
    }


}
