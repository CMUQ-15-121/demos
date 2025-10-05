package queue;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> queue = new ArrayListQueue<String>(); //new LinkedListQueue<String>();

		queue.enqueue("A");
		queue.enqueue("B");
		queue.enqueue("C");
		
		System.out.println(queue.peek());

		
		while (!queue.isEmpty()) {
			System.out.println(queue.dequeue());
		}
		
	}

}
