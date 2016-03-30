import java.util.*;

public class Game {
    private ArrayList<Card> HandKaarten = new ArrayList<Card>();            //maak een private ArrayList waar objecten van het type Card inzitten met de naam 'HandKaarten'
    private ArrayList<VictoryCard> VictoryCards = new ArrayList<VictoryCard>();

    public ArrayList<VictoryCard> getVictoryCards(){
        return  VictoryCards;
    }

    public ArrayList<Card> getHandKaarten() {                               //een getter voor de ArrayList 'HandKaarten'
        return HandKaarten;
    }

    public Game() {                                                         //methode om de eerste 10 HandKaarten(7 copper, 3 estate) in de ArrayList 'HandKaarten' te stoppen
        for (int i = 0; i < 7; i++) {
            HandKaarten.add(CardsEnum.getCard(CardsEnum.Copper));           //stopt 7 copper HandKaarten in de ArrayList 'HandKaarten' ; CardsEnum.getCard(CardsEnum.'inserthierjekaart')
        }
        for (int i = 0; i < 3; i++) {
            HandKaarten.add(CardsEnum.getCard(CardsEnum.Estate));
        }                                                                   //'HandKaarten' bevat nu 7 copper en 3 estate, in volgorde
        ShuffleHandCards();                                                     //shuffled de arrylist 'HandKaarten'


        for (int i = 0; i < 24; i++) {
            VictoryCards.add(CardsEnum.getCard(CardsEnum.Estate));
        }
                                                                      //HandKaarten.set(0,CardsEnum.getCard(CardsEnum.Smithy));
    }
    public ArrayList<Card> getAHand(){                                      //methode om en hand te maken(5 HandKaarten)
        ArrayList<Card> hand = new ArrayList<Card>();                       //maakt een nieuwe ArrayList aan van het type 'Card' met als naam 'hand'//

        for (int i = 0; i < 5; i++) {
             hand.add(this.HandKaarten.get(i));
        }
        return hand;
    }

    public void ShuffleHandCards(){
        Collections.shuffle(HandKaarten);
    }

    public static void main(String[] args) {
        Game mainGame = new Game();

        ArrayList<Player> playerArrayList = new ArrayList<Player>();
        //ArrayList<Card> KingdomcardsTestList = new ArrayList<Card>();


        playerArrayList.add(new Player(mainGame.getAHand(),"Pietje"));

        mainGame.ShuffleHandCards();                                                                //shuffled de arrylist 'HandKaarten'

        playerArrayList.add(new Player(mainGame.getAHand(),"Rudy"));

        System.out.println(playerArrayList.get(0).getNaam() + " heeft als HandKaarten:");

        PrettyPrintCards(playerArrayList.get(0).getSpelerHand());

        getTotalCoinValue(playerArrayList.get(0).getSpelerHand());

        System.out.println("------------------------------------------------------------------");

        System.out.println(playerArrayList.get(1).getNaam() + " heeft als HandKaarten:");

        PrettyPrintCards(playerArrayList.get(1).getSpelerHand());

        getTotalCoinValue(playerArrayList.get(1).getSpelerHand());
        CardsEnum.getCard(CardsEnum.Curse).getCost();


        System.out.println(CardsEnum.getCard(CardsEnum.Curse).getCost());
        System.out.println(CardsEnum.getCard(CardsEnum.Curse).getName());
        //((VictoryCard) CardsEnum.Estate);
        AbilityEnum.doShit(AbilityEnum.Smithy);
        //getVictorypoints(KingdomcardsTestList);
        //getVictorypoints(playerArrayList.get(0));
        ((VictoryCard)mainGame.getVictoryCards().get(0)).getName();
        //CardsEnum.Province.(getVictorypoints(ArrayList<Card> VictoryCard));                               // i do not geraak wijs uit this
        //((KingdomCard)mainGame.getHandKaarten().get(0)).doAbility();
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



