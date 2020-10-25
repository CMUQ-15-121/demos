public class Student {
	private String name;
	private String andrewId;

	public Student(String name, String andrewId) {
		this.name = name;
		this.andrewId = andrewId;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", andrewId=" + andrewId + "]";
	}

}