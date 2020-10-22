import java.util.ArrayList;

public class RecursiveList {

	public static void printList(LinkedListNode nodeIn) {
		for (LinkedListNode tmp = nodeIn; tmp != null; tmp = tmp.next) {
			System.out.print(tmp.getValue() + " -> ");
		}
		System.out.println("<null>");
	}

	public static void printListRecursive(LinkedListNode nodeIn) {
		if (nodeIn == null) {
			System.out.print("<null> ");
		} else {
			// Step 1: Print myself
			System.out.print(nodeIn.getValue() + " ");
			// Step 2: Recurse on the rest
			printListRecursive(nodeIn.next);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList<Integer> arr = new MyLinkedList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);;

		//printList(arr.head);
		printListRecursive(arr.head);
	}

}
