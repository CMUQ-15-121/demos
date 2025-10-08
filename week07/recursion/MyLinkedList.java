
public class MyLinkedList<ListType> {
	private Node<ListType> head;
	private int size;

	public MyLinkedList() {
		this.head = null;
		this.size = 0;
	}

	// O(1)
	public void addToHead(ListType item) {
		Node<ListType> newNode = new Node<ListType>(item);
		newNode.next = this.head;
		this.head = newNode;
		this.size++;
	}

	// O(N)
//	public void add(ListType item) {
//		// Step 0: If the list is empty...
//		if (this.head == null) {
//			addToHead(item);
//			return;
//		}
//
//		// Step 1: Find a pointer to the last node
//		Node<ListType> tmp = this.head;
//		while (tmp.next != null) {
//			tmp = tmp.next;
//		}
//
//		// Step 2: Add new node after the last node
//		tmp.next = new Node<ListType>(item);
//		this.size++;
//	}
	
//	public void add(ListType item) {
//		if (this.head == null) {
//			this.head = new Node(item);
//			return;
//		}
//		add(this.head, item);
//	}
//	
//	private void add(Node node, ListType item) {
//		if (node.next == null) {
//			node.next = new Node(item);
//			return;
//		}
//		add(node.next, item);
//	}

	public void add(ListType item) {
		this.head = add(this.head, item);
	}
	
	private Node add(Node node, ListType item) {
		if (node == null) {
			return new Node(item);
		}
		node.next = add(node.next, item);
		return node;
	}
	
	
	public int size() {
		return this.size;
	}

	/**
	 * Retrieve an item at a specific index.
	 * 
	 * @param idx The index the item is stored at
	 * @return The item at idx
	 */
	public ListType get(int idx) {
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
//	public boolean contains(ListType item) {
//		int res = this.indexOf(item);
//		return res != -1;
//	}

	public boolean contains(ListType item) {
		return contains(this.head, item);
	}

	private boolean contains(Node node, ListType item) {
		// Base Case
		if (node == null) {
			return false;
		}

		// Recursive Case
		if (node.getData().equals(item)) {
			return true;
		} else {
			return contains(node.next, item);
		}
	}

	/**
	 * Return the index of the first instance of item in the list
	 * 
	 * @param item The item to search for
	 * @return The index of item, or -1 if it is not in the list
	 */
//	public int indexOf(ListType item) {
//		int cnt = 0;
//		for (Node<ListType> tmp = this.head; tmp != null; tmp = tmp.next) {
//			if (tmp.getData().equals(item)) {
//				return cnt;
//			}
//			cnt++;
//		}
//		return -1;
//	}

	public int indexOf(ListType item) {
		return indexOf(this.head, item, 0);
	}

	private int indexOf(Node node, ListType item, int idx) {
		// Base Case
		if (node == null) {
			return -1;
		}

		// Recursive Case
		if (node.getData().equals(item)) {
			return idx;
		} else {
			return indexOf(node.next, item, idx + 1);
		}
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
		if (this.head == null) {
			return false;
		}

		if (this.head.getData().equals(item)) {
			head = head.next;
			this.size--;
			return true;
		}

		for (Node<ListType> tmp = this.head; tmp.next != null; tmp = tmp.next) {
			if (tmp.next.getData().equals(item)) {
				tmp.next = tmp.next.next;
				this.size--;
				return true;
			}
		}
		return false;
	}

	/**
	 * Remove all instances of item from the list
	 * 
	 * O(N^2)
	 * 
	 * @param item The item to be removed.
	 */
	public void removeAll(ListType item) {
		while (this.remove(item))
			;
	}

	public String toString() {
		String ret = "";
		for (Node<ListType> tmp = this.head; tmp != null; tmp = tmp.next) {
			ret += " -> " + tmp.getData();
		}
		return ret;
	}

//	public void printList() {
//		for (Node<ListType> tmp = this.head; tmp != null; tmp = tmp.next) {
//			System.out.print(tmp.getData() + " -> ");
//		}
//		System.out.println("<null>");
//	}

	public void printList() {
		printList(this.head);
	}

	private void printList(Node node) {
		if (node == null) {
			System.out.println("<null>");
			return;
		}
		System.out.print(node.getData() + " -> ");
		printList(node.next);
	}

}
