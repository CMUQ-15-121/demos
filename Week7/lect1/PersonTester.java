package lect1;

import java.util.ArrayList;
import java.util.Collections;

public class PersonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Person> myList = new ArrayList<Person>();
		myList.add(new Person("Zain", 22));
		myList.add(new Person("Ahmed", 19));
		myList.add(new Person("John", 35));
		myList.add(new Person("Ahmed", 18));
		
		System.out.println(myList);

		Collections.sort(myList); //CompareTo
		System.out.println(myList);
		
	}

}
