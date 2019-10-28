import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTester {

	public static void main(String[] args) {
		Roster myRoster = new Roster();
		
		myRoster.add(new Student("John"));
		myRoster.add(new Student("Bob"));
		
		// One way to iterate through the roster
		for(int i = 0; i < myRoster.size(); i++) {
			System.out.println(myRoster.get(i));
		}
		
		// A for-each loop through the roster
		// This actually uses the iterator
		for(Student s: myRoster) {
			System.out.println(s);
		}
			
		// When you write a for-each loop, this is what
		// Java turns it into before running it.
		Iterator<Student> it = myRoster.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
		
		/*
		// This will cause a Exception.
		Iterator<Student> it = myRoster.iterator();
		while(true) {
			Student s = it.next();
			System.out.println(s);
		}
		*/
	}
}
