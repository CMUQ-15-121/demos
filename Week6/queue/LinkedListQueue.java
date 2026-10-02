package queue;

import Lect1.MyLinkedList;

public class LinkedListQueue<DataType> implements Queue<DataType> {

	
	private MyLinkedList<DataType> items;

	public LinkedListQueue() {
		this.items= new MyLinkedList<DataType>();
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.items.size()==0;
	}

	@Override
	public void enqueue(DataType value) {
		// TODO Auto-generated method stub
		this.items.add(value);
		
	}

	@Override
	public DataType dequeue() {
		// TODO Auto-generated method stub
		if(this.isEmpty())
			return null;
		
		DataType item = this.items.get(0);
		this.items.remove(item);
		
		return item;
	}

	@Override
	public DataType peek() {
		// TODO Auto-generated method stub
		
		if(this.isEmpty())
			return null;
		
		return this.items.get(0);
	}
	
	

}
