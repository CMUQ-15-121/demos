
public class Tester {

	public static void main(String[] args) {
		Person p = new Person("Bob Jones", 62);
		Student s = new Student("Jassim Al-Kubaisi", 21, "jkubaisi");
		Staff w = new Staff("Ahmed Khan", 44, "akhan", 5000);

		System.out.println(p);
		System.out.println(s);
		System.out.println(w);

		System.out.println("---");

		Person[] personArray = new Person[5];
		personArray[0] = p;
		personArray[1] = s;
		personArray[2] = w;
		personArray[3] = new Student("Heather Johnson", 19, "hjohnson");
		personArray[4] = new Staff("Manuela Prajea", 57, "mprajea", 35000);

		// Print all people
		for (int i = 0; i < personArray.length; i++) {
			System.out.println(personArray[i]);
		}

		System.out.println("---");

		// Print only students
		for (int i = 0; i < personArray.length; i++) {
			if (personArray[i] instanceof Student) {
				System.out.println(personArray[i]);
			}
		}

		// Calculate the total salaries
		int salarySum = 0;
		for (int i = 0; i < personArray.length; i++) {
			if (personArray[i] instanceof Staff) {
				Staff tmp = (Staff) personArray[i];
				salarySum += tmp.getSalary();
			}
		}

		System.out.println("---");

		System.out.println("Total Salaries: " + salarySum);
	}
}
