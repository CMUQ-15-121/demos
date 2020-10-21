
public class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return this.name + "(" + this.age + ")";
	}

	@Override
	public int compareTo(Person o) {
		// Return negative number if this < o
		// Return 0 if this == o
		// Return positive number if this > o

		// Idea 1: Sort by age
//		if (this.age < o.age) {
//			return -1;
//		} else if (this.age == o.age) {
//			return 0;
//		} else {
//			return 1;
//		}

		// Idea 2: Sort by name
//		int res = this.name.compareTo(o.name);
//		return res;

		// Idea 3: Sort by name, break ties with age
		int res = this.name.compareTo(o.name);
		if (res == 0) {
			if (this.age < o.age) {
				return -1;
			} else if (this.age == o.age) {
				return 0;
			} else {
				return 1;
			}
		} else {
			return res;
		}
	}
}
