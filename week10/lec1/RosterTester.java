import java.util.Iterator;

public class RosterTester {

	public static void main(String[] args) {
		Roster r = new Roster();
		r.add(new Student("Bob", "bsmith"));
		r.add(new Student("Ahmed", "athani"));
		r.add(new Student("Fatima", "fsafar"));
		
		for(int i = 0; i < r.size(); i++) {
			System.out.println(r.get(i));
		}
		
		for(Student s: r) {
			System.out.println(s);
		}
		
		// The for-each loop is automagically changed to this
		Iterator<Student> it = r.iterator();
		while(it.hasNext() == true) {
			Student s = it.next();
			System.out.println(s);
		}
		
		// Don't do this, it is stupid.  But you need to write your
		// iterator to handle stupid.
		it = r.iterator();
		while(true) {
			Student s = it.next();
			System.out.println(s);
		}		

	}

}
