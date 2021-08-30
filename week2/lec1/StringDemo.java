
public class StringDemo {

	public static void main(String[] args) {
		String firstString = "Hi there";

		System.out.println(firstString.charAt(5));
		// System.out.println(firstString.charAt(50));

		String secondString = "Hi";
		secondString += " there";
		String thirdString = "Hi there";
		
		System.out.println(firstString);
		System.out.println(secondString);
		System.out.println(thirdString);
		

		if (firstString == secondString) {
			System.out.println("secondString matches!");
		} else {
			System.out.println("secondString doesn't match!");
		}
		
		if (firstString == thirdString) {
			System.out.println("thirdString matches!");
		} else {
			System.out.println("thirdString doesn't match!");
		}

		// You want this.
		if (firstString.equals(secondString)) {
			System.out.println("secondString matches!");
		} else {
			System.out.println("secondString doesn't match!");
		}
		
	}

}
