import mylinkedlist.MyLinkedList;

public class LinkedListQueue<DataType> implements Queue<DataType> {
	private MyLinkedList<DataType> items;

	public LinkedListQueue() {
		this.items = new MyLinkedList<DataType>();
	}

	@Override
	public boolean isEmpty() {
		return this.items.isEmpty();
	}

	@Override
	public void enqueue(DataType value) {
		this.items.add(value);
	}

	@Override
	public DataType dequeue() {
		if (this.items.isEmpty()) {
			return null;
		}
		DataType ret = this.items.get(0);
		this.items.remove(ret);
		return ret;
	}

	@Override
	public DataType peek() {
		if (this.items.isEmpty()) {
			return null;
		}
		DataType ret = this.items.get(0);
		return ret;
	}

}
