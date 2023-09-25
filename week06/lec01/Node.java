public class Node<NodeType> {
	private NodeType value;
	public Node<NodeType> next;
	
	public Node(NodeType value) {
		this.value = value;
		this.next = null;
	}
	
	public NodeType getValue() {
		return this.value;
	}
	
	public String toString() {
		return ""+value;
	}
}
