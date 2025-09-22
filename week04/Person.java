package DEMO;

public class Person {
	private String name;
	private int age;


	public Person() {
		System.out.println("Person Created !");
	}
	
	public Person(String name, int age) {
		this(); //calls default constructor
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
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return this.name + " (Age: " + this.age + ")";
	}

}

