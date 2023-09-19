
public class MyLinkedList<ListType> {
	private Node<ListType> head;
	
	public MyLinkedList() {
		this.head = null;
	}
	
	public void addToHead(ListType item) {
		Node<ListType> newNode = new Node<ListType>(item);
		newNode.next = head;
		head = newNode;
	}
	
	public String toString() {
		String ret = "";
		for(Node<ListType> t = head; t != null; t = t.next) {
			ret += t;
			ret += " -> ";
		}
		ret += "<null>";
		return ret;
	}
}
