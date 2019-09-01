import java.util.Random;

public class DeckOfCards {

	private Card[] cards = new Card[52];
	
	public DeckOfCards() {
		int cardNum = 0;
		for(int suit = 0; suit < 4; suit++) {
			for(int val = 1; val < 14; val++) {
				Card tmpCard = new Card(suit, val);
				cards[cardNum++] = tmpCard;
			}
		}
	}
	
	public void shuffle() {
		Random r = new Random();
		
		Card[] shuffledCards = new Card[52];
		int cardNumber = 0;
		
		while (cardNumber < 52) {
			int randomIndex = r.nextInt(52);
			if (this.cards[randomIndex] != null) {
				shuffledCards[cardNumber] = this.cards[randomIndex];
				this.cards[randomIndex] = null;
				cardNumber++;
			}
		}
		
		this.cards = shuffledCards;
		
	}
	
	public String toString() {
		String theReturnString = "";
		for(int i = 0; i < 52; i++) {
			theReturnString += cards[i].toString() + "\n";
		}
		return theReturnString;
	}
	
}
