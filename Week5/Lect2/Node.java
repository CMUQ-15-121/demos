package Lect2;


public class Node {

	//Q) why is data private and next public??
	private int data;
	public Node next;
	
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	public String toString() {
		return ""+data;
	}
}
