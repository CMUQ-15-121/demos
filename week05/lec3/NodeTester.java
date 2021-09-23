
public class NodeTester {

	public static void main(String[] args) {
		Node<Integer> first = new Node<Integer>(10);
		Node<Integer> second = new Node<Integer>(20);
		first.next = second;
		second.next = new Node<Integer>(30);
	}
}
