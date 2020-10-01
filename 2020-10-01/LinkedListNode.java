
public class LinkedListNode<Type> {
	private Type value;
	public LinkedListNode<Type> next;
	
	public LinkedListNode(Type value) {
		this.value = value;
	}
	
	public Type getValue() {
		return this.value;
	}
	
	public void setValue(Type v) {
		this.value = v;
	}
}
