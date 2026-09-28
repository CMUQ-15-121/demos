package queue;

import java.util.ArrayList;

public class ArrayListQueue<DataType> implements Queue<DataType> {

	private ArrayList<DataType> items;

	public ArrayListQueue() {
		this.items= new ArrayList<DataType>();
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.items.isEmpty();
	}

	@Override
	public void enqueue(DataType value) {
		// TODO Auto-generated method stub
		
		this.items.add(value);
		
	}

	@Override
	public DataType dequeue() {
		// TODO Auto-generated method stub
		
		return this.items.removeFirst();
	}

	@Override
	public DataType peek() {
		// TODO Auto-generated method stub
		return this.items.getFirst();
	}

}
