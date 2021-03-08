import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards=new ArrayList < Card >();
    private int arraySize;
    private int cardsLeft;

    public Deck(){
        arraySize = 0;
        cardsLeft = 0;
    }

// populate deck method, iterates thru both suit and rank
    public void populateDeck() {
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                Card card = new Card(i,j);
                cards.add(card);
            }
        }
        arraySize = cards.size();
        cardsLeft = arraySize;

    }
    //print deck method for testing
    public void printDeck() {
        for (int i = 0; i < cards.size(); i++)
        System.out.println(cards.get(i));
    }
    //shuffle method
    public void shuffleDeck() {
        System.out.println("1");
    ArrayList<Card> temp = new ArrayList <Card>();
    while(!temp.isEmpty()) {
        System.out.println("1");
        int i = (int)(Math.random()*cards.size());
        temp.add(cards.get(i));
        cards.remove(i);
    }
    cards = temp;
    }

    //remove card from deck method
    public Card removeCard() {
        shuffleDeck();
        cardsLeft--;
        Card card = cards.get(cardsLeft);
        return card;

    }

    public boolean addCard(Card card) {
        cardsLeft++;
        if (cardsLeft < 52) {
            cards.add(card);
            return true;
        } else {
            return false;
        }
    }



}
