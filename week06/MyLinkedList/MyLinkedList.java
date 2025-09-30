
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
	public void add(ListType item) {
		// Step 0: If the list is empty...
		if (this.head == null) {
			addToHead(item);
			return;
		}
		
		// Step 1: Find a pointer to the last node
		// Step 2: Add new node after the last node
//		for(Node<ListType> tmp = this.head; tmp != null; tmp = tmp.next) {
//			if (tmp.next == null) {
//				tmp.next = new Node<ListType>(item);
//				return;
//			}
//		}
		
		Node<ListType> tmp = this.head;
		while(tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = new Node<ListType>(item);
		this.size++;
	}
	
	// O(N)
	public int badSize() {
		int cnt = 0;
		for(Node<ListType> tmp = this.head; tmp != null; tmp = tmp.next) {
			cnt++;
		}
		return cnt;
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
		// Q's to discuss:
		// - What does the cnt variable do?
		// - Why does the for-loop go until tmp!=null instead of tmp.next!=null?
		// - What condition leads me to end up at the exception?
		int cnt = 0;
		for(Node<ListType> tmp = this.head; tmp != null; tmp = tmp.next) {
			if (idx == cnt) {
				return tmp.getData();
			}
			cnt++;		
		}
		throw new IndexOutOfBoundsException("Index "+idx+" out of bounds for length "+this.size());
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
	public boolean contains(ListType item) {
		// Q's to discuss:
		// - Why is there no `else {return false;}` statement with the if?
		// - What happens when item doesn't exist?
		// - What happens when the list is empty?
		for(Node<ListType> tmp = this.head; tmp != null; tmp = tmp.next) {
			if (tmp.getData().equals(item)) {
				return true;
			}
		}
		return false;	
	}
	*/
	
	public boolean contains(ListType item) {
		int res = this.indexOf(item);
		return res != -1;
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
		for(Node<ListType> tmp = this.head; tmp != null; tmp = tmp.next) {
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
		// - Why does the if inside the for-loop check tmp.next.getData() instead of tmp.getData()?
		// - What instance variable have we forgotten to update?  Where should we do it?
		if (this.head == null) {
			return false;
		}
		
		if (this.head.getData().equals(item)) {
			head = head.next;
			return true;
		}
		
		for(Node<ListType> tmp = this.head; tmp.next != null; tmp = tmp.next) {
			if (tmp.next.getData().equals(item)) {
				tmp.next = tmp.next.next;
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
		while(this.remove(item));
	}

	
	public String toString() {
		String ret = "";
		for(Node<ListType> tmp = this.head; tmp != null; tmp = tmp.next) {
			ret += " -> " + tmp.getData();
		}
		return ret;
	}

}
