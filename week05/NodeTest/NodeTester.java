
public class NodeTester {

	public static void main(String[] args) {
		Node first = new Node(5);
		first.next = new Node(12);
		first.next.next = new Node(3);
		Node other = first.next.next;
		Node bob = new Node(78);
		other.next = bob;
		
		for(Node tmp = first; tmp != null; tmp = tmp.next) {
			System.out.print(tmp + " -> ");
		}
		System.out.println("<null>");
		
		first.next.next = null;
		for(Node tmp = first; tmp != null; tmp = tmp.next) {
			System.out.print(tmp + " -> ");
		}
		System.out.println("<null>");
	}

}
