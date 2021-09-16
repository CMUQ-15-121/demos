/**
 * This file is maintained by Ryan Riley
 * rileyrd@cmu.edu
 */
package edu.cmu.qatar._15121.week4;

public class Person {
	private String firstName;
	private String lastName;
	private int birthMonth;
	private int birthDay;
	private int birthYear;

	public Person(String firstName, String lastName, int birthMonth, int birthDay, int birthYear) {
		this.setBirthMonth(birthMonth);
		this.setBirthDay(birthDay);
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.birthYear = birthYear;
	}

	public int getBirthMonth() {
		return this.birthMonth;
	}

	public void setBirthMonth(int birthMonth) {
		if (birthMonth < 1 || birthMonth > 12) {
			throw new IllegalArgumentException("Invalid month");
		}
		this.birthMonth = birthMonth;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthDay) {
		if (birthDay < 1 || birthDay > 31) {
			throw new IllegalArgumentException("Invalid day.");
		}
		this.birthDay = birthDay;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthMonth=" + birthMonth
				+ ", birthDay=" + birthDay + ", birthYear=" + birthYear + "]";
	}

	public static void main(String[] args) {
		Person p = new Person("Bob", "Jones", 6, 28, 1954);
		System.out.println(p);
	}
}
