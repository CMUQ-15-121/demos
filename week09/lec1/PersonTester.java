import java.util.ArrayList;
import java.util.Collections;

public class PersonTester {

	public static void main(String[] args) {
		ArrayList<Person> myList = new ArrayList<Person>();

		myList.add(new Person("Zain", 22));
		myList.add(new Person("Ahmed", 19));
		myList.add(new Person("John", 35));
		myList.add(new Person("Ahmed", 18));
		
		Collections.sort(myList);
		
		for(Person p: myList) {
			System.out.println(p);
		}
	}
}
