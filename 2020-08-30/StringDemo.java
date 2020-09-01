
public class StringDemo {

	public static void main(String[] args) {
		String firstSample = "Hi there";
		
		String secondSample = "Hi";
		secondSample += " there";
		
		System.out.println(firstSample);
		System.out.println(secondSample);
		
		if (firstSample.equals(secondSample)) {
			System.out.println("They are the same!");
		}
		else {
			System.out.println("They are not the same!");
		}
	}
}
