import java.util.*;

public class Game {
    private ArrayList<Card> HandKaarten = new ArrayList<Card>();            //maak een private ArrayList waar objecten van het type Card inzitten met de naam 'HandKaarten'

    public static void main(String[] args) {

    }


    public ArrayList<Card> getHandKaarten() {                               //een getter voor de ArrayList 'HandKaarten'
        return HandKaarten;
    }

    public void ShuffleHandCards(){
        Collections.shuffle(HandKaarten);
    }

    public Game() {                                                         //methode om de eerste 10 HandKaarten(7 copper, 3 estate) in de ArrayList 'HandKaarten' te stoppen
        for (int i = 0; i < 7; i++) {
            HandKaarten.add(CardsEnum.getCard(CardsEnum.Copper));           //stopt 7 copper HandKaarten in de ArrayList 'HandKaarten' ; CardsEnum.getCard(CardsEnum.'inserthierjekaart')
        }
        for (int i = 0; i < 3; i++) {
            HandKaarten.add(CardsEnum.getCard(CardsEnum.Estate));
        }                                                                   //'HandKaarten' bevat nu 7 copper en 3 estate, in volgorde
        ShuffleHandCards();                                                     //shuffled de arrylist 'HandKaarten'

    }
    public ArrayList<Card> getAHand(){                                      //methode om en hand te maken(5 HandKaarten)
        ArrayList<Card> hand = new ArrayList<Card>();                       //maakt een nieuwe ArrayList aan van het type 'Card' met als naam 'hand'//

        for (int i = 0; i < 5; i++) {
             hand.add(this.HandKaarten.get(i));
        }
        return hand;
    }

    public static void PrettyPrintCards(ArrayList<Card> kaarten){
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



