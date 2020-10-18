import java.util.ArrayList;
import java.util.Collections;

public class PersonTester {

	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<Person>();
		
		people.add( new Person("john") );
		people.add( new Person("ahmed") );
		people.add( new Person("carol") );
		people.add( new Person("noor") );
		people.add( new Person("Zack") );

		Collections.sort(people);
		
		for(Person p: people) {
			System.out.println(p);
		}

	}

}
