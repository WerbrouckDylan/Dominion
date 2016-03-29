import javax.swing.*;

public enum CardsEnum {
    Copper,Estate,Moat,Curse,Smithy;

    public static Card getCard(CardsEnum card){
        switch (card){
            case Copper:
                return new TreasureCard(0,1, "Copper" ,new ImageIcon("C://tuut/test.bmp"));
            case Estate:
                return new VictoryCard(2,1,"Estate",new ImageIcon(""));
            case Moat:
                return new Card(1,"Moat",new ImageIcon(""));
            case Curse:
                return new VictoryCard(0,-1,"Curse",new ImageIcon(""));
            case Smithy:
                return new KingdomCard(4,AbilityEnum.SMITHY,"Smithy",new ImageIcon(""));
            default: return null;
        }
    }

}
