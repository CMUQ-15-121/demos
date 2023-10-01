
public class MyLinkedList<ListType> implements MyList<ListType> {
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
		while(tmp.next != null) {
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
		for(Node<ListType> tmp = this.head; tmp != null; tmp = tmp.next) {
			if (idx == cnt) {
				return tmp.getValue();
			}
			cnt++;		
		}
		throw new IndexOutOfBoundsException("Index: "+idx+", Size: "+this.size());
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
			if (tmp.getValue().equals(item)) {
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
			if (tmp.getValue().equals(item)) {
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
		// - Why does the if inside the for-loop check tmp.next.getValue() instead of tmp.getValue()?
		// - What instance variable have we forgotten to update?  Where should we do it?
		if (this.head == null) {
			return false;
		}
		
		if (this.head.getValue().equals(item)) {
			head = head.next;
			return true;
		}
		
		for(Node<ListType> tmp = this.head; tmp.next != null; tmp = tmp.next) {
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
		while(this.remove(item) == true);
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
