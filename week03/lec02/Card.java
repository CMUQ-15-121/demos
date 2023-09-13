
public class Card {
	// 1 is Ace, 2 in 2, ..., 11 is J, 12 is Q, 13 is K
	private int number;
	// 0 is hearts, 1 is diamonds, 2 is clubs, 3 is spades
	private int suit;

	private static String[] faces = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

	public Card(int suit, int number) {
		if (suit < 0 || suit > 3 || number < 1 || number > 13) {
			// An invalid card was specified.
			throw new IllegalArgumentException("Invalid argument");
		} else {
			this.suit = suit;
			this.number = number;
		}
	}

	public String toString() {
		String theSuit;

		if (this.suit == 0) {
			theSuit = "Hearts";
		} else if (this.suit == 1) {
			theSuit = "Diamonds";
		} else if (this.suit == 2) {
			theSuit = "Clubs";
		} else if (this.suit == 3) {
			theSuit = "Spades";
		} else {
			theSuit = "Invalid Card";
		}
		
		if (this.number == 0) {
			return "Invalid Card";
		}

		return this.faces[this.number - 1] + " of " + theSuit;
	}
}
