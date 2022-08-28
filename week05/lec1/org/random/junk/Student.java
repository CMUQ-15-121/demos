package org.random.junk;

import edu.cmu.qatar._15121.week5.Person;

public class Student extends Person {

	private String university;
	
	public Student(String firstName, String lastName, int birthYear, int birthMonth, int birthDay, String university) {
		super(firstName, lastName, birthYear, birthMonth, birthDay);
		this.university = university;
	}

//	@Override
//	public void setBirthYear(int birthYear) {
//		if (birthYear < 1890 || birthYear > 2022) {
//			throw new IllegalArgumentException("Illegal year");
//		}
//		super.setBirthYear(birthYear);
//	}
	
	public void setBirthDate(int birthYear, int birthMonth, int birthDay) {
		if (birthYear < 1890 || birthYear > 2022) {
			throw new IllegalArgumentException("Illegal year");
		}
		super.setBirthDate(birthYear, birthMonth, birthDay);
	}
	
	@Override
	public String toString() {
		return "Student [firstName=" + getFirstName() + ", lastName=" + getLastName() + ", birthYear="
				+ getBirthYear() + ", birthMonth=" + getBirthMonth() + ", birthDay=" + getBirthDay()
				+ ", university=" + university + "]";
	}

	public String getUniversity() {
		return university;
	}

	public static void main(String[] args) {
		Student s = new Student("Mohamed", "AlMarri", 1890, 7, 3, "Cornell");
		System.out.println(s);
	}
}
