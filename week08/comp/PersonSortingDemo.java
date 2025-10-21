package comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonSortingDemo {

	public PersonSortingDemo() {
		ArrayList<Person> theList = new ArrayList<Person>();

		theList.add(new Person("Zain", 22));
		theList.add(new Person("Ahmed", 19));
		theList.add(new Person("John", 35));
		theList.add(new Person("Ahmed", 18));

		Collections.sort(theList, new CompareAge());

		for (Person p : theList) {
			System.out.println(p);
		}
	}
	
	
	private class CompareAge implements Comparator<Person>{

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			return o1.getAge() - o2.getAge();
		}
		
		
		
	}

	public static void main(String[] args) {
		new PersonSortingDemo();
	}

}
