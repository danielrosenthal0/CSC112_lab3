import java.util.Comparator;

public class Card  {
    // ranks are ordered Ace-low and Queen-high
    private final String ranks[] ={"Ace","2","3","4","5","6","7","8","9","10","Jack","King","Queen"};

// suits are ordered alphabetically
    private final String suits[] = {"Clubs","Diamonds","Hearts","Spades"};



    private int rankNum;
    private int suitNum;
    private String rank;
    private String suit;

    //default constructor
    public Card(Card card) {
        rankNum = 0;
        suitNum = 0;
        rank = card.rank;
        suit = card.suit;
    }

    public Card(int i, int j) {
        rankNum = i;
        suitNum = j;
        rank = ranks[i];
        suit = suits[j];
    }

    // alternate constructor
    public Card(String rank, String suit){
        this.suit = suit;
        this.rank = rank;

        for (int i = 0; i < 13; i++) {
            if (ranks[i] == rank) {
                rankNum = i;
            }
            if (suits[i] == suit) {
                suitNum = i;
            }
        }
    }

    public int compare(Card userValue, Card compValue) {

return 0;
    }

    //comparator
    public static class  cardCompare implements Comparator<Card> {
        @Override
        public int compare(Card o1, Card o2) {
            int rankingCompare = Integer.compare(o1.rankNum, o2.rankNum);
            int suitCompare = Integer.compare(o1.suitNum, o2.suitNum);
            if (rankingCompare == 0) {
                return ((suitCompare == 0) ? rankingCompare : suitCompare);
            } else {
                return rankingCompare;
            }
        }
    }
    //print method
    @Override
    public String toString() {

        return(rank + " of " + suit);
    }
}



