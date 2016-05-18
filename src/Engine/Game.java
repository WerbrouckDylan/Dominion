package engine;

import java.util.*;

public class Game {
    public ArrayList<Stack<Card>> BuyArea = new ArrayList<Stack<Card>>();

    public Game() {

    }

    public static void isDeckLeeg(Player speler){
        if(speler.getSpelerDeck().size() == 0){
            speler.discardPileToDeck();
        }
    }

    public static void PrintArray(ArrayList<Card> kaarten){
     for (int kaart = 0; kaart < kaarten.size(); kaart++) {
        System.out.println(kaarten.get(kaart).getName());
        try{
            TreasureCard treasureCard = ((TreasureCard)kaarten.get(kaart));
        }catch(ClassCastException e){
        }
    }
}

    public static void PrintStack(Stack<Card> kaarten){
        for (int kaart = 0; kaart < kaarten.size(); kaart++) {
            System.out.println(kaarten.get(kaart).getName());
            try{
                TreasureCard treasureCard = ((TreasureCard)kaarten.get(kaart));
            }catch(ClassCastException e){
            }
        }
    }

    public static int getTotalCoinValue(ArrayList<Card> kaarten){
        int totalValue = 0;
        for (int i = 0; i < kaarten.size(); i++) {
             try {
                 TreasureCard treasureCard = (TreasureCard)kaarten.get(i);
                 totalValue += treasureCard.getCoinValue();
             }catch (ClassCastException e){}
        }
        System.out.println("Total Value = " + totalValue);
        return totalValue;
    }

    public static int getVictorypoints(ArrayList<Card> kaarten){
        int Victorypoints = 0;
        for (int i = 0; i < kaarten.size(); i++){
            try {
                VictoryCard victoryCard = (VictoryCard)kaarten.get(i);
                Victorypoints += victoryCard.getVictoryPoints();
            }catch (ClassCastException e){}
        }
        System.out.println("Victorypoints = " + Victorypoints);
        return Victorypoints;
    }
}