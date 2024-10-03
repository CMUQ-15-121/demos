
public class QueueTester {

	public static void main(String[] args) {
		Queue<String> myQ = new LinkedListQueue<String>();
		myQ.enqueue("A");
		myQ.enqueue("B");
		myQ.enqueue("C");
		while(!myQ.isEmpty()) {
			System.out.println(myQ.dequeue());
		}

	}

}
