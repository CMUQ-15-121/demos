package lect1;

import java.util.Random;

public class CardsDeck {

	
	private Card[] cards;
	private int numCards;
	
	
	public CardsDeck() {
		int cardIndx= 0;
		
		this.cards = new Card[52];
		for(int s=0; s<4; s++) {
			for(int f=1; f <14; f++) {
				this.cards[cardIndx++]= new Card(s, f);
				//cardIndx++;
			}
		}//52
		
		this.numCards = cardIndx;
	}

	
	public String toString() {
		
		String ret="";
		
		for(int i=0; i< this.numCards; i++ ) {
			ret += this.cards[i].toString()+"\n";
		}
		
		return ret;
	}
	
	
	public void shuffle() {
		
	    Random rand = new Random(); // random number generator (you can pass a seed or a starting value)
	    for (int i = this.cards.length - 1; i > 0; i--) {
	        int j = rand.nextInt(i + 1); // random index from 0 to i, inclusive
	        // swap cards[i] and cards[j]
	        Card temp = this.cards[i];
	        this.cards[i] = this.cards[j];
	        this.cards[j] = temp;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Testing with a valid CardsDeck ...."); //no new line, PASS?FAIL to show on same line
		CardsDeck d= new CardsDeck();
		
		//worked out independently (not copy-pasted from output)
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
		String response = d.toString(); //what I actually get
		if (expectedResponse.equals(response)) { //.equals for string (== is common mistake)
			System.out.println("pass");
		}else {
			System.out.println("FAIL!!!!!!!!!!!!!!!!!");
			System.out.println("Response: "+ response);
			System.out.println("Expected Response: "+ expectedResponse);
			return; //stop if faild
		}
		
	}

}
