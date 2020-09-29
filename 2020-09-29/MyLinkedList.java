
public class MyLinkedList<Type> {
	private LinkedListNode<Type> head;
	private int numNodes = 0;

	// O(1)
	public MyLinkedList() {
		head = null;
	}

	/**
	 * Add an item to the beginning of the list
	 * 
	 * This is O(1)
	 * 
	 * @param data The item to add.
	 */
	public void addHead(Type data) {
		LinkedListNode<Type> tmp = new LinkedListNode(data);
		tmp.next = head;
		head = tmp;
		this.numNodes++;
	}

	/**
	 * Determine if the list is empty.
	 * 
	 * This is O(1)
	 * 
	 * @return true if the list is empty and false otherwise
	 */
	public boolean isEmpty() {
		return (head == null);
	}

	/**
	 * Add an item to the end of the list
	 * 
	 * This is O(N)
	 * 
	 * @param data The item to add.
	 */
	public void add(Type data) {
		if (this.isEmpty()) {
			this.addHead(data);
			return;
		}

		LinkedListNode<Type> tmp = this.head;
		while (tmp.next != null) {
			tmp = tmp.next;
		}

		tmp.next = new LinkedListNode<Type>(data);
		this.numNodes++;
	}

//	/**
//	 * Return the number of items in the list
//	 * 
//	 * This is O(N)
//	 * 
//	 * @return the number of items in the list
//	 */
//	public int size() {
//		int numNodes = 0;
//		for(LinkedListNode<Type> tmp = this.head; tmp != null; tmp = tmp.next) {
//			numNodes++;
//		}
//		return numNodes;
//	}

	/**
	 * Return the number of items in the list
	 * 
	 * This is O(1)
	 * 
	 * @return the number of items in the list
	 */
	public int size() {
		return this.numNodes;
	}

	// O(N)
	public String toString() {
		String ret = "";
		for (LinkedListNode<Type> tmp = this.head; tmp != null; tmp = tmp.next) {
			ret += tmp.getValue() + " -> ";
		}
		ret += "null";
		return ret;
	}

	/**
	 * Determines whether or not an item is in the list
	 * 
	 * This is O(N)
	 * 
	 * @param data The item to search for
	 * @return true if the item is in the list, false otherwise
	 */
	public boolean contains(Type data) {
		for (LinkedListNode<Type> tmp = this.head; tmp != null; tmp = tmp.next) {
			if (tmp.getValue().equals(data)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Return the index of the first instance of data in the list.
	 * 
	 * This is O(N)
	 * 
	 * @param data The item to find
	 * @return The first index of the the item in the list, or -1 if the item is not
	 *         found.
	 */
	public int indexOf(Type data) {
		int i = 0;
		for (LinkedListNode<Type> tmp = this.head; tmp != null; tmp = tmp.next) {
			if (tmp.getValue().equals(data)) {
				return i;
			}
			i++;
		}
		return -1;
	}

	/**
	 * Remove an item from the LinkedList. This should remove only the first
	 * instance of the item.
	 * 
	 * This is O(N)
	 * 
	 * @param value The item to be removed
	 * @return true if an item is removed and false otherwise
	 */
	public boolean remove(Type value) {
		if (head == null) {
			return false;
		} else if (head.getValue().equals(value)) {
			head = head.next;
			this.numNodes--;
			return true;
		}

		for (LinkedListNode<Type> tmp = this.head; tmp.next != null; tmp = tmp.next) {
			if (tmp.next.getValue().equals(value)) {
				// Now, tmp is the one before the item I want to remove
				tmp.next = tmp.next.next;
				this.numNodes--;
				return true;
			}
		}
		return false;
	}

	/**
	 * Like remove, but removes all instance of the item instead of just the first
	 * one.
	 * 
	 * This is O(N^2)
	 * 
	 * @param value The item to remove
	 */
	public void removeAll(Type value) {
		while(this.remove(value) == true);
	}

	public static void main(String[] args) {
		MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
		System.out.println(myList);
		System.out.println(myList.size());
		myList.addHead(10);
		System.out.println(myList);
		myList.addHead(20);
		System.out.println(myList);
		myList.add(50);
		System.out.println(myList);
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.addHead(-5);
		System.out.println(myList);
		System.out.println(myList.size());
		System.out.println(myList.contains(5));
		System.out.println(myList.contains(10));
		System.out.println(myList.contains(-1));
		System.out.println(myList.contains(-5));
		System.out.println(myList.contains(3));

		System.out.println(myList.indexOf(-5));
		System.out.println(myList.indexOf(3));
		System.out.println(myList.indexOf(50));
		System.out.println(myList.indexOf(505));

		System.out.println(myList);
		boolean ret = myList.remove(50);
		System.out.println(ret);
		System.out.println(myList);
		System.out.println(myList.size());
		ret = myList.remove(505);
		System.out.println(ret);
		System.out.println(myList);
		System.out.println(myList.size());
		ret = myList.remove(3);
		System.out.println(ret);
		System.out.println(myList);
		System.out.println(myList.size());
		ret = myList.remove(-5);
		System.out.println(ret);
		System.out.println(myList);
		System.out.println(myList.size());
		myList.remove(2);
		myList.remove(10);
		myList.remove(1);
		System.out.println(myList);
		System.out.println(myList.size());
		ret = myList.remove(20);
		System.out.println(ret);
		System.out.println(myList);
		System.out.println(myList.size());
		ret = myList.remove(20);
		System.out.println(ret);
		System.out.println(myList);
		System.out.println(myList.size());
		
		myList.add(5);
		myList.add(10);
		myList.add(20);
		myList.add(30);
		myList.add(5);
		myList.add(10);
		myList.add(20);
		myList.add(30);
		myList.add(5);
		myList.add(10);
		myList.add(20);
		myList.add(30);
		System.out.println(myList);
		myList.removeAll(5);
		System.out.println(myList);

	}
}
