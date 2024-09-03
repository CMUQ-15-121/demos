import java.util.Arrays;

public class Deck {
	// Attributes
	private Card[] cards;
	
	// Methods
	public Deck() {
		this.cards = new Card[52];
		
		int cardNum = 0;
		for(int suit = 0; suit < 4; suit++) {
			for(int val = 1; val <= 13; val++) {
				this.cards[cardNum++] = new Card(val, suit);
			}
		}
	}
	
	public String toString() {
		return "Deck: " + Arrays.toString(this.cards);
	}
}
