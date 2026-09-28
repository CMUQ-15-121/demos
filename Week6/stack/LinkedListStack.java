package stack;

import Lect1.MyLinkedList;
import Lect1.Node;

public class LinkedListStack<DataType> implements Stack<DataType> {

	private MyLinkedList<DataType> items;
	
	public LinkedListStack() {
		items = new MyLinkedList<DataType>();
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.items.size()==0;
	}

	@Override
	public void push(DataType value) {
		// TODO Auto-generated method stub
		this.items.addToHead(value);
		
	}

	@Override
	public DataType pop() {
		// TODO Auto-generated method stub
		
		if(this.isEmpty())
			return null;
		
		DataType v = this.items.get(0);
		this.items.remove(v);
			
		return v;
	}

	@Override
	public DataType peek() {
		// TODO Auto-generated method stub
		if(this.isEmpty())
			return null;
		
		DataType v = this.items.get(0);
			
		return v;	
		}

}
