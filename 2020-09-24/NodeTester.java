
public class NodeTester {

	public static void printListFromNode(Node<Integer> n) {
		for (Node<Integer> tmp = n; tmp != null; tmp = tmp.next) {
			System.out.print(tmp.value + " --> ");
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		Node<Integer> firstNode = new Node<Integer>(10);

		Node<Integer> secondNode = new Node<Integer>(5);
		firstNode.next = secondNode;

		Node<Integer> thirdNode = new Node<Integer>(20);
		secondNode.next = thirdNode;

		Node<Integer> fourthNode = new Node<Integer>(25);
		thirdNode.next = fourthNode;

		printListFromNode(firstNode);

		firstNode.next.next.next.value = 765;

		printListFromNode(firstNode);

		firstNode.next.next.next.next = new Node<Integer>(100);

		printListFromNode(firstNode);

		// Remove 5 from the list
		firstNode.next = firstNode.next.next;

		printListFromNode(firstNode);

		Node<Integer> tmp = new Node<Integer>(123);
		tmp.next = thirdNode.next;
		thirdNode.next = tmp;

		printListFromNode(firstNode);

//		Node<String> stringNode = new Node<String>();
//		stringNode.value = "Hi";
	}

}
