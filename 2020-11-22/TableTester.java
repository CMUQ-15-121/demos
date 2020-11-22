import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class TableTester {
	public static void main(String[] args) {
		HashTable<Integer> myHt = new HashTable<Integer>();
		HashSet<Integer> myHs = new HashSet<Integer>();
		TreeSet<Integer> myTs = new TreeSet<Integer>();
		BinarySearchTree<Integer> myTree = new BinarySearchTree<Integer>();
		ArrayList<Integer> myList = new ArrayList<Integer>();

		Random r = new Random();

		System.out.println("Filling the data structure...");
		for (int i = 0; i < 1000000; i++) {
			int rand = r.nextInt();
			myHt.add(rand);
			myHs.add(rand);
			myTs.add(rand);
			myTree.add(rand);
			myList.add(rand);
		}
		System.out.println("Done filling");

		MyTimer timer = new MyTimer();

		int[] randNums = new int[1000000];
		for (int i = 0; i < randNums.length; i++) {
			randNums[i] = r.nextInt();
		}

		System.out.println("HashTable: Checking speed of contains...");
		timer.start();
		for (int num : randNums) {
			myHt.contains(num);
		}
		timer.stop();
		int timeTaken = timer.elapsed();
		System.out.println("HashTable: Done checking, took " + timeTaken + " ms");
	
		System.out.println("HashSet: Checking speed of contains...");
		timer.start();
		for (int num : randNums) {
			myHs.contains(num);
		}
		timer.stop();
		timeTaken = timer.elapsed();
		System.out.println("HashSet: Done checking, took " + timeTaken + " ms");
		
		System.out.println("TreeSet: Checking speed of contains...");
		timer.start();
		for (int num : randNums) {
			myTs.contains(num);
		}
		timer.stop();
		timeTaken = timer.elapsed();
		System.out.println("TreeSet: Done checking, took " + timeTaken + " ms");
		
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
			myList.contains(num);
		}
		timer.stop();
		timeTaken = timer.elapsed();
		System.out.println("ArrayList: Done checking, took " + timeTaken + " ms");
	}
}
