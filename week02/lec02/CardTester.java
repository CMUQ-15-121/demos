
public class CardTester {

	public static void main(String[] args) {
		System.out.print("Testing with a valid card...");
		Card c = new Card(2,12);
		String expectedResponse = "Queen of Clubs";
		String response = c.toString();
		if (expectedResponse.equals(response)) {
			System.out.println("passed");
		} else {
			System.out.println("FAIL!!!!!!!!!!!!!!!!!");
		}

		System.out.print("Testing with a valid card...");
		c = new Card(0,7);
		expectedResponse = "7 of Hearts";
		response = c.toString();
		if (expectedResponse.equals(response)) {
			System.out.println("passed");
		} else {
			System.out.println("FAIL!!!!!!!!!!!!!!!!!");
		}
	}

}
