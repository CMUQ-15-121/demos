import java.util.ArrayList;
import java.util.Collections;

public class Person implements Comparable<Person> {
	private String firstName;
	private String lastName;
	private int birthMonth;
	private int birthDay;
	private int birthYear;
	private static int[] daysInMonth = { -1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public Person(String firstName, String lastName, int birthMonth, int birthDay, int birthYear) {
		setFirstName(firstName);
		setLastName(lastName);
		setBirthDate(birthMonth, birthDay, birthYear);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (firstName == null) {
			throw new IllegalArgumentException("Invalid first name");
		}
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName == null) {
			throw new IllegalArgumentException("Invalid last name");
		}
		this.lastName = lastName;
	}

	public int getBirthMonth() {
		return birthMonth;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthDate(int birthMonth, int birthDay, int birthYear) {
		this.birthYear = birthYear;

		if (birthMonth < 1 || birthMonth > 12) {
			throw new IllegalArgumentException("Invalid month");
		}
		this.birthMonth = birthMonth;

		if ((birthYear % 4 == 0) && ((birthYear % 100 != 0) || (birthYear % 400 == 0))) {
			daysInMonth[2] = 29;
		} else {
			daysInMonth[2] = 28;
		}

		if (birthDay < 1 || birthDay > daysInMonth[this.birthMonth]) {
			throw new IllegalArgumentException("Invalid day");
		}

		this.birthDay = birthDay;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthMonth=" + birthMonth
				+ ", birthDay=" + birthDay + ", birthYear=" + birthYear + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + birthDay;
		result = prime * result + birthMonth;
		result = prime * result + birthYear;

		//result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		if (firstName == null) {
			result = prime * result + 0;
		} else {
			result = prime * result + firstName.hashCode();
		}
		
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// Alias check
		if (this == obj)
			return true;

		// If the other object is null, we definitely aren't equal to them.
		if (obj == null)
			return false;

		// Ensure this and obj are the same type
		if (!(obj instanceof Person)) {
			return false;
		}

		Person other = (Person) obj;
		if (birthDay != other.birthDay)
			return false;
		if (birthMonth != other.birthMonth)
			return false;
		if (birthYear != other.birthYear)
			return false;

		if (!firstName.equals(other.firstName))
			return false;
		if (!lastName.equals(other.lastName))
			return false;

		return true;
	}
	
	@Override
	public int compareTo(Person o) {
		// Sort by... last name, first name, year, month, day
		int ret = this.lastName.compareTo(o.lastName);
		if (ret != 0) {
			return ret;
		}
		
		ret = this.firstName.compareTo(o.firstName);
		if (ret != 0) {
			return ret;
		}
		
		ret = this.birthYear - o.birthYear;
		if (ret != 0) {
			return ret;
		}
		
		ret = this.birthMonth - o.birthMonth;
		if (ret != 0) {
			return ret;
		}
		
		return this.birthDay - o.birthDay;
	}

	public static void main(String[] args) {
		Person p = new Person("Ahmed", "Al-Jaber", 2, 29, 2000);
		// p.setBirthMonth(18);
		p.setBirthDate(2, 29, 2004);
		System.out.println(p);
		
		Person p2 = new Person("Ahmed", "Al-Jaber", 2, 29, 2004);
		System.out.println(p);
		System.out.println(p2);
		System.out.println(p.equals(p2));
		
		p2.setBirthDate(2, 29, 2016);
		
		ArrayList<Person> myList = new ArrayList<Person>();
		myList.add(p);
		myList.add(p2);
		Collections.sort(myList);
		System.out.println(myList);
	}
}
