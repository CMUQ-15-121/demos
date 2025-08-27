
public class StringDemo {

	public static void main(String[] args) {
		String s = "Hi";
		s += " there";
		System.out.println(s);
		
		String myStr = "PurpleRedBlue";
		if (myStr.contains("Red ")) {
			System.out.println("It has Red!");
		} else {
			System.out.println("It does not have Red");
		}
	}

}
