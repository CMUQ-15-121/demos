package Lect3;

public class Card {
	
	private int suit;
	private int face;
	
	private static final String[] suitTable = {"Hearts", "Diamonds", "Spades", "Clubs"};

	
	private static final String[] faceTable = {
			"",
			"Ace",//1
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
		this.face= face;
	}

	public String toString() {
		if(this.face < 1 || this.face > 13) {
			return "Invalid Card";
		}
		
		if(this.suit < 0 || this.suit > 3) {
			return "Invalid Card";
		}
		
		return faceTable[this.face]+" of "+suitTable[this.suit];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
