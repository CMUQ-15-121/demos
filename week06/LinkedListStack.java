import mylinkedlist.MyLinkedList;

public class LinkedListStack<DataType> implements Stack<DataType> {
	private MyLinkedList<DataType> items;

	public LinkedListStack() {
		this.items = new MyLinkedList<DataType>();
	}

	@Override
	public boolean isEmpty() {
		return this.items.isEmpty();
	}

	/**
	 * O(1)
	 */
	@Override
	public void push(DataType value) {
		this.items.addToHead(value);
	}

	/**
	 * O(1)
	 */
	@Override
	public DataType pop() {
		if (this.items.isEmpty()) {
			return null;
		}
		DataType ret = this.items.get(0);
		this.items.remove(ret);
		return ret;
	}

	/**
	 * O(1)
	 */
	@Override
	public DataType peek() {
		if (this.items.isEmpty()) {
			return null;
		}
		return this.items.get(0);
	}

}
