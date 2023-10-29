import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<ListType> implements Iterable<ListType> {
	private Node head;
	private int numItems;

	private class Node {
		private ListType value;
		private Node next;
		
		public Node(ListType value) {
			this.value = value;
			this.next = null;
		}
		
		public String toString() {
			return ""+value;
		}
	}
	
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
	}

	/*
	 * O(1)
	 */
	public void addToHead(ListType item) {
		Node newNode = new Node(item);
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

		Node newNode = new Node(item);
		this.numItems++;
		newNode.next = null;

		// If the list is empty, the newNode is the head
		if (this.isEmpty()) {
			this.head = newNode;
			return;
		}

		// If the list is not empty, the newNode needs to go to the end
		Node tmp = this.head;
		while (tmp.next != null) {
			tmp = tmp.next;
		}

		// Right here, tmp points to the last node in the linked list.
		tmp.next = newNode;

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
		int cnt = 0;
		for (Node tmp = this.head; tmp != null; tmp = tmp.next) {
			if (idx == cnt) {
				return tmp.value;
			}
			cnt++;
		}
		throw new IndexOutOfBoundsException("Index: " + idx + ", Size: " + this.size());
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
		int cnt = 0;
		for (Node tmp = this.head; tmp != null; tmp = tmp.next) {
			if (tmp.value.equals(item)) {
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
		if (this.head == null) {
			return false;
		}

		if (this.head.value.equals(item)) {
			head = head.next;
			this.numItems--;
			return true;
		}

		for (Node tmp = this.head; tmp.next != null; tmp = tmp.next) {
			if (tmp.next.value.equals(item)) {
				tmp.next = tmp.next.next;
				this.numItems--;
				return true;
			}
		}
		return false;
	}

	public String toString() {
		String ret = "";
		for (Node t = head; t != null; t = t.next) {
			ret += t;
			ret += " -> ";
		}
		ret += "<null>";
		return ret;
	}

	@Override
	public Iterator<ListType> iterator() {
		return new LinkedListIterator();
	}
	
	private class LinkedListIterator implements Iterator<ListType> {
		// cur points to the next node to be returned
		private Node cur = head;
		
		@Override
		public boolean hasNext() {
			// How do I know if there are any items left?
			return cur != null;
		}

		@Override
		public ListType next() {
			if (hasNext()) {
				ListType ret = cur.value;
				cur = cur.next;
				return ret;
			} else {
				throw new NoSuchElementException();
			}
		}
		
	}
	
	public static void main(String[] args) {
		MyLinkedList<String> sample = new MyLinkedList<String>();
		sample.add("Hi");
		sample.add("There");
		sample.add("Me");
		System.out.println(sample);
		
		for(String s: sample) {
			System.out.println(s);
		}
		
//		Iterator<String> it = sample.iterator();
//		while(it.hasNext()) {
//			String e = it.next();
//			System.out.println(e);
//		}
	}
}
