
public class Deck {
	private Card[] cards;
	private int numCards;
	
	public Deck() {
		this.cards = new Card[52];
		for(int suit = 0; suit < 4; suit++) {
			for(int number = 1; number < 14; number++) {
				this.cards[suit*13+(number-1)] = new Card(suit, number);
			}
		}
		this.numCards = 52;
	}
	
	public static void main(String[] args) {
		Deck d = new Deck();
		System.out.println(d);
	}
}
