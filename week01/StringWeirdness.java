
public class StringWeirdness {

	public static void main(String[] args) {
		String s1 = "Hey";
		String s2 = "Hey";
		
		System.out.println("s1 is " + s1);
		System.out.println("s2 is " + s2);
		if (s1 == s2) {
			System.out.println("The strings are the same reference");
		}
		
		if (s1.equals(s2)) {
			System.out.println("The strings are the same value");
		}
	}

}
