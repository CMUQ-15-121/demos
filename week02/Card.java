
public class Card {
	// Suits: 0 Hearts, 1 Diamonds, 2 Spades, 3 Clubs
	private int suit;
	// 1-10: Numbers, 11 - Jack, 12 - Queen, 13 - King
	private int face;

	private final static String[] suitTable = { "Hearts", "Diamonds", "Spades", "Clubs" };
	private static String[] faceTable = {
			"",
			"Ace",
			"Two",
			"Three",
			"Four",
			"Five",
			"Six",
			"Seven",
			"Eight",
			"Nine",
			"Ten",
			"Jack",
			"Queen",
			"King"
	};

	public Card(int suit, int face) {
		this.suit = suit;
		this.face = face;
	}

	public String toString() {
		if (this.suit < 0 || this.suit > 3) {
			return "Invalid Card";
		}
		if (this.face < 1 || this.face > 13) {
			return "Invalid Card";
		}
		return this.faceTable[this.face] + " of " + this.suitTable[this.suit];
	}
}
