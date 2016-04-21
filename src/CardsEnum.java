import javax.swing.*;

public enum CardsEnum {
    Copper,Silver,Gold,Estate,Duchy,Province,Moat,Curse,Smithy,Cellar;

    public static Card getCard(CardsEnum card){
        switch (card){

            //TeasureCards
            case Copper:
                return new TreasureCard(0,1, "Copper" ,new ImageIcon("C://tuut/test.bmp"));
            case Silver:
                return new TreasureCard(3,2, "Silver" ,new ImageIcon("C://tuut/test.bmp"));
            case Gold:
                return new TreasureCard(6,3, "Gold" ,new ImageIcon("C://tuut/test.bmp"));

            //VictoryCards
            case Estate:
                return new VictoryCard(2,1,"Estate",new ImageIcon(""));
            case Duchy:
                return new VictoryCard(5,3,"Duchy",new ImageIcon(""));
            case Province:
                return new VictoryCard(2,1,"Province",new ImageIcon(""));
            case Curse:
                return new VictoryCard(0,-1,"Curse",new ImageIcon(""));

            //KingdomCards
            case Cellar:
                return new KingdomCard(2,AbilityEnum.Cellar,"Smithy",new ImageIcon(""));
            case Moat:
                return new KingdomCard(1,AbilityEnum.Moat,"Moat",new ImageIcon(""));
            case Smithy:
                return new KingdomCard(4,AbilityEnum.Smithy,"Smithy",new ImageIcon(""));
            default: return null;
        }
    }

}
