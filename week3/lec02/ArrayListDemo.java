import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> theList = new ArrayList<String>();
		
		theList.add("Bob");
		theList.add("Fred");
		System.out.println(theList);
		theList.add(1,"Ahmed");
		System.out.println(theList);
		
		System.out.println(theList.get(1));

	}

}
