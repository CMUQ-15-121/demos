package edu.cmu.qatar._15121.week5;

public class Person {
	private String firstName;
	private String lastName;
	
	private int birthYear;
	private int birthMonth;
	private int birthDay;
		
	public Person(String firstName, String lastName, int birthYear, int birthMonth, int birthDay) {
		setFirstName(firstName);
		setLastName(lastName);
		setBirthDate(birthYear, birthMonth, birthDay);
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthYear=" + birthYear
				+ ", birthMonth=" + birthMonth + ", birthDay=" + birthDay + "]";
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

	public int getBirthYear() {
		return birthYear;
	}

	public int getBirthMonth() {
		return birthMonth;
	}

	public int getBirthDay() {
		return birthDay;
	}
	
	public void setBirthDate(int birthYear, int birthMonth, int birthDay) {

		// Validate the month
		if (birthMonth < 1 || birthMonth > 13) {
			throw new IllegalArgumentException("Invalid month");
		}
		
		// Validate the day within the year
		int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		// Is it a leap year?
		if ((birthYear % 4 == 0 && birthYear % 100 != 0) || birthYear%400 == 0) {
			daysInMonths[1]++;
		}
		
		if (birthDay <= 0 || birthDay > daysInMonths[birthMonth - 1]) {
			throw new IllegalArgumentException("Invalid day");
		}
		
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;	
	}

	public static void main(String[] args) {
		Person p = new Person("Ryan","Riley", 1981, 12, 26);
		System.out.println(p);
		
		Person p2 = new Person("Mike", "Trick", 2400, 2, 28);
		System.out.println(p2);
		p2.setBirthDate(1997, 2, 29);
		System.out.println(p2);
	}

}
