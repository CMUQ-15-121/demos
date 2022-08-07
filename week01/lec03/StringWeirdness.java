
public class StringWeirdness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hey";
		//String s2 = "Hey";
		String s2 = "H";
		s2 += "ey";
		
		System.out.println("s1 is: " + s1);
		System.out.println("s2 is: " + s2);
		if (s1 == s2) {
			System.out.println("The references are the same!");
		}
		
		if (s1.equals(s2)) {
			System.out.println("The contents are the same!");
		}
	}

}
