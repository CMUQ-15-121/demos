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
			// Easy situation: 2 steps, or O(1)
			arr[numItems++] = s;
		} else {
			// Hard situation: O(N)
			
			String[] newArr = new String[arr.length * 2]; // O(1)
			
			// O(N)
			for (int i = 0; i < arr.length; i++) { // N times
				newArr[i] = arr[i]; // 1 step 
			}
			
			// O(1)
			arr = newArr;
			arr[numItems++] = s;
		}
	}

	// O(N)
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

	// O(N)
	private int countItem(String item) {
		int count = 0; // 1 step

		// O(N)
		for (int i = 0; i < numItems; i++) { // N times
			if (arr[i].equals(item)) {  // 1 step
				count++; // 1 step
			}
		}

		return count; // 1 step
	}

	// O(N^2)
	public String findMostFrequest() {
		String mostFreq = ""; // O(1)
		int howMany = 0; // O(1)

		for (int i = 0; i < numItems; i++) { // N times
			int count = countItem(arr[i]); // O(N)
			if (count > howMany) { // O(1)
				howMany = count; // O(1)
				mostFreq = arr[i]; // O(1)
			}
		}

		return mostFreq; // O(1)
	}

	// O(N)
	public String toString() {
		return numItems + ": " + Arrays.toString(arr);
	}

}