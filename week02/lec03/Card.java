
public class Card {
	// 1 - Ace through 13 (King)
	private int value;
	// Spades (0) , Clubs (1), Diamonds (2), Hearts (3)
	private int suit;
	
	private static String[] suitMap = {"Spades", "Clubs", "Diamonds", "Hearts"};
	private static String[] valueMap = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

	public Card(int value, int suit) {
		if (value < 1 || value > 13 || suit < 0 || suit > 3) {
			throw new IllegalArgumentException("Invalid card: " + value + " of " + suit);
		}

		this.value = value;
		this.suit = suit;
	}
	
	public String toString() {
//		if (this.value < 1 || this.value > 13 || this.suit < 0 || this.suit > 3) {
//			return "Invalid Card";
//		}
		
//		String s = "";
//		if (this.suit == 0) {
//			s = "Spades";
//		} else if (this.suit == 1) {
//			s = "Clubs";
//		} else if (this.suit == 2) {
//			s = "Diamonds";
//		} else if (this.suit == 3) {
//			s = "Hearts";
//		}
		return Card.valueMap[this.value-1] + " of " + Card.suitMap[this.suit];
	}

	// Be wary of not using `this.value` in front of instance variables
//	public Card(int v, byte s) {
//		value = v;
//		suit = s;
//	}

}
