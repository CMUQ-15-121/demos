
public class MyLinkedList<ListType> {
	private Node<ListType> head;

	// Methods I want:
	// add
	// remove
	// contains
	// indexOf
	// get
	// size

	public MyLinkedList() {
		this.head = null;
	}

	public void addToHead(ListType item) {
		Node<ListType> tmp = new Node<ListType>(item);
		tmp.next = head;
		head = tmp;
	}
	
	/**
	 * Add item to the end of the list
	 * 
	 * @param item
	 */
	public void add(ListType item) {
		// Step 1: Find a pointer to the last node
		//for(Node<ListType> t = head; t != null; t = t.next)
		//for(Node<ListType> tmp = head; tmp.next != null; tmp = tmp.next);
		Node<ListType> tmp = head;
		while(tmp.next != null) {
			tmp = tmp.next;
		}
		
		// Step 2: Add new node after last node
		tmp.next = new Node<ListType>(item);
	}
	
	public String toString() {
		// for(Node<Integer> t = head; t != null; t = t.next)
		String ret = "";
		
		for(Node<ListType> t = head; t != null; t = t.next) {
			ret += t + " -> ";
		}
		ret += "<null>";
		
		return ret;
	}
}
