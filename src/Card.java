import java.util.Comparator;

public class Card implements Comparator<Card> {
    // ranks are ordered Ace-low and Queen-high
    private final String ranks[] ={"Ace","2","3","4","5","6","7","8","9","10","Jack","King","Queen"};

// suits are ordered alphabetically
    private final String suits[] = {"Clubs","Diamonds","Hearts","Spades"};



    private int rankNum;
    private int suitNum;
    private String rank;
    private String suit;

    //default constructor
    public Card(int j, int i) {
        rankNum = 0;
        suitNum = 0;
        rank = "none";
        suit = "none";
    }

    // alternate constructor
    public Card(String rank, String suit){
        this.suit = suit;
        this.rank = rank;

        for (int i = 0; i < 13; i++) {
            if (ranks[i] == rank) {
                rankNum = i + 1;
            }
            if (suits[i] == suit) {
                suitNum = i + 1;
            }
        }
    }

    //comparator
    @Override
    public int compare(Card o1, Card o2) {
        int num = 0;

        num = Integer.compare(o1.rankNum, o2.rankNum);
        if(num == 0)
            num = Integer.compare(o1.suitNum, o2.suitNum);
        return num;
    }

    //print method
    @Override
    public String toString() {
        return(rank + " of " + suit);
    }
}



