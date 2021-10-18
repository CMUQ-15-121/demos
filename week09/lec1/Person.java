
public class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {
		// Compare this with o

		// Idea 1: Sort by age
//		if (this.age < o.age) {
//			return -1;
//		} else if (this.age > o.age) {
//			return 1;
//		} else {
//			return 0;
//		}
		
		// Idea 2: Sort by name
		//return this.name.compareTo(o.name);
		
		// Idea 3: Sort by name, break ties with age
		// Check name first
		int res = this.name.compareTo(o.name);
		if (res != 0) {
			return res;
		}
		
		// There was a tie with name, so check age
		if (this.age < o.age) {
			return -1;
		} else if (this.age > o.age) {
			return 1;
		} else {
			return 0;
		}		

	}
	
}
