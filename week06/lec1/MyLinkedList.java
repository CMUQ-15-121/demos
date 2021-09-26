
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
	 * @param idx The index the item is stored at
	 * @return The item at idx
	 */
	public ListType get(int idx) {
		int cnt = 0;
		Node<ListType> tmp = this.head;
		while(tmp != null) {
			if (idx == cnt) {
				return tmp.getData();
			}
			tmp = tmp.next;
			cnt++;
		}
		// Why would I get here?
		return null;
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
