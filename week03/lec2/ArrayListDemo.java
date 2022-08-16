import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> theList = new ArrayList<String>();
		
		theList.add("Bob");
		theList.add("Fred");
		System.out.println(theList);
		theList.add(0,"Ryan");
		System.out.println(theList);
		theList.add(1,"Ahmed");
		System.out.println(theList);
		
		//Nope: theList[0]
		System.out.println(theList.get(0));
		
		for(int i = 0; i < theList.size(); i++) {
			System.out.println(theList.get(i));
		}
		
		for(String item: theList) {
			System.out.println(item);
		}

	}

}
