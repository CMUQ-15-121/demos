import java.util.ArrayList;
import java.util.LinkedList;

public class ForEachTester {

	public static void main(String[] args) {
		LinkedList<Integer> arr = new LinkedList<Integer>();
		arr.add(10);
		arr.add(5);
		arr.add(20);

		// This is O(N^2) for a linked list
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

		// This is O(N) -- Uses an Iterator
		for (int item: arr) {
			System.out.println(item);
		}
	}

}
