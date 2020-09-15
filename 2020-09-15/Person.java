public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void birthday() {
		this.age++;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}
	
	public String toString() {
		return this.name + " (Age: " + this.age + ")";
	}	
}