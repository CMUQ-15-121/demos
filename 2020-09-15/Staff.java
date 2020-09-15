
public class Staff extends Person {
	private String andrewId;
	private int salary;

	public Staff(String name, int age, String andrewId, int salary) {
		super(name, age);
		this.andrewId = andrewId;
		this.salary = salary;
	}
	
	public int getSalary() {
		return this.salary;
	}

	@Override
	public String toString() {
		return super.toString() + " (Andrew ID: " + this.andrewId + ") (Salary: " + this.salary + ")";
	}

}
