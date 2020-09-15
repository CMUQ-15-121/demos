
public class Student extends Person {
	private String andrewId;
	
	public Student(String name, int age, String andrewId) {
		super(name, age);		
		this.andrewId = andrewId;		
	}

	public String getAndrewId() {
		return this.andrewId;
	}
	
	public String toString() {
		//return super.toString() + " (Andrew ID: " + this.andrewId + ")";
		return this.getName() + " (Student)" + " (Age: " + this.getAge() + ")" + " (Andrew ID: " + this.andrewId + ")";
	}
}
