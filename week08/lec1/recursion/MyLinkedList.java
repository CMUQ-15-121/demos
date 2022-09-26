
public class MyLinkedList<ListType> {
	private Node<ListType> head;
	private int numNodes;

	// Methods I want:
	// add
	// remove
	// contains
	// indexOf
	// get
	// size

	public MyLinkedList() {
		this.head = null;
		this.numNodes = 0;
	}

	/**
	 * Return whether or not the list is empty
	 * 
	 * @return true if the list is empty and false otherwise
	 */
	public boolean isEmpty() {
		return this.head == null;
	}

	/*
	 * O(1)
	 */
	public void addToHead(ListType item) {
		Node<ListType> tmp = new Node<ListType>(item);
		tmp.next = head;
		head = tmp;
		this.numNodes++;
	}

	/**
	 * Add item to the end of the list
	 * 
	 * O(N)
	 * 
	 * @param item
	 */
	public void add(ListType item) {
		// Step 0: If the list is empty, put it at the head
		if (isEmpty()) {
			this.head = new Node<ListType>(item);
			this.numNodes++;
			return;
		}

		// Step 1: Find a pointer to the last node
		// for(Node<ListType> t = head; t != null; t = t.next)
		// for(Node<ListType> tmp = head; tmp.next != null; tmp = tmp.next);
		Node<ListType> tmp = head;
		while (tmp.next != null) {
			tmp = tmp.next;
		}

		// Step 2: Add new node after last node
		tmp.next = new Node<ListType>(item);
		this.numNodes++;
	}

	/**
	 * Return the number of nodes in the LinkedList
	 * 
	 * O(N)
	 * 
	 * @return the number of nodes in the list
	 */
	public int sizeTooSlow() {
		// Q's to discuss:
		// - What happens when the list is empty?
		int cnt = 0;
		for (Node<ListType> tmp = this.head; tmp != null; tmp = tmp.next) {
			cnt++;
		}
		return cnt;
	}

	public int size() {
		return this.numNodes;
	}

	/**
	 * Retrieve an item at a specific index.
	 * 
	 * @param idx The index the item is stored at
	 * @return The item at idx
	 */
	public ListType get(int idx) {
		// Q's to discuss:
		// - What does the cnt variable do?
		// - Why does the for-loop go until tmp!=null instead of tmp.next!=null?
		// - What condition leads me to end up at the return null?
		int cnt = 0;
		for (Node<ListType> tmp = this.head; tmp != null; tmp = tmp.next) {
			if (idx == cnt) {
				return tmp.getData();
			}
			cnt++;
		}
		throw new IndexOutOfBoundsException("Index " + idx + " out of bounds for length " + this.size());
	}

	/**
	 * Determines whether or not an item is in the list.
	 * 
	 * O(N)
	 * 
	 * @param item The item to search form
	 * @return True if the item is in the list, False otherwise.
	 */
	/*
	 * public boolean contains(ListType item) { // Q's to discuss: // - Why is there
	 * no `else {return false;}` statement with the if? // - What happens when item
	 * doesn't exist? // - What happens when the list is empty? for(Node<ListType>
	 * tmp = this.head; tmp != null; tmp = tmp.next) { if
	 * (tmp.getData().equals(item)) { return true; } } return false; }
	 */
	public boolean contains(ListType item) {
		return indexOf(item) != -1;
	}

	/**
	 * Return the index of the first instance of item in the list
	 * 
	 * @param item The item to search for
	 * @return The index of item, or -1 if it is not in the list
	 */
	public int indexOf(ListType item) {
		// Q's to discuss:
		// - What will be the difference between this and contains?
		int cnt = 0;
		for (Node<ListType> tmp = this.head; tmp != null; tmp = tmp.next) {
			if (tmp.getData().equals(item)) {
				return cnt;
			}
			cnt++;
		}
		return -1;
	}

	/**
	 * Remove the first instance of item from the list.
	 * 
	 * O(N)
	 * 
	 * @param item The item to be removed
	 * @return True if the item was removed and false otherwise
	 */
	public boolean remove(ListType item) {
		// Q's to discuss:
		// - What situation does the first if check for?
		// - What situation does the second if check for?
		// - Why does the if inside the for-loop check tmp.next.getData() instead of
		// tmp.getData()?
		// - What instance variable have we forgotten to update? Where should we do it?
		if (this.head == null) {
			return false;
		}

		if (this.head.getData().equals(item)) {
			head = head.next;
			this.numNodes--;
			return true;
		}

		for (Node<ListType> tmp = this.head; tmp.next != null; tmp = tmp.next) {
			if (tmp.next.getData().equals(item)) {
				tmp.next = tmp.next.next;
				this.numNodes--;
				return true;
			}
		}
		return false;
	}

	/**
	 * Remove all instances of item from the list
	 * 
	 * O(N^2), but a better solution exists
	 * 
	 * @param item The item to completely remove
	 */
	public void removeAll(ListType item) {
		while (this.remove(item) == true)
			;
	}

	public String toString() {
		// for(Node<Integer> t = head; t != null; t = t.next)
		String ret = "";

		for (Node<ListType> t = head; t != null; t = t.next) {
			ret += t + " -> ";
		}
		ret += "<null>";

		return ret;
	}

	private void printListRecursively(Node node) {
		// Need base case
		if (node == null) {
			System.out.print("<null>");
			return;
		}

		// Recursive case:
		System.out.print(" " + node.getData() + " ");
		printListRecursively(node.next);
	}

	private void otherPrintListRecursively(Node node) {
		// Need base case
		if (node == null) {
			System.out.print("<null>");
			return;
		}

		// Recursive case:
		// These two lines are swapped when compared to the other recursive method
		otherPrintListRecursively(node.next);
		System.out.print(" " + node.getData() + " ");
	}

	/**
	 * Some function to print the list
	 */
	public void printList() {
		printListRecursively(this.head);
		System.out.println();
	}

	/**
	 * Some function to print the list
	 */
	public void otherPrintList() {
		otherPrintListRecursively(this.head);
		System.out.println();
	}
}
