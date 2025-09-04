
public class CardTester {

	public static void main(String[] args) {
		System.out.print("Testing with a valid card... ");
		Card c = new Card(2, 12);
		String expectedResponse = "Queen of Spades";
		String response = c.toString();
		if (expectedResponse.equals(response)) {
			System.out.println("pass");
		} else {
			System.out.println("FAIL!!!!!!!!");
			System.out.println("Response: " + response);
			System.out.println("Expected Response: " + expectedResponse);
			return;
		}
		
		System.out.print("Testing with a valid card... ");
		c = new Card(3, 9);
		expectedResponse = "Nine of Clubs";
		response = c.toString();
		if (expectedResponse.equals(response)) {
			System.out.println("pass");
		} else {
			System.out.println("FAIL!!!!!!!!");
			System.out.println("Response: " + response);
			System.out.println("Expected Response: " + expectedResponse);
			return;
		}
		
		System.out.print("Testing with an invalid suit card... ");
		c = new Card(14, 9);
		expectedResponse = "Invalid Card";
		response = c.toString();
		if (expectedResponse.equals(response)) {
			System.out.println("pass");
		} else {
			System.out.println("FAIL!!!!!!!!");
			System.out.println("Response: " + response);
			System.out.println("Expected Response: " + expectedResponse);
			return;
		}
		
		System.out.print("Testing with an invalid face card... ");
		c = new Card(2, 121);
		expectedResponse = "Invalid Card";
		response = c.toString();
		if (expectedResponse.equals(response)) {
			System.out.println("pass");
		} else {
			System.out.println("FAIL!!!!!!!!");
			System.out.println("Response: " + response);
			System.out.println("Expected Response: " + expectedResponse);
			return;
		}
		
		System.out.print("Testing with an edge face card... ");
		c = new Card(0, 7);
		expectedResponse = "Seven of Hearts";
		response = c.toString();
		if (expectedResponse.equals(response)) {
			System.out.println("pass");
		} else {
			System.out.println("FAIL!!!!!!!!");
			System.out.println("Response: " + response);
			System.out.println("Expected Response: " + expectedResponse);
			return;
		}
		
		System.out.print("Testing with an edge face card... ");
		c = new Card(-1, 7);
		expectedResponse = "Invalid Card";
		response = c.toString();
		if (expectedResponse.equals(response)) {
			System.out.println("pass");
		} else {
			System.out.println("FAIL!!!!!!!!");
			System.out.println("Response: " + response);
			System.out.println("Expected Response: " + expectedResponse);
			return;
		}
		
		System.out.print("Testing with an edge suit card... ");
		c = new Card(0, 1);
		expectedResponse = "Ace of Hearts";
		response = c.toString();
		if (expectedResponse.equals(response)) {
			System.out.println("pass");
		} else {
			System.out.println("FAIL!!!!!!!!");
			System.out.println("Response: " + response);
			System.out.println("Expected Response: " + expectedResponse);
			return;
		}
		
		System.out.print("Testing with an edge suit card... ");
		c = new Card(-1, 1);
		expectedResponse = "Invalid Card";
		response = c.toString();
		if (expectedResponse.equals(response)) {
			System.out.println("pass");
		} else {
			System.out.println("FAIL!!!!!!!!");
			System.out.println("Response: " + response);
			System.out.println("Expected Response: " + expectedResponse);
			return;
		}
		
		System.out.print("Testing with an edge suit card... ");
		c = new Card(3, 1);
		expectedResponse = "Ace of Clubs";
		response = c.toString();
		if (expectedResponse.equals(response)) {
			System.out.println("pass");
		} else {
			System.out.println("FAIL!!!!!!!!");
			System.out.println("Response: " + response);
			System.out.println("Expected Response: " + expectedResponse);
			return;
		}
		
		System.out.print("Testing with an edge suit card... ");
		c = new Card(4, 1);
		expectedResponse = "Invalid Card";
		response = c.toString();
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
