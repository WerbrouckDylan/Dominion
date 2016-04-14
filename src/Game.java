import java.util.*;

public class Game {
    private ArrayList<Card> HandKaarten = new ArrayList<Card>();

    public Stack<Card> starthandtest = new Stack<Card>();

    public Game() {

    }
    public ArrayList<Card> getAHand(){
        ArrayList<Card> hand = new ArrayList<Card>();

        for (int i = 0; i < 5; i++) {
            hand.add(this.HandKaarten.get(i));
        }
        return hand;
    }

    public static void main(String[] args) {
        Stack<Card> speler1stack = new Stack<Card>();
        Player joske = new Player(speler1stack, "joske");
        joske.setStartingDeck(speler1stack);
        PrintStack(speler1stack);
        System.out.println("----------------");
        for(int i = 0; i < 5; i++) {
            joske.takeCardsFromDeck();
        }

        System.out.println("hand");
        PrintArray(joske.getSpelerHand());
        System.out.println("deck");
        PrintStack(speler1stack);
    }

    public ArrayList<Card> getHandKaarten() {
        return HandKaarten;
    }

    public void ShuffleHandCards(){
        Collections.shuffle(HandKaarten);
    }

    public static void PrintArray(ArrayList<Card> kaarten){
        for (int kaart = 0; kaart < kaarten.size(); kaart++) {
            System.out.println(kaarten.get(kaart).getName());
            try{
                TreasureCard treasureCard = ((TreasureCard)kaarten.get(kaart));
                //System.out.println("Value is= " + treasureCard.getCoinValue());
                //System.out.println();
            }catch(ClassCastException e){
            }
        }
    }

    public static void PrintStack(Stack<Card> kaarten){
        for (int kaart = 0; kaart < kaarten.size(); kaart++) {
            System.out.println(kaarten.get(kaart).getName());
            try{
                TreasureCard treasureCard = ((TreasureCard)kaarten.get(kaart));
                //System.out.println("Value is= " + treasureCard.getCoinValue());
                //System.out.println();
            }catch(ClassCastException e){
            }
        }
    }

    public static int getTotalCoinValue(ArrayList<Card> kaarten){
        //PrettyPrintCards(HandKaarten);
        int totalValue = 0;
        for (int i = 0; i < kaarten.size(); i++) {
             try {
                 TreasureCard treasureCard = (TreasureCard)kaarten.get(i);
                 totalValue += treasureCard.getCoinValue();
             }catch (ClassCastException e){}

        }
        System.out.println("Total Value= " + totalValue);
        return totalValue;
    }

    //foefelinge
    public static int getVictorypoints(ArrayList<Card> kaarten){
        int Victorypoints = 0;
        for (int i = 0; i < kaarten.size(); i++){
            try {
                VictoryCard victoryCard = (VictoryCard)kaarten.get(i);
                Victorypoints += victoryCard.getVictoryPoints();
            }catch (ClassCastException e){}
        }
        System.out.println("Victorypoints= " + Victorypoints);
        return Victorypoints;
    }
}



