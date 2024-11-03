
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAndrewId() {
		return andrewId;
	}

	public void setAndrewId(String andrewId) {
		this.andrewId = andrewId;
	}
}
