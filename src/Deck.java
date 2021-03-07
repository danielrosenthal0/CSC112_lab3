import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards=new ArrayList < Card >();
    private int arraySize;
    private int cardsLeft;

    public Deck(){
        arraySize = 0;
        cardsLeft = 0;
    }


    public void populateDeck() {
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                Card c = new Card();
                c[j] = suits[j];
                c[i] = ranks[i];
            }
        }
    }

    public void shuffleDeck() {

    }

//    public Deck(){
//        for (int i = 0; i < 13; i++){
//            for (int j = 0; j < 4; j++) {
//                Card c = new Card()
//                cards
//            }
//            }
//
//    }
}
