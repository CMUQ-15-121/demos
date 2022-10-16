import java.util.Iterator;
import java.util.NoSuchElementException;

public class Roster implements Iterable<Student> {
	private final static int MAX_STUDENTS = 40;
	private Student[] theStudents;
	private int cnt;
	
	public Roster() {
		theStudents = new Student[MAX_STUDENTS];
		cnt = 0;
	}
	
	public int size() {
		return cnt;
	}
	
	public void add(Student s) {
		if (cnt < MAX_STUDENTS) {
			theStudents[cnt++] = s;
		}
	}
	
	public Student get(int idx) {
		return theStudents[idx];
	}

	public class RosterIterator implements Iterator<Student> {
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
}
