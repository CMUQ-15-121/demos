
public class Card {
	private int suit; // 0 is hearts, 1 is spades, 2 is clubs, 3 is diamonds
	private int number; // 1 is ace, 2,3,4...,10, 11 is J, 12 is Q, 13 is K
	
	private String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
	private String[] numbers = {"JUNK", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	public Card(int suit, int number) {
		if (suit > 3 || suit < 0) {
			suit = 3;
		}
		if (number > 13 || number < 1) {
			number = 13;
		}
		this.suit = suit;
		this.number = number;
	}
	
	public String toString() {
		String ret = "";
		ret += this.numbers[this.number];
		ret += " of ";
		ret += this.suits[this.suit];
		return ret;
	}
	
	public static void main(String[] args) {
		System.out.print("Testing a basic, numeric card...");
		Card c = new Card(1, 5);
		String expectedResponse = "5 of Spades";
		String response = c.toString();
		if (response.equals(expectedResponse)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
			System.out.println(response);
			return;
		}
		
		System.out.print("Testing a face card...");
		c = new Card(3, 13);
		expectedResponse = "King of Diamonds";
		response = c.toString();
		if (response.equals(expectedResponse)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
			System.out.println(response);
			return;
		}
		
		System.out.print("Testing an invalid card...");
		c = new Card(4, 14);
		expectedResponse = "King of Diamonds";
		response = c.toString();
		if (response.equals(expectedResponse)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
			System.out.println(response);
			return;
		}
		
		System.out.print("Testing an invalid card...");
		c = new Card(0, 0);
		expectedResponse = "King of Hearts";
		response = c.toString();
		if (response.equals(expectedResponse)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
			System.out.println(response);
			return;
		}
		
		System.out.print("Testing an invalid card...");
		c = new Card(-1, -1);
		expectedResponse = "King of Diamonds";
		response = c.toString();
		if (response.equals(expectedResponse)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
			System.out.println(response);
			return;
		}
	}
}
