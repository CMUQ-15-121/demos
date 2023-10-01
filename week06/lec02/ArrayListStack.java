import java.util.ArrayList;

public class ArrayListStack<DataType> implements Stack<DataType> {

	private ArrayList<DataType> items;

	public ArrayListStack() {
		this.items = new ArrayList<DataType>();
	}

	@Override
	public boolean isEmpty() {
		return this.items.isEmpty();
	}

	@Override
	public void push(DataType value) {
		this.items.add(value);
	}

	@Override
	public DataType pop() {
		DataType item = this.items.get(this.items.size() - 1);
		this.items.remove(this.items.size() - 1);
		return item;
	}

	@Override
	public DataType peek() {
		return this.items.get(this.items.size() - 1);
	}
	
	public static void main(String[] args) {
		Stack<String> s = new ArrayListStack<String>();
		
		s.push("A");
		s.push("B");
		s.push("C");
		while(s.isEmpty() == false) {
			System.out.println(s.pop());
		}
	}

}
