import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonSortingDemo {

	private class CompareAge implements Comparator<Person> {

		@Override
		public int compare(Person p1, Person p2) {
			return p1.getAge() - p2.getAge();
		}

	}

	public PersonSortingDemo() {
		ArrayList<Person> theList = new ArrayList<Person>();

		theList.add(new Person("Zain", 22));
		theList.add(new Person("Ahmed", 19));
		theList.add(new Person("John", 35));
		theList.add(new Person("Ahmed", 18));

		Collections.sort(theList, new CompareAge());
		//Collections.sort(theList);

		for (Person p : theList) {
			System.out.println(p);
		}
	}

	public static void main(String[] args) {
		new PersonSortingDemo();
	}
}