
public class CardTester {

	public static void main(String[] args) {
		System.out.print("Testing with a valid card...");
		Card c = new Card(12, 2);
		String expectedResponse = "Queen of Diamonds";
		String response = c.toString();
		if (expectedResponse.equals(response)) {
			System.out.println("pass");
		} else {
			System.out.println("FAIL!!!!!!!!!!!!");
			System.out.println("Response: " + response);
			System.out.println("Expected: " + expectedResponse);
			return;
		}
		
		System.out.print("Testing with a valid card...");
		c = new Card(13, 0);
		expectedResponse = "King of Spades";
		response = c.toString();
		if (expectedResponse.equals(response)) {
			System.out.println("pass");
		} else {
			System.out.println("FAIL!!!!!!!!!!!!");
			System.out.println("Response: " + response);
			System.out.println("Expected: " + expectedResponse);
			return;
		}
		
		System.out.print("Testing with a valid card...");
		c = new Card(1, 3);
		expectedResponse = "Ace of Hearts";
		response = c.toString();
		if (expectedResponse.equals(response)) {
			System.out.println("pass");
		} else {
			System.out.println("FAIL!!!!!!!!!!!!");
			System.out.println("Response: " + response);
			System.out.println("Expected: " + expectedResponse);
			return;
		}
		
		System.out.print("Testing with a valid card...");
		c = new Card(7, 1);
		expectedResponse = "7 of Clubs";
		response = c.toString();
		if (expectedResponse.equals(response)) {
			System.out.println("pass");
		} else {
			System.out.println("FAIL!!!!!!!!!!!!");
			System.out.println("Response: " + response);
			System.out.println("Expected: " + expectedResponse);
			return;
		}

		// We'll come back to this next week
//		System.out.print("Testing with a invalid value...");
//		c = new Card(14, 0);
//		expectedResponse = "";
//		response = c.toString();
//		if (expectedResponse.equals(response)) {
//			System.out.println("pass");
//		} else {
//			System.out.println("FAIL!!!!!!!!!!!!");
//			System.out.println("Response: " + response);
//			System.out.println("Expected: " + expectedResponse);
//			return;
//		}
		
//		System.out.print("Testing with a invalid suit...");
//		c = new Card(7, -1);
//		expectedResponse = "";
//		response = c.toString();
//		if (expectedResponse.equals(response)) {
//			System.out.println("pass");
//		} else {
//			System.out.println("FAIL!!!!!!!!!!!!");
//			System.out.println("Response: " + response);
//			System.out.println("Expected: " + expectedResponse);
//			return;
//		}
		
//		System.out.print("Testing with a invalid suit...");
//		c = new Card(7, 4);
//		expectedResponse = "";
//		response = c.toString();
//		if (expectedResponse.equals(response)) {
//			System.out.println("pass");
//		} else {
//			System.out.println("FAIL!!!!!!!!!!!!");
//			System.out.println("Response: " + response);
//			System.out.println("Expected: " + expectedResponse);
//			return;
//		}
	}

}
