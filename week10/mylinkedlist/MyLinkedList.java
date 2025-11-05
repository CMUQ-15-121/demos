package mylinkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<ListType> implements TheList<ListType>, Iterable<ListType>{
	private Node<ListType> head;
	private int size;
	
	public MyLinkedList() {
		this.head = null;
		this.size = 0;
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
		this.size++;
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
			//this.size++; // (Not needed because addToHead does it)
			return;
		}
		
		// Step 1: Find the end of the list
		Node<ListType> t = this.head;
		while(t.next != null) {
			t = t.next;
		}
		
		// Step 2: Add my new item to the end
		t.next = new Node<ListType>(item);
		this.size++;
	}
	
	/**
	 * Return the number of items in the list
	 * 
	 * @return
	 */
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
			ret += tmp.toString() + " -> ";
		}
		ret += "<null>";
		ret += " " + this.size();
		return ret;
	}
	
	/** 
	 * Retrieve an item at a specific index.
	 * 
	 * O(N)
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
			//System.out.println("Checking index " + cnt);
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
		return this.indexOf(item) != -1;
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
		if (this.isEmpty()) {
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
	 * Remove all instances of item from the list.
	 * 
	 * This solution is O(N^2)
	 * 
	 * @param item The item to remove
	 */
	public void removeAll(ListType item) {
		while(this.remove(item));
	}

	
	private class LinkedListIterator implements Iterator<ListType>{

		//like cursor pointing at the item to retrieve next
		Node<ListType> cur = head;
		
		public boolean hasNext() {
			// if cur points at a valid position
			return cur != null;
		}

		public ListType next() {
			//should return the data and update the cursor to point at next item
			
			if(hasNext()) {
				ListType v = cur.getData();
				cur = cur.next;
				
				return v;
			}else {
				throw new NoSuchElementException();
			}
		}
		
		
	}
	
	public Iterator<ListType> iterator() {
		// TODO Auto-generated method stub
		return new LinkedListIterator();
	}
	

	
	
	
	
}
