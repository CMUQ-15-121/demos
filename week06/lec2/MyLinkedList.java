
public class MyLinkedList<ListType> {
	private Node<ListType> head;
	private int numNodes;
	
	public MyLinkedList() {
		this.head = null;
		this.numNodes = 0;
	}
	
	// O(1)
	public void addHead(ListType item) {
		Node<ListType> newNode = new Node<ListType>(item);
		newNode.next = this.head;
		this.head = newNode;
		this.numNodes++;
	}
	
	// O(N)
	public void add(ListType item) {
		if (this.head == null) {
			addHead(item);
			return;
		}
		
		// Find the tail of the list
		Node<ListType> tmp = this.head;
		while(tmp.next != null) {
			tmp = tmp.next;
		}
		
		// Add the new node to the tail
		tmp.next = new Node<ListType>(item);
		
		this.numNodes++;
	}
	
	// O(1)
	public boolean isEmpty() {
		return this.head == null;
	}
	
	// O(N)
	public int sizeTooSlow() {
		int cnt = 0;
		Node<ListType> tmp = this.head;
		while(tmp != null) {
			tmp = tmp.next;
			cnt++;
		}
		return cnt;
	}
	
	// O(1)
	public int size() {
		return this.numNodes;
	}
	
	/** 
	 * Retrieve an item at a specific index.
	 * 
	 * This is O(N)
	 * 
	 * @param idx The index the item is stored at
	 * @return The item at idx
	 */
	public ListType get(int idx) {
		if (idx >= this.numNodes) {
			throw new IndexOutOfBoundsException("Requested index " + idx + ", but size is " + this.numNodes);
		}
		
		int cnt = 0;
		Node<ListType> tmp = this.head;
		while(tmp != null) {
			if (idx == cnt) {
				return tmp.getData();
			}
			tmp = tmp.next;
			cnt++;
		}
		// This should be unreachable
		throw new IndexOutOfBoundsException("This should never happen. Contact the maintainer of this linked list.");
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
		return indexOf(item) != -1;
	}
	
	/**
	 * Return the index of the first instance of item in the list
	 * 
	 * @param item The item to search for
	 * @return The index of item, or -1 if it is not in the list
	 */
	public int indexOf(ListType item) {
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
	 * @param item The item to be removed
	 * @return True if the item was removed and false otherwise
	 */
	public boolean remove(ListType item) {
		if (this.head == null) {
			return false;
		}
		
		if (this.head.getData().equals(item)) {
			head = head.next;
			this.numNodes--;
			return true;
		}
		
		for(Node<ListType> tmp = this.head; tmp.next != null; tmp = tmp.next) {
			if (tmp.next.getData().equals(item)) {
				// Found it, now remove it
				tmp.next = tmp.next.next;
				this.numNodes--;
				return true;
			}
		}	
		return false;
	}
	
	public String toString() {
		String ret = "";
		for(Node<ListType> tmp = this.head; tmp != null; tmp = tmp.next) {
			ret += tmp + " --> ";
		}
		ret += "<null>";
		return ret;
	}
}
