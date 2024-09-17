
public class Student extends Person {
	private String major;

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	@Override
	public void haveBirthday() {
		super.haveBirthday();
		System.out.println("Balloons for " + getName());
	}

	@Override
	public String toString() {
		return "Student [name=" + getName() + ", age=" + getAge() + ", major=" + major + "]";
	}
}
