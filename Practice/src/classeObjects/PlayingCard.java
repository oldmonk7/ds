package classeObjects;

public class PlayingCard {

	String suit;
	String rank;
	
	public PlayingCard(String suit, String rank){
		this.suit = suit;
		this.rank = rank;
		
	}
	public void getPlayingCard(PlayingCard p){
		System.out.println("Suit= "+ p.suit);
		System.out.println("Rank="+p.rank);
	}
	
	public static void main(String[] args){
		PlayingCard p = new PlayingCard("spade", "ace");
		p.getPlayingCard(p);
	}
}
