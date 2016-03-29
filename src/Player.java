import java.util.ArrayList;

public class Player {
    private int score = 0;

    public String getNaam() {
        return naam;
    }

    private String naam;
    private ArrayList<Card> spelerHand;

    public int getScore() {
        return score;
    }

    public ArrayList<Card> getSpelerHand() {
        return spelerHand;
    }

    public Player(ArrayList<Card> spelerHand, String naam) {
        this.spelerHand = spelerHand;
        this.naam = naam;
    }
}
