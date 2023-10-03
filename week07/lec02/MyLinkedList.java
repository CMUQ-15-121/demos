
public class MyLinkedList<ListType> {
	private Node<ListType> head;
	private int numItems;

	public MyLinkedList() {
		this.head = null;
		this.numItems = 0;
	}

	/**
	 * Return whether or not the list is empty.
	 * 
	 * @return true or false, depending on whether the list is empty.
	 */
	public boolean isEmpty() {
		return this.head == null;
		// if (this.head == null) {
		// return true;
		// } else {
		// return false;
		// }
	}

	/*
	 * O(1)
	 */
	public void addToHead(ListType item) {
		Node<ListType> newNode = new Node<ListType>(item);
		this.numItems++;
		newNode.next = head;
		head = newNode;
	}

	/**
	 * Add a new item to the end of the linked list
	 * 
	 * @param item The item to add to the list
	 */
	public void add(ListType item) {

		Node<ListType> newNode = new Node<ListType>(item);
		this.numItems++;
		newNode.next = null;

		// If the list is empty, the newNode is the head
		if (this.isEmpty()) {
			this.head = newNode;
			return;
		}

		// If the list is not empty, the newNode needs to go to the end
		Node<ListType> tmp = this.head;
		while (tmp.next != null) {
			tmp = tmp.next;
		}

		// Right here, tmp points to the last node in the linked list.
		tmp.next = newNode;

	}

	public int sizeTooSlow() {
		int cnt = 0;
		for (Node<ListType> t = head; t != null; t = t.next) {
			cnt++;
		}
		return cnt;
	}

	public int size() {
		return this.numItems;
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
		// - What condition leads me to throw the exception?
		// - Why do I return tmp.getValue() instead of tmp?
		int cnt = 0;
		for (Node<ListType> tmp = this.head; tmp != null; tmp = tmp.next) {
			if (idx == cnt) {
				return tmp.getValue();
			}
			cnt++;
		}
		throw new IndexOutOfBoundsException("Index: " + idx + ", Size: " + this.size());
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
		// - Why does the if inside the for-loop check tmp.next.getValue() instead of
		// tmp.getValue()?
		// - What instance variable have we forgotten to update? Where should we do it?
		if (this.head == null) {
			return false;
		}

		if (this.head.getValue().equals(item)) {
			head = head.next;
			return true;
		}

		for (Node<ListType> tmp = this.head; tmp.next != null; tmp = tmp.next) {
			if (tmp.next.getValue().equals(item)) {
				tmp.next = tmp.next.next;
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

	/**
	 * Print the list to System.out
	 */
//	public void printList() {
//		for (Node<ListType> t = head; t != null; t = t.next) {
//			System.out.print(t + " -> ");
//		}
//		System.out.println("<null>");
//	}

	public void printList() {
		printList(this.head);
	}

	private void printList(Node<ListType> node) {
		// base case
		if (node == null) {
			System.out.println("<null>");
		} else {
			// recursive case
			System.out.print(node + " --> ");
			printList(node.next);
		}
	}
	
	/**
	 * Determines whether or not an item is in the list.
	 * 
	 * O(N)
	 * 
	 * @param item The item to search form
	 * @return True if the item is in the list, False otherwise.
	 */
	public boolean contains(ListType item) {
		return contains(this.head, item);
	}
	
	private boolean contains(Node<ListType> node, ListType item) {
		boolean ret;
		//System.out.println("Node[" + node + "], " + item);
		if (node == null) {
			ret = false;
		} else if (node.getValue().equals(item)) {
			ret = true;
		} else {
			ret = contains(node.next, item);
		}
		//System.out.println("returning " + ret);
		return ret;
	}
	
	public int indexOf(ListType item) {
		return indexOf(head, item);
	}
	
	/**
	 * Return the index of the first instance of item in the list
	 * 
	 * @param item The item to search for
	 * @return The index of item, or -1 if it is not in the list
	 */
	private int indexOf(Node<ListType> node, ListType item) {
		int ret;
		//System.out.println("Node[" + node + "], " + item);
		if (node == null) {
			ret = -1;
		} else if (node.getValue().equals(item)) {
			ret = 0;
		} else {
			ret = indexOf(node.next, item);
			if (ret != -1) {
				ret += 1;
			}
		}
		//System.out.println("returning " + ret);
		return ret;
	}

	public String toString() {
		String ret = "";
		for (Node<ListType> t = head; t != null; t = t.next) {
			ret += t;
			ret += " -> ";
		}
		ret += "<null>";
		return ret;
	}
}
