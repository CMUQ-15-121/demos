import java.util.Iterator;

public class School implements Iterable<Student> {
    private ListNode head;

    private class ListNode {
        private Student data;
        private ListNode next;

        private ListNode(Student data) {
            this.data = data;
            this.next = null;
        }

        public String toString() {
            return data.toString();
        }
    }

    // Adds to the end of the linked list
    public void add(Student p) {
        ListNode tmp = head;
        if (tmp == null) {
            head = new ListNode(p);
            return;
        }
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = new ListNode(p);
    }

    public static void main(String[] args) {
        School mySchool = new School();

        mySchool.add(new Student("Bob"));
        mySchool.add(new Student("Ahmed"));
        mySchool.add(new Student("Nora"));

        /*
         * The following loop should output:
         * Bob
         * Ahmed
         * Nora
         */
        for (Student s : mySchool) {
            System.out.println(s);
        }
    }

    public class MyIterator implements Iterator {
    	private ListNode cur = head;

		@Override
		public boolean hasNext() {
			return cur != null;
		}

		@Override
		public Object next() {
			if (!hasNext()) {
				// Do something
				
			}
			Student ret = cur.data;
			cur = cur.next;
			return ret;
		}
    }
    
	@Override
	public Iterator<Student> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}