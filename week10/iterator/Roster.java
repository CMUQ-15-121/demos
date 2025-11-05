package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Roster implements Iterable<Student>{ 
	
	private final static int MAX_STUDENTS = 40;
	private Student[] theStudents; //uses an array
	private int cnt;
	
	public Roster() {
		theStudents = new Student[MAX_STUDENTS];
		cnt = 0;
	}

    /**
     * Get the number of people in the roster
     * 
     * @return The size of the roster
     */
	public int size() {
		return cnt;
	}

    /**
     * Add a person to the roster
     * 
     * @param p The person to add to the roster
     */
	public void add(Student s) {
		if (cnt < MAX_STUDENTS) {
			theStudents[cnt++] = s;
		}
	}

     /**
     * Get a person from the roster based on index
     * 
     * @param i The index of the person to get
     * @return The person at that index or null if the index is not valid
     */
	public Student get(int idx) {
		return theStudents[idx];
	}


	public Iterator<Student> iterator() {
		// TODO Auto-generated method stub
		return new RosterIterator();
	}
	
	private class RosterIterator implements Iterator<Student>{

		int cur = 0; //like cursor pointing at the item to retrieve next
		
		public boolean hasNext() {
			
			return cur < cnt; //true if cur points at a valid position
		}

		public Student next() {
			if(hasNext()) {
				return theStudents[cur++]; //return the item and update the cursor
			}else {
				throw new NoSuchElementException();
			}
			
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		Roster r = new Roster();
		r.add(new Student("Ryan", "rdriley"));
		r.add(new Student("Ahmed", "ahmed"));
		r.add(new Student("Fatima", "fsafar"));
		
		for(int i = 0; i < r.size(); i++) {
			System.out.println(r.get(i));
		}
		
		for(Student s: r) {
			System.out.println(s);
		}
		
	}


	
}