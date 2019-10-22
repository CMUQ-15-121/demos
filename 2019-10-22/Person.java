import java.util.Scanner;

public class Person implements Comparable<Person> {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public int compareTo(Person o) {
		// this.name < o.name
		if (this.name.compareTo(o.name) < 0) {
			return -1;
		}
		// this.name > o.name
		else if (this.name.compareTo(o.name) > 0) {
			return 1;
		}
		// this.name == o.name
		else {
			return 0;
		}
	}
}
