import java.util.Arrays;

// Common efficiencies: O(1), O(log N), O(N), O(N log N), O(N^2)

// N is the number of items
public class MyList {
	String[] arr;
	int numItems;

	// 101 - O(1)
	public MyList() {
		numItems = 0; // 1
		arr = new String[100]; // 100
	}

	// O(1)
	public int getSize() {
		return numItems;
	}

	// Best: O(1)
	// Worst: O(N)
	// Normal: O(1)
	public void add(String s) {
		if (numItems < arr.length) { // 1
			arr[numItems++] = s; // 1
		} else {
			String[] newArr = new String[arr.length * 2]; // O(1)

			// Loop runs N times: O(n)
			for (int i = 0; i < arr.length; i++) {
				newArr[i] = arr[i]; // 1
			}
			arr = newArr; // O(1)
			arr[numItems++] = s; // O(1)
		}
	}

	// Best: O(1)
	// Worst: O(N)
	// Normal: O(N)
	public void remove(int idx) {
		if (idx < numItems) {
			// Remove the item
			arr[idx] = null;
			// Slide all the others back to remove the hole.
			for (int i = idx + 1; i < numItems; i++) {
				arr[i - 1] = arr[i];
			}
			numItems--;
		}
	}

	// Return the number of times item occurs in the array
	// Best: O(N)
	// Worst: O(N)
	// Normal: O(N)
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

		// O(N^2)
		for (int i = 0; i < numItems; i++) { // N
			int count = countItem(arr[i]); // O(N)
			if (count > howMany) { // O(1)
				howMany = count; // O(1)
				mostFreq = arr[i]; // O(1)
			}
		}
		return mostFreq;
	}

	// O(N)
	public String toString() {
		return numItems + ": " + Arrays.toString(arr);
	}

}