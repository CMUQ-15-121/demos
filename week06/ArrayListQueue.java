import java.util.ArrayList;

public class ArrayListQueue<DataType> implements Queue<DataType> {
	private ArrayList<DataType> items;

	public ArrayListQueue() {
		this.items = new ArrayList<DataType>();
	}

	/**
	 * Determine if the queue is empty or not
	 */
	@Override
	public boolean isEmpty() {
		//return this.items.size() == 0;
		return this.items.isEmpty();
	}

	/**
	 * Add an item to the end of the queue
	 */
	@Override
	public void enqueue(DataType value) {
		this.items.add(0, value);
	}

	/**
	 * Remove the front of the queue and return it
	 */
	@Override
	public DataType dequeue() {
		if (this.items.isEmpty()) {
			return null;
		}
		DataType ret = this.items.get(this.items.size()-1);
		this.items.remove(this.items.size()-1);
		return ret;
	}

	/**
	 * Peek at the front of the queue.
	 */
	@Override
	public DataType peek() {
		if (this.items.isEmpty()) {
			return null;
		}
		DataType ret = this.items.get(this.items.size()-1);
		return ret;
	}

}
