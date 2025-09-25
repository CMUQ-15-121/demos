
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

	
	public String toString() {
		String ret = "";
		for(Node<ListType> tmp = this.head; tmp != null; tmp = tmp.next) {
			ret += " -> " + tmp.getData();
		}
		return ret;
	}

}
