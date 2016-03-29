import java.util.*;

public class Game {
    private ArrayList<Card> kaarten = new ArrayList<Card>();     //maak een private ArrayList waar objecten van het type Card inzitten met de naam 'kaarten'


    public ArrayList<Card> getKaarten() {                       //een getter voor de ArrayList 'kaarten'
        return kaarten;
    }

    public Game() {                                             //methode om de eerste 10 kaarten(7 copper, 3 estate) in de ArrayList 'kaarten' te stoppen
        for (int i = 0; i < 7; i++) {
            kaarten.add(CardsEnum.getCard(CardsEnum.Copper));   //stopt 7 copper kaarten in de ArrayList 'kaarten' ; CardsEnum.getCard(CardsEnum.'inserthierjekaart')
        }
        for (int i = 0; i < 3; i++) {
            kaarten.add(CardsEnum.getCard(CardsEnum.Estate));
        }                                                       //'kaarten' bevat nu 7 copper en 3 estate, in volgorde
        ShuffleCards();                                         //shuffled de arrylist 'kaarten'

                                                                //kaarten.set(0,CardsEnum.getCard(CardsEnum.Smithy));
    }
    public ArrayList<Card> getAHand(){                          //methode om en hand te maken(5 kaarten)
        ArrayList<Card> hand = new ArrayList<Card>();           //maakt een nieuwe ArrayList aan van het type 'Card' met als naam 'hand'//

        for (int i = 0; i < 5; i++) {
             hand.add(this.kaarten.get(i));
        }
        return hand;
    }

    public void ShuffleCards(){
        Collections.shuffle(kaarten);
    }

    public static void main(String[] args) {
        Game mainGame = new Game();
        ArrayList<Player> playerArrayList = new ArrayList<Player>();

        playerArrayList.add(new Player(mainGame.getAHand(),"Pietje"));

        mainGame.ShuffleCards();
        
        playerArrayList.add(new Player(mainGame.getAHand(),"Rudy"));

        System.out.println(playerArrayList.get(0).getNaam() + " heeft als kaarten:");

        PrettyPrintCards(playerArrayList.get(0).getSpelerHand());

        GetTotalCoinValue(playerArrayList.get(0).getSpelerHand());

        System.out.println("------------------------------------------------------------------");

        System.out.println(playerArrayList.get(1).getNaam() + " heeft als kaarten:");

        PrettyPrintCards(playerArrayList.get(1).getSpelerHand());

        GetTotalCoinValue(playerArrayList.get(1).getSpelerHand());

        //((KingdomCard)mainGame.getKaarten().get(0)).doAbility();
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

    public static int GetTotalCoinValue(ArrayList<Card> kaarten){
        //PrettyPrintCards(kaarten);
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


}
