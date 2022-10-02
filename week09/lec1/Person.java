
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
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + firstName + " " + lastName + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {
		// The natural order for Person is first name, last name, age
		
		// Check the first name
		int res = this.firstName.compareTo(o.firstName);
		if (res != 0) {
			return res;
		}
		
		// First name was a tie, so now check last name
		res = this.lastName.compareTo(o.lastName);
		if (res != 0) {
			return res;
		}
		
		// Last name was also a tie, now base it on age
		return this.age - o.age;		

	}
	
}