
public class Card {
	private int suit; // 0 is Hearts, 1 is Spades, 2 is Clubs, 3 is Diamonds
	private int number; // 1 is Ace, 2,3,...10,11 is Jack, 12 is Queen, 13 is King
	
	String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
	String[] faces = {"JUNK","Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	/* Constructor */
	public Card(int suit, int value) {
		this.suit = suit;
		this.number = value;
		
		if (this.suit < 0 || this.suit > 3) {
			this.suit = 0;
		}
		
		if (this.number < 1 || this.number > 13) {
			this.number = 1;
		}
	}
	
	public String toString() {
		/*
		String mySuit = "";
		if (suit == 0) {
			mySuit = "Hearts";
		}
		else if (suit == 1) {
			mySuit = "Spades";
		}
		else if (suit == 2) {
			mySuit = "Clubs";
		}
		else if (suit == 3) {
			mySuit = "Diamonds";
		}
		
		return this.number + " of " + mySuit;
		*/
		
		return this.faces[this.number] + " of " + this.suits[this.suit];
	}
	
	public static void main(String[] args) {
		// This is where I would put testing code for Card
	}
}
