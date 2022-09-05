
public class Node<NodeType> {
	private NodeType data;
	public Node<NodeType> next;

	public Node(NodeType data) {
		this.data = data;
		this.next = null;
	}

	public NodeType getData() {
		return data;
	}

	public String toString() {
		return "" + data;
	}
}