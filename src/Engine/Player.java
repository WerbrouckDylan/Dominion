package engine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Player {
    private int actions = 0;
    private int coins = 0;
    private int buys = 0;
    private String naam;
    private ArrayList<Card> spelerHand = new ArrayList<Card>();
    private ArrayList<Card> PlayArea = new ArrayList<Card>();
    private Stack<Card> DiscardPile = new Stack<Card>();
    private Stack<Card> SpelerDeck = new Stack<Card>();

    public void ShuffleDeck(){
        Collections.shuffle(SpelerDeck);
    }

    public Player(Stack<Card> spelerDeck,Stack<Card> discardpile, String naam) {
        this.SpelerDeck= spelerDeck;
        this.DiscardPile = discardpile;
        this.naam = naam;
    }

    public void initStartingDeck(){
        for (int i = 0; i < 7; i++) {
            SpelerDeck.add(CardsEnum.getCard(CardsEnum.Copper));
        }
        for (int i = 0; i < 3; i++) {
            SpelerDeck.add(CardsEnum.getCard(CardsEnum.Estate));
        }
        Collections.shuffle(SpelerDeck);
    }

    public void discardPileToDeck(){
        SpelerDeck.addAll(DiscardPile);
    }

    public void takeCardsFromDeck(){
       spelerHand.add(SpelerDeck.pop());
    }

    public void playAreaToDiscardpile(){
        PlayArea.addAll(DiscardPile);
    }

    public void handToDiscardPile(){
        DiscardPile.addAll(spelerHand);
        spelerHand.clear();
    }

    public Stack<Card> getSpelerDeck() {
        return SpelerDeck;
    }

    public Stack<Card> getDiscardPile() {
        return DiscardPile;
    }

    public void setSpelerDeck(Stack<Card> spelerDeck){
        this.SpelerDeck = spelerDeck;
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