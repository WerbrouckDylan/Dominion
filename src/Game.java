import java.util.*;

public class Game {
    private ArrayList<Card> HandKaarten = new ArrayList<Card>();

    public Game() {

    }

    public static void main(String[] args) {
        Stack<Card> speler1Deck = new Stack<Card>();
        Stack<Card> speler1DiscardPile = new Stack<Card>();
        Player joske = new Player(speler1Deck, speler1DiscardPile, "joske");

        joske.setStartingDeck(speler1Deck);
        System.out.println("-------startingdeck joske------");
        PrintStack(joske.getSpelerDeck());

        for(int i = 0; i < 5; i++) {
            joske.takeCardsFromDeck();
        }

        System.out.println("--------------deck-------------");
        PrintStack(joske.getSpelerDeck());

        System.out.println("--------------hand-------------");
        PrintArray(joske.getSpelerHand());

        System.out.println("-----------discardpile--------");
        joske.handToDiscardPile();
        PrintStack(joske.getDiscardPile());

        System.out.println("-----------deck---------");
        joske.discardPileToDeck();
        PrintStack(joske.getSpelerDeck());

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