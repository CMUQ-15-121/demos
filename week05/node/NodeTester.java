
public class NodeTester {

	public static void main(String[] args) {
		Node<String> first = new Node<String>("A");
		Node<String> second = new Node<String>("B");
		Node<String> third = new Node<String>("C");
		Node<String> head = null;
		
		first.next = second;
		second.next = third;
		head = first;
		
		for(Node<String> t = head; t != null; t = t.next) {
			System.out.println(t);
		}
	}

}
