import java.util.ArrayList;
import java.util.Collections;

public class PersonSortingDemo {

	public static void main(String[] args) {
		ArrayList<Person> theList = new ArrayList<Person>();

		theList.add(new Person("Zain", 22));
		theList.add(new Person("Ahmed", 19));
		theList.add(new Person("John", 35));
		theList.add(new Person("Ahmed", 18));

		Collections.sort(theList);

		for (Person p : theList) {
			System.out.println(p);
		}
	}

}
