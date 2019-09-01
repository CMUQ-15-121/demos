import java.util.Random;

public class CardTester {

	public static void main(String[] args) {
		Card myCard = new Card(1, 10);
		Card myOtherCard = new Card(3, 13);
		System.out.println(myCard);
		System.out.println(myOtherCard);
		
		System.out.println();
		
		DeckOfCards myDeck = new DeckOfCards();
		System.out.println(myDeck);
		
		myDeck.shuffle();
		System.out.println(myDeck);
	}

}
