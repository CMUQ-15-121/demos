
public class Staff extends Person {
	String andrewId;
	int salary;

	public String getAndrewId() {
		return this.andrewId;
	}

	public int getSalary() {
		return this.salary;
	}

	public Staff(String name, int age, String andrewId, int salary) {
		super(name, age);
		this.andrewId = andrewId;
		this.salary = salary;
	}

	public String toString() {
		return this.getName() + " (Staff)" + " (Age: " + this.getAge() + ")" + " (Andrew ID: " + this.andrewId + ")"
				+ " (Salary: " + this.salary + ")";
	}
}
