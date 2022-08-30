import java.util.Arrays;

// Common efficiencies: O(1), O(log N), O(N), O(N log N), O(N^2)

public class MyList {
	String[] arr;
	int numItems;

	public MyList() {
		numItems = 0;
		arr = new String[100];
	}

	public int getSize() {
		return numItems;
	}

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