
public class Card {
	// 0 is hearts, 1 is spades, 2 is clubs, 3 is diamonds
	private int suit;
	private int number;
	
	private String[] faces = {"","Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
	private String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
	
	public Card(int suit, int number) {
		this.suit = suit;
		this.number = number;
	}
	
	public String toString() {
		if (this.number > 13 || this.number < 1 || this.suit > 3 || this.suit < 0) {
			return "You made a bad card, moron";
		}
		return this.faces[this.number] + " of " + this.suits[this.suit];
	}
	
	public static void main(String[] args) {
		System.out.print("Testing with a valid card...");
		Card c = new Card(2, 12);
		String expectedResponse = "Queen of Clubs";
		String response = c.toString();
		if (expectedResponse.equals(response)) {
			System.out.println("pass");
		} else {
			System.out.println("FAIL!!!!!!!!!!!!!!!!!!!");
			System.out.println("Response: " + response);
			System.out.println("Expected: " + expectedResponse);
			return;
		}
		
		System.out.print("Testing with a valid card...");
		c = new Card(0, 13);
		expectedResponse = "King of Hearts";
		response = c.toString();
		if (expectedResponse.equals(response)) {
			System.out.println("pass");
		} else {
			System.out.println("FAIL!!!!!!!!!!!!!!!!!!!");
			System.out.println("Response: " + response);
			System.out.println("Expected: " + expectedResponse);
			return;
		}
		
		System.out.print("Testing with a valid card...");
		c = new Card(3, 1);
		expectedResponse = "Ace of Diamonds";
		response = c.toString();
		if (expectedResponse.equals(response)) {
			System.out.println("pass");
		} else {
			System.out.println("FAIL!!!!!!!!!!!!!!!!!!!");
			System.out.println("Response: " + response);
			System.out.println("Expected: " + expectedResponse);
			return;
		}
		
		System.out.print("Testing with an invalid number...");
		c = new Card(0, 14);
		expectedResponse = "You made a bad card, moron";
		response = c.toString();
		if (expectedResponse.equals(response)) {
			System.out.println("pass");
		} else {
			System.out.println("FAIL!!!!!!!!!!!!!!!!!!!");
			System.out.println("Response: " + response);
			System.out.println("Expected: " + expectedResponse);
			return;
		}
		
		System.out.print("Testing with an invalid number...");
		c = new Card(0, 0);
		expectedResponse = "You made a bad card, moron";
		response = c.toString();
		if (expectedResponse.equals(response)) {
			System.out.println("pass");
		} else {
			System.out.println("FAIL!!!!!!!!!!!!!!!!!!!");
			System.out.println("Response: " + response);
			System.out.println("Expected: " + expectedResponse);
			return;
		}
		
		System.out.print("Testing with an invalid suit...");
		c = new Card(4, 7);
		expectedResponse = "You made a bad card, moron";
		response = c.toString();
		if (expectedResponse.equals(response)) {
			System.out.println("pass");
		} else {
			System.out.println("FAIL!!!!!!!!!!!!!!!!!!!");
			System.out.println("Response: " + response);
			System.out.println("Expected: " + expectedResponse);
			return;
		}
		
		System.out.print("Testing with an invalid suit...");
		c = new Card(-1, 7);
		expectedResponse = "You made a bad card, moron";
		response = c.toString();
		if (expectedResponse.equals(response)) {
			System.out.println("pass");
		} else {
			System.out.println("FAIL!!!!!!!!!!!!!!!!!!!");
			System.out.println("Response: " + response);
			System.out.println("Expected: " + expectedResponse);
			return;
		}
	}
}
