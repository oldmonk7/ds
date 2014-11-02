package classeObjects;


public class Deck {

    public static int numSuits = 4;
    public static int numRanks = 13;
    public static int numCards = numSuits * numRanks;

    private Card[][] cards;

    public Deck() {
        cards = new Card[numSuits][numRanks];
        for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
            for (int rank = Card.ACE; rank <= Card.KING; rank++) {
                cards[suit-1][rank-1] = new Card(rank, suit);
            }
        }
    }

    public Card getCard(int suit, int rank) {
        return cards[suit-1][rank-1];
    }

    public static void main(String[] args){
    Deck d = new Deck();
    //Card n= new Card(2,1);
   
    System.out.println(Card.rankToString((d.getCard(2, 1).getRank())) + " " +Card.suitToString((d.getCard(2, 1).getSuit()))); 
    

    }
}