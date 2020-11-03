
public class Person implements Comparable<Person> {
	private String lastName;
	private String firstName;
	private int age;

	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}

	public String toString() {
		return this.firstName + " " + this.lastName + "(" + this.age + ")";
	}

	@Override
	public int compareTo(Person o) {
		// The natural order for Person is first name, last name, age
		
		int res = this.firstName.compareTo(o.firstName);
		if (res != 0) {
			return res;
		}
		
		res = this.lastName.compareTo(o.lastName);
		if (res != 0) {
			return res;
		}
		
//		if (this.age < o.age) {
//			return -1;
//		} else if (this.age > o.age) {
//			return 1;
//		} else {
//			return 0;
//		}
		return this.age - o.age;
	}
}
