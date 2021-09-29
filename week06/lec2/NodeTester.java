
public class NodeTester {
	
	public static void printListFromNode(Node<Integer> node) {
		for(Node<Integer> tmp = node; tmp != null; tmp = tmp.next) {
			System.out.print(tmp + " --> ");
		}
		System.out.println("<null>");
	}

	public static void main(String[] args) {
		Node<Integer> a = new Node<Integer>(10);
		Node<Integer> b = new Node<Integer>(20);
		a.next = b;
		b.next = new Node<Integer>(30);
		Node<Integer> c = new Node<Integer>(5);
		b.next.next = c;
		a.next.next.next.next = new Node<Integer>(42);
		
		a = b.next;
		b.next = c;
		c.next.next = a;
		a.next = null;
		printListFromNode(b);
	}
}
