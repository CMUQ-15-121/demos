
public class Deck {
	private Card[] cards;
	private int numCards; // How many cards are in the deck

	public Deck() {
		this.cards = new Card[52];
		int cardNum = 0;
		for (int suit = 0; suit < 4; suit++) {
			for (int num = 1; num <= 13; num++) {
				this.cards[cardNum++] = new Card(suit, num);
			}
		}
		this.numCards = cardNum;
	}

	public void shuffle() {
		// Use the sample algorithm as HW1
		
	}
	
	public Card deal() {
		return this.cards[--this.numCards];
	}

	public String toString() {
		String ret = "";
		for (int i = 0; i < this.numCards; i++) {
			ret += this.cards[i].toString() + ", ";
		}
		return ret;
	}

	public static void main(String[] args) {
		Deck d = new Deck();
		System.out.println(d);
		
		Card c = d.deal();
		System.out.println("Dealt: " + c);
		
		c = d.deal();
		System.out.println("Dealt: " + c);
		
		c = d.deal();
		System.out.println("Dealt: " + c);
		
		System.out.println(d);
	}
}
