
public class Card {
	private int suit;
	private int value;
	
	String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
	String[] values = {"ERROR", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

	public Card(int suit, int value) {
		this.suit = suit;
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public String toString() {
		/*
		if (this.suit == 0) {
			return this.value + " of Spades";
		} else if (this.suit == 1) {
			return this.value + " of Clubs";
		} else if (this.suit == 2) {
			return this.value + " of Hearts";
		} else if (this.suit == 3) {
			return this.value + " of Diamonds";
		} else {
			return this.value + " of Garbage";
		}
		*/

		// return this.value + " of " + this.suit;
		
		if (this.suit < 4 && this.value < 14 && this.value > 0) {
			return values[this.value] + " of " + suits[this.suit];
		}
		return "INVALIDWHATISWRONGWITHYOU";
	}

}
