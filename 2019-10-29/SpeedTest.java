import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class SpeedTest {

	public void timeTestList(List<Integer> theList, String typeOfList) {
		// Create a timer
		MyTimer timer = new MyTimer();

		// Start the timer, sum all the items in the for-each way
		int sum = 0;
		timer.start();

		for (int val : theList) {
			sum += val;
		}

		timer.stop();
		System.out.println(typeOfList + " took " + timer.elapsedSeconds() + " seconds with a for-each loop.");

		// Start the timer, sum all the items in the traditional way
		sum = 0;
		timer.start();

		for (int i = 0; i < theList.size(); i++) {
			sum += theList.get(i);
		}

		timer.stop();
		System.out.println(typeOfList + " took " + timer.elapsedSeconds() + " seconds with a traditional loop.");
	}

	public SpeedTest() {
		// Create a Linked List and an ArrayList
		LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
		ArrayList<Integer> myArrayList = new ArrayList<Integer>();

		// Add a bunch of random numbers to them.
		Random r = new Random();
		for (int i = 0; i < 100000; i++) {
			int val = r.nextInt();
			myLinkedList.add(val);
			myArrayList.add(val);
		}

		// Test the speed of both of them
		timeTestList(myArrayList, "Array List");
		timeTestList(myLinkedList, "Linked List");

	}

	public static void main(String[] args) {
		new SpeedTest();
	}

}
