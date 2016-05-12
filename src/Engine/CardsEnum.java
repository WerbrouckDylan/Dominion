package engine;

import javax.swing.*;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;

public enum CardsEnum {
    Copper,Silver,Gold,Estate,Duchy,Province,Moat,Curse,Smithy,Cellar, Chancellor, Woodcutter,Chapel, Village,Workshop,Bureaucrat,Feast,Gardens,Militia,Moneylender,Remodel,Spy,Thief,ThroneRoom,CouncilRoom,Festival,Laboratory,Library,Market,Mine,Witch,Adventurer;

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
            case Chapel:
                return new KingdomCard(2, AbilityEnum.Chapel, "Chapel", new ImageIcon(""));
            case Moat:
                return new KingdomCard(1,AbilityEnum.Moat,"Moat",new ImageIcon(""));
            case Chancellor:
                return new KingdomCard(3, AbilityEnum.Chancellor, "Chancellor", new ImageIcon(""));
            case Village:
                return new KingdomCard(3, AbilityEnum.Village, "Village", new ImageIcon(""));
            case Woodcutter:
                return new KingdomCard(3, AbilityEnum.Woodcutter, "Woodcutter", new ImageIcon(""));
            case Workshop:
                return new KingdomCard(3, AbilityEnum.Workshop, "Workshop", new ImageIcon(""));
            case Bureaucrat:
                return new KingdomCard(4, AbilityEnum.Bureaucrat, "Bureaucrat", new ImageIcon(""));
            case Feast:
                return new KingdomCard(4, AbilityEnum.Feast, "Feast", new ImageIcon(""));
            case Gardens:
                return new KingdomCard(4, AbilityEnum.Gardens, "Gardens", new ImageIcon(""));
            case Militia:
                return new KingdomCard(4, AbilityEnum.Militia, "Militia", new ImageIcon(""));
            case Moneylender:
                return new KingdomCard(4, AbilityEnum.Moneylender, "Moneylender", new ImageIcon(""));
            case Remodel:
                return new KingdomCard(4, AbilityEnum.Remodel, "Remodel", new ImageIcon(""));
            case Smithy:
                return new KingdomCard(4,AbilityEnum.Smithy,"Smithy",new ImageIcon(""));
            case Spy:
                return new KingdomCard(4, AbilityEnum.Spy, "Spy", new ImageIcon(""));
            case Thief:
                return new KingdomCard(4, AbilityEnum.Thief,"Thief",new ImageIcon(""));
            case ThroneRoom:
                return new KingdomCard(4, AbilityEnum.ThroneRoom, "Throne Room", new ImageIcon(""));
            case CouncilRoom:
                return new KingdomCard(5, AbilityEnum.CouncilRoom, "Council Room", new ImageIcon(""));
            case Festival:
                return new KingdomCard(5, AbilityEnum.Festival,"Festival", new ImageIcon(""));
            case Laboratory:
                return new KingdomCard(5, AbilityEnum.Laboratory, "Laboratory", new ImageIcon(""));
            case Library:
                return new KingdomCard(5, AbilityEnum.Library, "Library", new ImageIcon(""));
            case Market:
                return new KingdomCard(5, AbilityEnum.Market, "Market", new ImageIcon(""));
            case Mine:
                return new KingdomCard(5, AbilityEnum.Mine, "Mine", new ImageIcon(""));
            case Witch:
                return new KingdomCard(5, AbilityEnum.Witch, "Witch", new ImageIcon(""));
            case Adventurer:
                return new KingdomCard(6, AbilityEnum.Adventurer, "Witch", new ImageIcon(""));
            default: return null;
        }
    }

}
