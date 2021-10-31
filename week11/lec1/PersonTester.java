import java.util.ArrayList;
import java.util.Collections;

public class PersonTester {

	public static void main(String[] args) {
		ArrayList<Person> myList = new ArrayList<Person>();

		myList.add(new Person("Zain", "Abdalla", 22));
		myList.add(new Person("Ahmed", "Balooshi", 17));
		myList.add(new Person("Ahmed", "Badri", 19));
		myList.add(new Person("John", "Smith", 35));
		myList.add(new Person("Ahmed", "Badri", 18));
		
		Collections.sort(myList);
		
		for(Person p: myList) {
			System.out.println(p);
		}
		
		// Don't sort by the natural ordering, use mine
		Collections.sort(myList, new PersonByAge());
		
		System.out.println("---");
		
		for(Person p: myList) {
			System.out.println(p);
		}
	}
}
