import java.util.ArrayList;

public class InheritanceTester {

	public static void main(String[] args) {
		Person p = new Person("Bob", 21);
		ISStudent s = new ISStudent("Fatima", 20, "Information Systems");
		Student anotherS = new Student("Ahmed", 19, "Computer Science");

		System.out.println(p);
		System.out.println(s);

		p.haveBirthday();
		s.haveBirthday();

		System.out.println(p);
		System.out.println(s);

		s.takeMilleux();

		System.out.println("---");
		Person t = s;
		// t.takeMilleux();

		ArrayList<Person> theList = new ArrayList<Person>();
		theList.add(p);
		theList.add(s);
		theList.add(anotherS);

		System.out.println("---");
		for (Person tmp : theList) {
			System.out.println(tmp.toString());
			if (tmp instanceof ISStudent) {
				//ISStudent theStudent = (ISStudent) tmp;
				//theStudent.takeMilleux();
				((ISStudent)tmp).takeMilleux();
			}
		}

	}

}
