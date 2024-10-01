import java.util.ArrayList;

public class ArrayListStack<DataType> implements Stack<DataType> {
	private ArrayList<DataType> items;

	public ArrayListStack() {
		this.items = new ArrayList<DataType>();
	}

	@Override
	public boolean isEmpty() {
		return this.items.size() == 0;
	}

	/**
	 * Push to the end of the list.
	 * 
	 * This is O(1) if the list has space, O(N) if it doesn't.
	 */
	@Override
	public void push(DataType value) {
		this.items.add(value);
	}

	/**
	 * Pop from the end of the list.
	 * 
	 * This is always O(1)
	 */
	@Override
	public DataType pop() {
		if (this.isEmpty()) {
			return null;
		}
		DataType ret = this.items.get(this.items.size() - 1);
		this.items.remove(this.items.size() - 1);
		return ret;
	}

	/**
	 * Return a pointer to the end of the list, but don't remove it.
	 * 
	 * O(1)
	 */
	@Override
	public DataType peek() {
		if (this.isEmpty()) {
			return null;
		}
		DataType ret = this.items.get(this.items.size() - 1);
		return ret;
	}

	public static void main(String[] args) {
		ArrayListStack<String> myStack = new ArrayListStack<String>();
		myStack.push("A");
		myStack.push("B");
		myStack.push("C");

		while (!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}

	}

}
