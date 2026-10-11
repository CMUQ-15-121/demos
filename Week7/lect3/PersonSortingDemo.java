package lect3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import lect1.Person;

public class PersonSortingDemo {
	
	
	private class CompareAge implements Comparator<Person>{

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			return o1.getAge()-o2.getAge();
		}
		
	}
	
	
	public PersonSortingDemo() {
		ArrayList<Person> myList = new ArrayList<Person>();
		myList.add(new Person("Zain", 22));
		myList.add(new Person("Ahmed", 19));
		myList.add(new Person("John", 35));
		myList.add(new Person("Ahmed", 18));
		
		System.out.println(myList);

		//Collections.sort(myList); //Comparable-CompareTo() .. default sorting
		Collections.sort(myList, new CompareAge()); //alternative sorting  .. calls compare()
			
		
		
		System.out.println(myList);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new PersonSortingDemo();

	}

}
