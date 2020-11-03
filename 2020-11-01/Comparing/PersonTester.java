import java.util.ArrayList;
import java.util.Collections;

public class PersonTester {

	public static void main(String[] args) {
		ArrayList<Person> myList = new ArrayList<Person>();

		myList.add(new Person("Zain", "A", 22));
		myList.add(new Person("Ahmed", "B", 19));
		myList.add(new Person("John", "C", 35));
		myList.add(new Person("Ahmed", "B", 18));

		Collections.sort(myList);

		for (Person p : myList) {
			System.out.println(p);
		}
		
		System.out.println("\nSorting by age...");
		
		Collections.sort(myList, new PersonByAge());
		
		for (Person p : myList) {
			System.out.println(p);
		}
	}
}
