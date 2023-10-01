
public class LinkedListStack<DataType> implements Stack<DataType> {
	private MyLinkedList<DataType> items;

	public LinkedListStack() {
		this.items = new MyLinkedList<DataType>();
	}

	@Override
	public boolean isEmpty() {
		return this.items.isEmpty();
	}

	@Override
	public void push(DataType value) {
		this.items.addToHead(value);
	}

	@Override
	public DataType pop() {
		DataType item = this.items.get(0);
		this.items.remove(item);
		return item;
	}

	@Override
	public DataType peek() {
		return this.items.get(0);
	}

	public static void main(String[] args) {
		Stack<String> s = new LinkedListStack<String>();

		s.push("A");
		s.push("B");
		s.push("C");
		while (s.isEmpty() == false) {
			System.out.println(s.pop());
		}
	}
}
