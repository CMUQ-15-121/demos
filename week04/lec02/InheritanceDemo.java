import java.util.ArrayList;

public class InheritanceDemo {

	public static void main(String[] args) {
		ArrayList<Person> bigList = new ArrayList<Person>();
		bigList.add(new Person("Bob Jones", 45));
		bigList.add(new Student("John Smith", 19, "InfoSys"));
		bigList.add(new Person("Bridget Johnson", 22));
		bigList.add(new Student("Muneera Al-Mannai", 21, "CompSci"));

		for (Person p: bigList) {
			if (p instanceof Student) {
				Student temp = (Student) p;
				System.out.println(temp.getMajor());
			}
			System.out.println(p);
		}
	}

}
