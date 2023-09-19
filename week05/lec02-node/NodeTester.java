
public class NodeTester {

	public static void main(String[] args) {
		// Create a simple two node list.  10 -> 20
		Node head = new Node(10);
		Node second = new Node(20);
		head.next = second;
		
		// Add 15 to the end, producing 10 -> 20 -> 15
		second.next = new Node(15);
		
		// Remove 20, producing 10 -> 15
		head.next = second.next;
		
		// Print out the list
		for(Node t = head; t != null; t = t.next) {
			System.out.println(t);
		}
	}

}
