public class Node<NodeType> {
	private NodeType data;
	public Node next;

	public Node(NodeType data) {
		this.data = data;
		this.next = null;
	}
	
	public String toString() {
		return data.toString();
	}

}
