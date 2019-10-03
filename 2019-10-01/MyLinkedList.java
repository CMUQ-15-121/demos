
public class MyLinkedList<DataType> {

	private ListNode<DataType> head;
	private int numNodes = 0;

	public MyLinkedList() {
		this.head = null;
		this.numNodes = 0;
	}

	public boolean isEmpty() {
		return this.head == null;
	}

	public void addHead(DataType data) {
		ListNode<DataType> newNode = new ListNode(data);
		newNode.next = head;
		head = newNode;
		this.numNodes++;
	}

	public String toString() {
		String ret = "";
		if (!isEmpty()) {
			ret += head;
			for (ListNode tmp = head.next; tmp != null; tmp = tmp.next) {
				ret += " -> " + tmp;
			}
		}
		return ret;
	}

	// O(N)
	public int slowSize() {
		int numNodes = 0;
		for (ListNode tmp = head; tmp != null; tmp = tmp.next) {
			numNodes++;
		}
		return numNodes;
	}

	// O(1)
	public int size() {
		return this.numNodes;
	}

	// O(N)
	public boolean add(DataType value) {
		if (isEmpty()) {
			addHead(value);
		} else {
			ListNode<DataType> newNode = new ListNode<DataType>(value);

			ListNode tmp = head;
			while (tmp.next != null) {
				tmp = tmp.next;
			}

			tmp.next = newNode;
			this.numNodes++;
		}
		return true;
	}

	// O(N)
	public boolean contains(DataType value) {
		for (ListNode tmp = head; tmp != null; tmp = tmp.next) {
			if (tmp.data.equals(value)) {
				return true;
			}
		}
		return false;
	}

	// O(N)
	public int indexOf(DataType value) {
		int idx = 0;
		for (ListNode tmp = head; tmp != null; tmp = tmp.next) {
			if (tmp.data.equals(value)) {
				return idx;
			}
			idx++;
		}
		return -1;
	}

	// O(N)
	public boolean remove(DataType value) {
		if (head.data.equals(value)) {
			head = head.next;
			this.numNodes--;
			return true;
		}

		ListNode prev = head;
		for (ListNode tmp = head.next; tmp != null; tmp = tmp.next) {
			if (tmp.data.equals(value)) {
				prev.next = tmp.next;
				return true;
			}
			prev = tmp;
		}

		return false;
	}

	// O(N^2)
	public void removeAll(DataType value) {
		while (remove(value) == true)
			;
	}

	public void printList() {
		printList(this.head);
	}
	
	public void printList(ListNode n) {
		if (n == null) {
			System.out.println("null");
		} else {
			System.out.print(n.data);
			System.out.print(" --> ");
			printList(n.next);
		}
	}

	public void printReverseList() {
		printReverseList(this.head);
	}
	
	public void printReverseList(ListNode n) {
		if (n == null) {
			System.out.print("null --> ");
		} else {
			printReverseList(n.next);
			
			System.out.print(n.data);
			System.out.print(" --> ");
		}		
	}

}
