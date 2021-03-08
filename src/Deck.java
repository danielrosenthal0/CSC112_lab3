import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards=new ArrayList < Card >();
    private int arraySize = 52;
    private int cardsLeft = 52;




// populate deck method, iterates thru both suit and rank
    public void populateDeck() {
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                //Card card = new Card(i,j);
                cards.add(new Card(i,j));
            }
        }
        //System.out.println(cards.size());
        arraySize = cards.size();
        cardsLeft = arraySize- 1;

    }
    //print deck method for testing
    public void printDeck() {
        for (int i = 0; i < cards.size(); i++) {
            //System.out.println(cards.get(i));
        }
    }
    //shuffle method
    public void shuffleDeck() {
        //System.out.println("1");
    ArrayList<Card> temp = new ArrayList <Card>();
    while(!cards.isEmpty()) {
        //System.out.println("1");
        int i = (int)(Math.random()*cards.size());
        temp.add(cards.get(i));
        cards.remove(i);
    }
    cards = temp;
    }

    //remove card from deck method
    public Card removeCard() {
        //shuffleDeck();
        Card card = new Card(cards.get(0));
        cards.remove(0);
        cardsLeft--;
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
