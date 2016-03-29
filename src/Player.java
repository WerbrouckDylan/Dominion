import java.util.ArrayList;

public class Player {
    private int score = 0;
    private String naam;
    private ArrayList<Card> spelerHand;

    public Player(ArrayList<Card> spelerHand, String naam) {
        this.spelerHand = spelerHand;
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public int getScore() {
        return score;
    }

    public ArrayList<Card> getSpelerHand() {
        return spelerHand;
    }


}
