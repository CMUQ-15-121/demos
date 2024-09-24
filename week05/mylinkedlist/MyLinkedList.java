package mylinkedlist;

public class MyLinkedList<ListType> {
	private Node<ListType> head;
	
	public MyLinkedList() {
		this.head = null;
	}
	
	/**
	 * Add to the head of this list.
	 * 
	 * O(1)
	 * 
	 * @param item
	 */
	public void addToHead(ListType item) {
		Node<ListType> tmp = new Node<ListType>(item);
		tmp.next = this.head;
		this.head = tmp;
	}
	
	public boolean isEmpty() {
		return this.head == null;
	}
	
	/**
	 * Add an item to the end of the list
	 * 
	 * O(N)
	 * 
	 * @param item
	 */
	public void add(ListType item) {
		// Step 0: Empty list
		if (this.isEmpty()) {
			this.addToHead(item);
			return;
		}
		
		// Step 1: Find the end of the list
		Node<ListType> t = this.head;
		while(t.next != null) {
			t = t.next;
		}
		
		// Step 2: Add my new item to the end
		t.next = new Node<ListType>(item);
	}
	
	/**
	 * Return the number of items in the list
	 * 
	 * @return
	 */
	public int size() {
		int cnt = 0;
		for(Node<ListType> tmp = this.head; tmp != null; tmp = tmp.next) {
			cnt++;
		}
		return cnt;
	}
	
	public String toString() {
		String ret = "";
		for(Node<ListType> tmp = this.head; tmp != null; tmp = tmp.next) {
			ret += tmp.toString() + " -> ";
		}
		ret += "<null>";
		ret += " " + this.size();
		return ret;
	}
	
	public static void main(String[] args) {
		MyLinkedList<String> theList = new MyLinkedList<String>();
		System.out.println(theList);
		theList.addToHead("A");
		System.out.println(theList);
		theList.addToHead("B");
		System.out.println(theList);
		theList.addToHead("C");
		System.out.println(theList);
		
		theList = new MyLinkedList<String>();
		theList.add("E");
		System.out.println(theList);
		theList.add("D");
		System.out.println(theList);
		theList.add("F");
		System.out.println(theList);
	}

}
