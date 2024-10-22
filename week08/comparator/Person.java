public class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {
		// Compare this with o

		// Sort by name, then by age
		int res = this.name.compareTo(o.name);
		if (res != 0) {
			return res;
		}
		return this.age - o.age;

	}
}