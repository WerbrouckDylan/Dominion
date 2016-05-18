package engine;

import javax.sql.rowset.CachedRowSet;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

import static engine.CardsEnum.*;

/**
 * Created by Dolan on 18-5-2016.
 */
public class BuyArea {
    public ArrayList<Stack<Card>> BuyArea = new ArrayList<Stack<Card>>();  //een arraylist met stacks in, om zo gemakkelijk de buy area te maken
    public Stack<Card> CellarStack = new Stack();
    public Stack<Card> MoatStack = new Stack<Card>();
    public Stack<Card> MarketStack = new Stack<Card>();
    public Stack<Card> MilitiaStack = new Stack<Card>();
    public Stack<Card> MineStack = new Stack<Card>();
    public Stack<Card> RemodelStack = new Stack<Card>();
    public Stack<Card> SmithyStack = new Stack<Card>();
    public Stack<Card> VillageStack = new Stack<Card>();
    public Stack<Card> WoodcutterStack = new Stack<Card>();
    public Stack<Card> WorkshopStack = new Stack<Card>();
    public Stack<Card> AdventurerStack = new Stack<Card>();
    public Stack<Card> BureaucratStack = new Stack<Card>();
    public Stack<Card> ChancellorStack = new Stack<Card>();
    public Stack<Card> ChapelStack = new Stack<Card>();
    public Stack<Card> FeastStack = new Stack<Card>();
    public Stack<Card> LaboratoryStack = new Stack<Card>();
    public Stack<Card> MoneylenderStack = new Stack<Card>();
    public Stack<Card> ThroneRoomStack = new Stack<Card>();

    public ArrayList<Stack<Card>> ArrayStacksList = new ArrayList<Stack<Card>>();
    public ArrayList<Stack<Card>> BigMoneyAList = new ArrayList<Stack<Card>>();
    public CardsEnum[] GameCards;
    public Stack[] ArrayStacks;
    
    public CardsEnum[] FirstGameCards = {Cellar,Moat,Market,Militia,Mine,Remodel,Smithy,Village,Woodcutter,Workshop};
    public Stack[] FirstGameStacks = {CellarStack,MoatStack,MarketStack, MilitiaStack,MineStack,RemodelStack,SmithyStack,VillageStack,WoodcutterStack,WorkshopStack };
    
    public CardsEnum[] BigMoneyCards = {Adventurer, Bureaucrat, Chancellor, Chapel, Feast, Laboratory, Market, Mine, Moneylender, ThroneRoom};
    public Stack[] BigMoneyStacks = {AdventurerStack, BureaucratStack, ChancellorStack, ChapelStack, FeastStack, LaboratoryStack, MarketStack, MineStack, MoneylenderStack, ThroneRoomStack};

    public CardsEnum[] anderspel = {Moat, Market, Mine, Smithy};

    public BuyArea(int n){

        switch(n)
        {
            case 1:
                GameCards = FirstGameCards;
                ArrayStacks = FirstGameStacks;
                break;
            case 2:
                GameCards = BigMoneyCards;
                ArrayStacks = BigMoneyStacks;
                break;
            case 3:

                break;
            case 4:

                break;
            default:

        }

        int i =0;
        while(i<ArrayStacks.length){
            Stack<Card> stackCard = new Stack<>();
            stackCard = ArrayStacks[i];
            Card cardd = CardsEnum.getCard(GameCards[i]);
            stackCard = AddStack(cardd);
            ArrayStacksList.add(stackCard);
            i++;
        }
    }


    public Stack AddStack(Card card){
        Stack returnstack = new Stack();
        int i =0;
        while(i<10){
            returnstack.push(card.getName());    //verander naar (card) als je alleinfo van e kaart wil en niet enkel de naam, ditis nu om amkkelijk te testen
            i++;
        }
        return returnstack;
    }

    public ArrayList<Stack<Card>> BuyAreaCards(){
      ArrayList ArrayStacks = new ArrayList();
          int i = 0;
        while(i<ArrayStacksList.size()){

            ArrayStacks.add(ArrayStacksList.get(i));
            i++;
        }
        return ArrayStacks;
    }


}
