import java.util.Arrays;

// Common efficiencies: O(1), O(log N), O(N), O(N log N), O(N^2)

public class MyList {
	String[] arr;
	int numItems;

	public MyList() {
		numItems = 0;
		arr = new String[100];
	}

	// O(1)
	public int getSize() {
		return numItems;
	}

	// Best Case: O(1)
	// Worst Case: O(N)
	// Overall, just use the worst case: O(N)
	public void add(String s) {
		if (numItems < arr.length) {
			arr[numItems++] = s;
		} else {
			String[] newArr = new String[arr.length * 2];
			for (int i = 0; i < arr.length; i++) {
				newArr[i] = arr[i];
			}
			arr = newArr;
			arr[numItems++] = s;
		}
	}

	// Worst case: O(N)
	public void remove(int idx) {
		if (idx < numItems) { // O(1)
			// Remove the item
			arr[idx] = null; // O(1)
			// Slide all the others back to remove the hole.
			for (int i = idx + 1; i < numItems; i++) { // Worst case, loop runs N-1 times. 
				arr[i - 1] = arr[i]; // O(1)
			}
			numItems--; // O(1)
		}
	}

	// Return the number of times item occurs in the array
	// O(N)
	private int countItem(String item) {
		int count = 0;

		for (int i = 0; i < numItems; i++) {
			if (arr[i].equals(item)) { 
				count++;
			}
		}

		return count;
	}

	// Return which item occurs most frequently in the array.
	// O(N^2)
	public String findMostFrequest() {
		String mostFreq = "";
		int howMany = 0;

		for (int i = 0; i < numItems; i++) { // N times
			int count = countItem(arr[i]); // O(N)
			if (count > howMany) {
				howMany = count;
				mostFreq = arr[i];
			}
		}

		return mostFreq;
	}

	public String toString() {
		return numItems + ": " + Arrays.toString(arr);
	}

}