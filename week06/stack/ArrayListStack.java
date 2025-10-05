package stack;

import java.util.ArrayList;

public class  ArrayListStack<DataType> implements Stack<DataType> {

	ArrayList<DataType> items;
	
	public ArrayListStack() {
		this.items = new ArrayList<DataType>();
	}

	/**
	 * Return true if the stack is empty, false otherwise
	 * 
	 * Complexity? O(1)
	 * 
	 */
	@Override
	public boolean isEmpty() {
		//return this.items.isEmpty();
		return this.items.size()==0;
	}

	/**
	 * Push to the end of the list.
	 * 
	 * Complexity? 
	 * - O(n): if the list is full
	 * - O(1): otherwise
	 *  
	 */
	@Override
	public void push(DataType value) {
		 this.items.add(value);
	}

	/**
	 * Pop from the end of the list.
	 * 
	 * Complexity? O(1)
	 *  
	 */
	@Override
	public DataType pop() {
		if(this.isEmpty())
			return null;
		
		return this.items.remove(this.items.size()-1);
		
		
	}

	/**
	 * Return the item at the end of the list, but don't remove it.
	 * 
	 * Complexity?  O(1)
	 *  
	 */
	@Override
	public DataType peek() {
		
		if(this.isEmpty())
			return null;
		
		return this.items.get(this.items.size()-1);
		
	}


}