
public class StringWeirdness {

	public static void main(String[] args) {
		String s1 = "Hey there";
		String s2 = "Hey";
		s2 += " there";

		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);

		if (s1 == s2) {
			System.out.println("Their references match!");
		} else if (s1.equals(s2)) {
			System.out.println("Their contents match!");
		} else {
			System.out.println("They don't match!");
		}
	}

}
