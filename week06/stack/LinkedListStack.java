package stack;
import list.MyLinkedList;


public class LinkedListStack<DataType> implements Stack<DataType> {
	
	MyLinkedList<DataType> items;

	public LinkedListStack() {
		items = new MyLinkedList<DataType>();
	}

	/**
	 * Return true if the stack is empty, false otherwise
	 * 
	 * Complexity? O(1)
	 * 
	 */
	@Override
	public boolean isEmpty() {
		return this.items.size()==0;
	}

	/**
	 * Push to the head of the list.
	 * 
	 * Complexity? O(1)
	 *  
	 */
	@Override
	public void push(DataType value) {
		this.items.addToHead(value);
	}

	/**
	 * Pop the head of the list.
	 * 
	 * Complexity?  O(1)
	 *  
	 */
	@Override
	public DataType pop() {
		if (this.isEmpty()) {
			return null;
		}
		DataType ret = this.items.get(0);
		this.items.remove(ret);
		return ret;
		
		//another way
		//return this.items.removeHead();
		
	}

	/**
	 * Return the head of the list, but don't remove it.
	 * 
	 * Complexity? O(1)
	 *  
	 */
	@Override
	public DataType peek() {
		if(this.isEmpty()) {
			return null;
		}
		
		return this.items.get(0);
		
	}


}