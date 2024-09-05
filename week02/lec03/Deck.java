import java.util.Arrays;
import java.util.Random;

public class Deck {
	// Attributes
	private Card[] cards;
	private int lastCard;
	private Random rand;
	
	// Methods
	public Deck() {
		this.rand = new Random();
		this.cards = new Card[52];
		
		int cardNum = 0;
		for(int suit = 0; suit < 4; suit++) {
			for(int val = 1; val <= 13; val++) {
				this.cards[cardNum++] = new Card(val, suit);
			}
		}
		
		this.lastCard = 51;
	}
	
	public Card deal() {
		if (this.lastCard < 0) {
			return null;
		}
		Card ret = this.cards[this.lastCard];
		this.cards[this.lastCard] = null;
		this.lastCard--;
		return ret;
	}
	
	public void shuffle() {
		int numCards = this.lastCard+1;
		for(int i = 0; i <= numCards-2; i++) {
			int r = this.rand.nextInt(numCards-i) + i;
			Card tmp = this.cards[i];
			this.cards[i] = this.cards[r];
			this.cards[r] = tmp;
		}
	}
	
	public String toString() {
		return "Deck(" + this.lastCard + "): " + Arrays.toString(this.cards);
	}
}
