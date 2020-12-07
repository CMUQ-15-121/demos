
public class NodeTester {

	public static void printListFromNode(ListNode<Integer> n) {
		for (ListNode<Integer> tmp = n; tmp != null; tmp = tmp.next) {
			System.out.print(tmp.value + " --> ");
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		ListNode<Integer> head = null;
		ListNode<Integer> tmp = null;
		ListNode<Integer> other = null;

		head = new ListNode<Integer>(10);
		printListFromNode(head);// Stop and draw Diagram A.

		other = head;
		tmp = new ListNode<Integer>(6);
		tmp.next = head;
		head = tmp;
		printListFromNode(head); // Stop and draw Diagram B.
		
		other.next = new ListNode<Integer>(7);
		printListFromNode(head); // Stop and draw Diagram C.

		tmp = new ListNode<Integer>(8);
		tmp.next = other.next;
		other.next = tmp;
		printListFromNode(head); // Stop and draw Diagram D.

		tmp.next.next = head;
		other.next = null;
		head = tmp;
		printListFromNode(head); // Stop and draw Diagram E
	}

}