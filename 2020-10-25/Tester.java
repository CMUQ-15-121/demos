import java.util.Iterator;

public class Tester {
	public static void main(String[] args) {
		Roster r = new Roster();
		r.add(new Student("Ryan Riley", "rdriley"));
		r.add(new Student("John Smith", "jsmith"));
		r.add(new Student("Ahmed Al-Ghanim", "aghanim"));

		// A normal for-loop.
//		for(int i = 0; i < r.size(); i++) {
//			System.out.println(r.get(i));
//		}

		// A for-each loop
//		for(Student s: r) {
//			System.out.println(s);
//		}

		// In reality, a for-each loop is transformed into this
//		Iterator<Student> it = r.iterator();
//		while(it.hasNext()) {
//			Student s = it.next();
//			System.out.println(s);
//		}

		// If I was an idiot, I might write my for-each loop like this.
		// The iterator should throw an appropriate exception.
		Iterator<Student> it = r.iterator();
		while (true) {
			Student s = it.next();
			System.out.println(s);
		}
	}
}
