
public class Deck {
	private Card[] cards;
	
	public Deck() {
		this.cards = new Card[52];
		int cardNum = 0;
		for(int suit = 0; suit < 4; suit++) {
			for(int face = 1; face < 14; face++) {
				this.cards[cardNum++] = new Card(suit, face);
			}
		}
	}
	
	public String toString() {
		String ret = "";
		for(int i = 0; i < cards.length; i++) {
			ret += cards[i].toString() + "\n";
		}
		return ret;
	}
	
	public static void main(String[] args) {
		System.out.print("Testing with a new deck... ");
		Deck d = new Deck();
		String expectedResponse = "Ace of Hearts\n"
				+ "Two of Hearts\n"
				+ "Three of Hearts\n"
				+ "Four of Hearts\n"
				+ "Five of Hearts\n"
				+ "Six of Hearts\n"
				+ "Seven of Hearts\n"
				+ "Eight of Hearts\n"
				+ "Nine of Hearts\n"
				+ "Ten of Hearts\n"
				+ "Jack of Hearts\n"
				+ "Queen of Hearts\n"
				+ "King of Hearts\n"
				+ "Ace of Diamonds\n"
				+ "Two of Diamonds\n"
				+ "Three of Diamonds\n"
				+ "Four of Diamonds\n"
				+ "Five of Diamonds\n"
				+ "Six of Diamonds\n"
				+ "Seven of Diamonds\n"
				+ "Eight of Diamonds\n"
				+ "Nine of Diamonds\n"
				+ "Ten of Diamonds\n"
				+ "Jack of Diamonds\n"
				+ "Queen of Diamonds\n"
				+ "King of Diamonds\n"
				+ "Ace of Spades\n"
				+ "Two of Spades\n"
				+ "Three of Spades\n"
				+ "Four of Spades\n"
				+ "Five of Spades\n"
				+ "Six of Spades\n"
				+ "Seven of Spades\n"
				+ "Eight of Spades\n"
				+ "Nine of Spades\n"
				+ "Ten of Spades\n"
				+ "Jack of Spades\n"
				+ "Queen of Spades\n"
				+ "King of Spades\n"
				+ "Ace of Clubs\n"
				+ "Two of Clubs\n"
				+ "Three of Clubs\n"
				+ "Four of Clubs\n"
				+ "Five of Clubs\n"
				+ "Six of Clubs\n"
				+ "Seven of Clubs\n"
				+ "Eight of Clubs\n"
				+ "Nine of Clubs\n"
				+ "Ten of Clubs\n"
				+ "Jack of Clubs\n"
				+ "Queen of Clubs\n"
				+ "King of Clubs\n";
		String response = d.toString();
		if (expectedResponse.equals(response)) {
			System.out.println("pass");
		} else {
			System.out.println("FAIL!!!!!!!!");
			System.out.println("Response: " + response);
			System.out.println("Expected Response: " + expectedResponse);
			return;
		}
	}

}
