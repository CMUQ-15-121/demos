
public class Card {
	int suit;
	int value;
	
	public Card(int suit, int value) {
		this.suit = suit;
		this.value = value;
	}
	
	public static void main(String[] args) {
		Card myCard = new Card(1, 10);
		System.out.println(myCard);
	}

}
