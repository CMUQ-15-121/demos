import java.util.Arrays;

// Common efficiencies: O(1), O(log N), O(N), O(N log N), O(N^2)

// N is the number of items
public class MyList {
	String[] arr;
	int numItems;

	// O(1)
	public MyList() {
		numItems = 0;
		arr = new String[100];
	}

	// O(1)
	public int getSize() {
		return numItems;
	}

	// O(N)
	public void add(String s) {
		if (numItems < arr.length) {
			arr[numItems++] = s;
		} else {
			String[] newArr = new String[arr.length * 2]; // O(N)
			
			for (int i = 0; i < arr.length; i++) { // Runs N times
				newArr[i] = arr[i]; // O(1)
			}
			arr = newArr; // O(1)
			arr[numItems++] = s; // O(1)
		}
	}

	// O(N) [worst case]
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

		for (int i = 0; i < numItems; i++) {
			int count = countItem(arr[i]);
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