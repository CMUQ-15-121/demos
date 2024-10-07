import java.util.ArrayList;
import java.util.Collections;

public class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person o) {
		// Method 1
//		if (this.age < o.age) {
//			return -1;
//		} else if (this.age > o.age) {
//			return 1;
//		} else {
//			return 0;
//		}
		
		// Method 2
//		return this.age - o.age;
		
		// Method 3: Sort by name
//		return this.name.compareTo(o.name);
		
		// Method 4: Sort by name, break ties by age
		int res = this.name.compareTo(o.name);
		if (res != 0) {
			return res;
		}
		return this.age - o.age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
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
}
