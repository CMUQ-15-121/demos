
public class NodeTester {

	public static void main(String[] args) {
		// Create a simple two node list.  A -> B
		Node<String> head = new Node<String>("A");
		Node<String> second = new Node<String>("B");
		head.next = second;
		
		// Add 15 to the end, producing A -> B -> C
		second.next = new Node<String>("C");
		
		// Remove B, producing A -> C
		head.next = second.next;
		
		// Print out the list
		for(Node<String> t = head; t != null; t = t.next) {
			System.out.println(t);
		}
	}

}
