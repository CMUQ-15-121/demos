
public class NodeTester {

	public static void main(String[] args) {
		Node<Integer> firstNode = new Node<Integer>();
		firstNode.value = 10;
		
		Node<Integer> secondNode = new Node<Integer>();
		secondNode.value = 5;
		firstNode.next = secondNode;
		
		Node<Integer> thirdNode = new Node<Integer>();
		thirdNode.value = 20;
		secondNode.next = thirdNode;
		
		Node<Integer> fourthNode = new Node<Integer>();
		fourthNode.value = 25;
		thirdNode.next = fourthNode;
		
		secondNode.next.next.value = 765;
		
		System.out.println(firstNode.next.next.next.value);
		
		firstNode.next.next.next.next = new Node<Integer>();
		firstNode.next.next.next.next.value = 100;
		
		// Remove 5 from the list
		firstNode.next = firstNode.next.next;
		
//		Node<String> stringNode = new Node<String>();
//		stringNode.value = "Hi";
	}

}
