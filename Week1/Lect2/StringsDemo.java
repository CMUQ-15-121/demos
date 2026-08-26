package wk1_Lect2;

public class StringsDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Strings are immutable
		String s1 = "Hi 121 Students";
		System.out.println(s1);
		
		s1+= "There"; //s1=s1+"There";
		System.out.println(s1);
		
		
		//built in methods: contains()
		String s2 = "121 "; //"121";
		if (s1.contains(s2)) {
			System.out.println("It is there!");
		}else {
			System.out.println("Not there!");

		}
		
		System.out.println("-------------------------");

		String s4 = "Has "; //"Has"
		String s3 = "ThisStringHasNoSpaces";
		if (s3.contains(s4)) {
			System.out.println("It is there!");
		}else {
			System.out.println("Not there!");

		}
		

		//Slicing? Not in Java
		//System.out.println(s1[2:5]);
		
	}

}
