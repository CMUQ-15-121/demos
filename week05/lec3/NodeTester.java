
public class NodeTester {

	public static void main(String[] args) {
		Node first = new Node(10);
		Node second = new Node(20);
		Node head;
		
		head = first;
		first.next = second;
		
		Node tmp = new Node(30);
		second.next = tmp;
		
		tmp = new Node(40);
		first.next = tmp;
		tmp.next = second;
		
		for(Node t = head; t != null; t = t.next) {
			System.out.println(t);
		}

	}

}
