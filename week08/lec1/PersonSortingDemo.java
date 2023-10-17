import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonSortingDemo {

	private class ComparePersonByAge implements Comparator<Person> {

		@Override
		public int compare(Person o1, Person o2) {
			return o2.getAge() - o1.getAge();
		}

	}

	private class ComparePersonByName implements Comparator<Person> {

		@Override
		public int compare(Person o1, Person o2) {
			return o1.getName().compareTo(o2.getName());
		}

	}

	public PersonSortingDemo() {
		ArrayList<Person> theList = new ArrayList<Person>();

		theList.add(new Person("Zain", 22));
		theList.add(new Person("Ahmed", 19));
		theList.add(new Person("John", 35));
		theList.add(new Person("Ahmed", 18));

		Collections.sort(theList, new ComparePersonByAge());

		for (Person p : theList) {
			System.out.println(p);
		}
	}

	public static void main(String[] args) {
		new PersonSortingDemo();
	}

}
