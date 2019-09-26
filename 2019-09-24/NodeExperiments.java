
public class NodeExperiments {
	
	public void printNodes(Node myNode) {
		
	}

	public static void main(String[] args) {
		/*
		// Add three nodes somewhat out of order
		Node myNode = new Node();
		myNode.value = 5;
		
		Node nextNode = new Node();
		nextNode.value = 10;
		
		myNode.next = nextNode;
		nextNode.next = null;
		
		Node thirdNode = new Node();
		thirdNode.value = 8;
		
		thirdNode.next = nextNode;
		myNode.next = thirdNode;
		*/
		
		Node<Integer> myNode = new Node<Integer>();
		myNode.value = 5;
		
		myNode.next = new Node<Integer>();
		myNode.next.value = 10; // If used ()... (myNode.next).value = 10
		
		// Add 8 in between 5 and 10
		Node<Integer> t = new Node<Integer>();
		t.value = 8;	
		t.next = myNode.next;
		myNode.next = t;
		t = null;
		
		// Add 20 to the end
		myNode.next.next.next = new Node<Integer>();
		myNode.next.next.next.value = 20;
		
		Node<String> otherList = new Node<String>();
		otherList.value = "Hi there";
		
		otherList.next = new Node<String>();
		otherList.next.value = "Bob";
		
	}

}
