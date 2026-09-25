package lect3;

public class Node<NodeType>{

	
	//Q) why is data private and next public??
	private NodeType data;
	public Node<NodeType> next;
	
	
	public Node(NodeType data) {
		this.data = data;
		this.next = null;
	}
	
	public String toString() {		
		return ""+this.data;
	}
	
	
}
