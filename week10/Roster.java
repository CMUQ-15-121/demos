import java.util.Iterator;
import java.util.NoSuchElementException;

public class Roster implements Iterable<Student> {
	private final static int MAX_STUDENTS = 40;
	private Student[] theStudents;
	private int cnt;

	public Roster() {
		this.theStudents = new Student[MAX_STUDENTS];
		this.cnt = 0;
	}

	public int size() {
		return cnt;
	}

	public void add(Student s) {
		if (this.cnt < MAX_STUDENTS) {
			this.theStudents[this.cnt++] = s;
		}
	}

	public Student get(int idx) {
		return this.theStudents[idx];
	}

	private class RosterIterator implements Iterator<Student> {
		private int cur = 0;

		@Override
		public boolean hasNext() {
			return cur < cnt;
		}

		@Override
		public Student next() {
			if (hasNext()) {
				return theStudents[cur++];
			} else {
				throw new NoSuchElementException();
			}
		}
	}

	@Override
	public Iterator<Student> iterator() {
		return new RosterIterator();
	}

	public static void main(String[] args) {
		Roster r = new Roster();
		r.add(new Student("Ryan", "rdriley"));
		r.add(new Student("Ahmed", "ahmed"));
		r.add(new Student("Fatima", "fsafr"));

//		for (int i = 0; i < r.size(); i++) {
//			System.out.println(r.get(i));
//		}

		for (Student s : r) {
			System.out.println(s);
		}
	}
}
