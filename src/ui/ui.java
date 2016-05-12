package ui;
import engine.*;

import java.util.Stack;

import static engine.Game.*;

public class ui {

    public static void main(String[] args) {
        Stack<Card> speler1Deck = new Stack<Card>();
        Stack<Card> speler1DiscardPile = new Stack<Card>();
        Player player1 = new Player(speler1Deck, speler1DiscardPile, "joske");

        player1.initStartingDeck();
        System.out.println(player1.getSpelerDeck().size());
        AbilityEnum.doShit(AbilityEnum.Gardens, player1);
        System.out.println(player1.getVictorypoints());

        System.out.println("start hand");
        player1.takeCardsFromDeck(5);
        PrintArray(player1.getSpelerHand());
        System.out.println("-----------------------------");
        System.out.println("hand na Smithy");
        AbilityEnum.doShit(AbilityEnum.Smithy, player1);
        PrintArray(player1.getSpelerHand());
        System.out.println("--------------------");
        System.out.println(player1.getSpelerDeck().size());


    }
}
