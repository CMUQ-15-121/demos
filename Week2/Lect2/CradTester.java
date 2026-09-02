package lect2;

public class CradTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Testing with a valid card...."); // Pass/ Fail
		Card c = new Card(2,12);
		String expectedResponse = "Queen of Spades";
		String response = c.toString();
		
		//assert expectedResponse.equals(response);
		if(expectedResponse.equals(response)) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL !!!!!!");
			System.out.println("Response: "+response);
			System.out.println("Expected Response: "+expectedResponse);

		}
		
		
		System.out.print("Testing with a valid card...."); // Pass/ Fail
		c = new Card(0,7);
		expectedResponse = "Seven of Hearts";
		response = c.toString();
		
		//assert expectedResponse.equals(response);
		if(expectedResponse.equals(response)) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL !!!!!!");
			System.out.println("Response: "+response);
			System.out.println("Expected Response: "+expectedResponse);

		}
		
		
		///ERROR CASE
		System.out.print("Testing with an invalid face...."); // Pass/ Fail
		c = new Card(0, -1);
		expectedResponse = "Invalid Card";
		response = c.toString();
		
		//assert expectedResponse.equals(response);
		if(expectedResponse.equals(response)) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL !!!!!!");
			System.out.println("Response: "+response);
			System.out.println("Expected Response: "+expectedResponse);

		}
		
		
		///EDGE CASE
		
		System.out.print("Testing with an edge face case (largest), suit (smallest)...."); // Pass/ Fail
		c = new Card(0, 13);
		expectedResponse = "King of Hearts"; 
		response = c.toString();
		
		//assert expectedResponse.equals(response);
		if(expectedResponse.equals(response)) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL !!!!!!");
			System.out.println("Response: "+response);
			System.out.println("Expected Response: "+expectedResponse);

		}
		
		
		System.out.print("Testing with an edge face case (one below smallest)...."); // Pass/ Fail
		c = new Card(0, 0);
		expectedResponse = "Invalid Card"; 
		response = c.toString();
		
		//assert expectedResponse.equals(response);
		if(expectedResponse.equals(response)) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL !!!!!!");
			System.out.println("Response: "+response);
			System.out.println("Expected Response: "+expectedResponse);

		}
		
		
		System.out.print("Testing with an edge suit case (one above largest)...."); // Pass/ Fail
		c = new Card(4, 13);
		expectedResponse = "Invalid Card"; 
		response = c.toString();
		
		//assert expectedResponse.equals(response);
		if(expectedResponse.equals(response)) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL !!!!!!");
			System.out.println("Response: "+response);
			System.out.println("Expected Response: "+expectedResponse);

		}
	}

}
