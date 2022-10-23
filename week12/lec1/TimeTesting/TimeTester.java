package TimeTesting;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;

public class TimeTester {
	public static final int NUM_ITEMS = 1000000;

	public static void main(String[] args) {
		HashTable<Integer> myHt = new HashTable<Integer>(NUM_ITEMS);
		BinarySearchTree<Integer> myTree = new BinarySearchTree<Integer>();
		HashSet<Integer> myHs = new HashSet<Integer>();
		TreeSet<Integer> myTs = new TreeSet<Integer>();
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

		System.out.print("HashTable: Checking speed of add... ");
		timer.start();
		for (int num : randNums) {
			myHt.add(num);
		}
		timer.stop();
		timeTaken = timer.elapsed();
		System.out.println(timeTaken + " ms");
		
		System.out.print("HashSet: Checking speed of add... ");
		timer.start();
		for (int num : randNums) {
			myHs.add(num);
		}
		timer.stop();
		timeTaken = timer.elapsed();
		System.out.println(timeTaken + " ms");
		
		System.out.print("BST: Checking speed of add... ");
		timer.start();
		for (int num : randNums) {
			myTree.add(num);
		}
		timer.stop();
		timeTaken = timer.elapsed();
		System.out.println(timeTaken + " ms");

		System.out.print("TreeSet: Checking speed of add... ");
		timer.start();
		for (int num : randNums) {
			myTs.add(num);
		}
		timer.stop();
		timeTaken = timer.elapsed();
		System.out.println(timeTaken + " ms");
		
		System.out.print("ArrayList: Checking speed of add... ");
		timer.start();
		for (int num : randNums) {
			myArrayList.add(num);
		}
		timer.stop();
		timeTaken = timer.elapsed();
		System.out.println(timeTaken + " ms");

		System.out.print("LinkedList: Checking speed of add... ");
		timer.start();
		for (int num : randNums) {
			myLinkedList.add(num);
		}
		timer.stop();
		timeTaken = timer.elapsed();
		System.out.println(timeTaken + " ms");

		System.out.println("---");

		// Generate some random numbers that we will use for contains
		for (int i = 0; i < randNums.length; i++) {
			randNums[i] = r.nextInt();
		}

		System.out.print("HashTable: Checking speed of contains... ");
		timer.start();
		for (int num : randNums) {
			myHt.contains(num);
		}
		timer.stop();
		timeTaken = timer.elapsed();
		System.out.println(timeTaken + " ms");
		
		System.out.print("HashSet: Checking speed of contains... ");
		timer.start();
		for (int num : randNums) {
			myHs.contains(num);
		}
		timer.stop();
		timeTaken = timer.elapsed();
		System.out.println(timeTaken + " ms");
		
		System.out.print("BST: Checking speed of contains... ");
		timer.start();
		for (int num : randNums) {
			myTree.contains(num);
		}
		timer.stop();
		timeTaken = timer.elapsed();
		System.out.println(timeTaken + " ms");

		System.out.print("TreeSet: Checking speed of contains... ");
		timer.start();
		for (int num : randNums) {
			myTs.contains(num);
		}
		timer.stop();
		timeTaken = timer.elapsed();
		System.out.println(timeTaken + " ms");
		
		System.out.print("ArrayList: Checking speed of contains... ");
		timer.start();
		for (int num : randNums) {
			myArrayList.contains(num);
		}
		timer.stop();
		timeTaken = timer.elapsed();
		System.out.println(timeTaken + " ms");

		System.out.print("LinkedList: Checking speed of contains... ");
		timer.start();
		for (int num : randNums) {
			myLinkedList.contains(num);
		}
		timer.stop();
		timeTaken = timer.elapsed();
		System.out.println(timeTaken + " ms");
	}
}