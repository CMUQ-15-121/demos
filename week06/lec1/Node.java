
public class Node<NodeType> {

	private NodeType data;
	public Node<NodeType> next;

	public Node(NodeType data) {
		this.data = data;
	}

	public String toString() {
		return data.toString();
	}
	
	public NodeType getData() {
		return this.data;
	}
}
