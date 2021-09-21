package edu.cmu.qatar._15121.week4;

public class Student extends Person {
	private String university;

	public Student(String firstName, String lastName, int birthMonth, int birthDay, int birthYear, String university) {
		super(firstName, lastName, birthMonth, birthDay, birthYear);
		this.university = university;
	}
	
	public String getUniversity() {
		return this.university;
	}
	
	@Override
	public String toString() {
		return "Student [firstName=" + getFirstName() + ", lastName=" + getLastName() + ", birthMonth=" + getBirthMonth()
				+ ", birthDay=" + getBirthDay() + ", birthYear=" + getBirthYear() + ", university=" + getUniversity() + "]";
	}

	public static void main(String[] args) {
		Student s = new Student("Ibrahim", "Al-Thani", 4, 30, 2001, "CMUQ");
		System.out.println(s);
		if (s instanceof Student) {
			System.out.println("s is a student");
		}
		if (s instanceof Person) {
			System.out.println("s is a person");
		}
	}
}
