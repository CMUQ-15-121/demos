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
		return false;
	}

	@Override
	public void enqueue(DataType value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DataType dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataType peek() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
