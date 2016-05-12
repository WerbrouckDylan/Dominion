package engine;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Supply {
    static Map<CardsEnum, Stack<Card>> SupplyStacks = new HashMap<CardsEnum, Stack<Card>>();
    //map -> dictionary(linkt key aan value, in dit geval cardsenum aan een stack)

    public Supply(Map<CardsEnum, Stack<Card>> supplyStacks) {                                        //map(dictionary uit c#) vol steken met kaarten
        SupplyStacks = supplyStacks;
    }

    public static Card getCard(CardsEnum cardsEnum){                                                 //popt cardsenum
        return SupplyStacks.get(cardsEnum).pop();
    }

    public static int getStackSize(CardsEnum cardsEnum){                                             //geeft de grootte van de stack van een bepaalde cardsenum
        return SupplyStacks.get(cardsEnum).size();
    }
}