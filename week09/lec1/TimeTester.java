import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class TimeTester {
	public static final int NUM_ITEMS = 1000000;

	public static void main(String[] args) {
		BinarySearchTree<Integer> myTree = new BinarySearchTree<Integer>();
		ArrayList<Integer> myArrayList = new ArrayList<Integer>(NUM_ITEMS);
		LinkedList<Integer> myLinkedList = new LinkedList<Integer>();

		Random r = new Random();
		MyTimer timer = new MyTimer();
		int[] randNums = new int[NUM_ITEMS];
		int timeTaken = 0;

		// Generate some random numbers that we add to each data structure
		for (int i = 0; i < randNums.length; i++) {
			randNums[i] = r.nextInt();
		}

		System.out.println("BST: Checking speed of add...");
		timer.start();
		for (int num : randNums) {
			myTree.add(num);
		}
		timer.stop();
		timeTaken = timer.elapsed();
		System.out.println("BST: Done adding, took " + timeTaken + " ms");

		System.out.println("ArrayList: Checking speed of add...");
		timer.start();
		for (int num : randNums) {
			myArrayList.add(num);
		}
		timer.stop();
		timeTaken = timer.elapsed();
		System.out.println("ArrayList: Done adding, took " + timeTaken + " ms");

		System.out.println("LinkedList: Checking speed of add...");
		timer.start();
		for (int num : randNums) {
			myLinkedList.add(num);
		}
		timer.stop();
		timeTaken = timer.elapsed();
		System.out.println("LinkedList: Done adding, took " + timeTaken + " ms");

		System.out.println("---");

		// Generate some random numbers that we will use for contains
		for (int i = 0; i < randNums.length; i++) {
			randNums[i] = r.nextInt();
		}

		System.out.println("BST: Checking speed of contains...");
		timer.start();
		for (int num : randNums) {
			myTree.contains(num);
		}
		timer.stop();
		timeTaken = timer.elapsed();
		System.out.println("BST: Done checking, took " + timeTaken + " ms");

		System.out.println("ArrayList: Checking speed of contains...");
		timer.start();
		for (int num : randNums) {
			myArrayList.contains(num);
		}
		timer.stop();
		timeTaken = timer.elapsed();
		System.out.println("ArrayList: Done checking, took " + timeTaken + " ms");

		System.out.println("LinkedList: Checking speed of contains...");
		timer.start();
		for (int num : randNums) {
			myLinkedList.contains(num);
		}
		timer.stop();
		timeTaken = timer.elapsed();
		System.out.println("LinkedList: Done checking, took " + timeTaken + " ms");
	}
}
