package stack;

import java.util.ArrayList;

public class ArrayListStack<DataType> implements Stack<DataType>{

	private ArrayList<DataType> items;
	
	public ArrayListStack() {
		
		items = new ArrayList<DataType>();
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.items.size()==0;
	}

	@Override
	public void push(DataType value) {
		// TODO Auto-generated method stub
		this.items.add(value);
		
	}

	@Override
	public DataType pop() {
		// TODO Auto-generated method stub
		return this.items.removeLast();
	}

	@Override
	public DataType peek() {
		// TODO Auto-generated method stub
		return this.items.getLast();
	}

}
