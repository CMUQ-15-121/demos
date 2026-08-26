package wk1_Lect2;

public class StringWeirdness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Hey"; //adds it to a shared storage area (Literal Pool)
		String s2 = "Hey"; //already in the pool, so it sets s2 to point at the same string object
		//for memory efficiency
		
		System.out.println(s1==s1); //expecting F. Got T
		System.out.println(s1.equals(s2)); // T
		
		System.out.println("-------------------------");
		
		String s3 = "H";
		String s4 = s3+"ey"; // constructed at runtime (e.g. upperCase, substring, reading input)
		System.out.println(s1==s4); //F
		System.out.println(s1.equals(s4)); // T
		
		System.out.println("-------------------------");
		
		String s5 = "H"+"ey";  //none of them is a variable so this is a string literal .. already in pool, s5 will refer to same string literal
		System.out.println(s1==s5); // T
		System.out.println(s1.equals(s5)); // T
		
		System.out.println("-------------------------");

		
		
		

	}

}
