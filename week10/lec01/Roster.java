import java.util.Iterator;
import java.util.NoSuchElementException;

public class Roster implements Iterable<Student> {
	private Student[] theStudents;
	private int cnt;

	public Roster() {
		theStudents = new Student[40];
		cnt = 0;
	}

	public int size() {
		return this.cnt;
	}

	public void add(Student s) {
		if (cnt < 40) {
			theStudents[cnt++] = s;
		}
	}

	public Student get(int idx) {
		if (idx < 0 || idx >= cnt) {
			throw new IndexOutOfBoundsException();
		}
		return theStudents[idx];
	}

	@Override
	public Iterator<Student> iterator() {
		return new RosterIterator();
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

	public static void main(String[] args) {
		Roster r = new Roster();
		r.add(new Student("Ryan", "rdriley"));
		r.add(new Student("Ahmed", "ahmed"));
		r.add(new Student("Fatima", "fsafar"));

//		for(int i = 0; i < r.size(); i++) {
//			System.out.println(r.get(i));
//		}

		for (Student s : r) {
			System.out.println(s);
		}
	}
}
