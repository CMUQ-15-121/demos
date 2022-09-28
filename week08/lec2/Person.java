import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Person implements Comparable<Person>, Player {
	private String name;
	private int age;
	Scanner inp;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.inp = new Scanner(System.in);
	}

	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(Person p) {
		// Idea 1: Sort by age
//		if (this.age < p.age) {
//			return -1;
//		} else if (this.age == p.age) {
//			return 0;
//		} else {
//			return 1;
//		}
		
		// Idea 2: Sort by name
		// return this.name.compareTo(p.name);
		
		// Idea 3: Sort by name, break tie by age
		int res = this.name.compareTo(p.name);
		if (res != 0) {
			return res;
		}
		// There was a tie with name, so I'm going to use age to break it
		if (this.age < p.age) {
			return -1;
		} else if (this.age == p.age) {
			return 0;
		} else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Person> myList = new ArrayList<Person>();
		myList.add(new Person("Zain", 22));
		myList.add(new Person("Ahmed", 19));
		myList.add(new Person("John", 35));
		myList.add(new Person("Ahmed", 18));
		Collections.sort(myList);
		System.out.println(myList);
	}

	@Override
	public char choose() {
		System.out.println(this.name + ": (r)ock, (p)aper, or (s)cissors?");
		String res = inp.nextLine();
		return res.charAt(0);
	}
}
