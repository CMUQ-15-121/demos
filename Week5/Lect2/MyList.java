package Lect2;

import java.util.Arrays;

//Common efficiencies: O(1), O(log N), O(N), O(N log N), O(N^2)


//N: current number item in the array
public class MyList {
	String[] arr;
	int numItems;

	//O(1)
	public MyList() {
		numItems = 0; //1
		arr = new String[100]; //100 steps - O(1)
	}

	//O(1)
	public int getSize() {
		return numItems;
	}

	
	
	public void add(String s) {
		
		//Best Case : O(1)
		if (numItems < arr.length) {
			arr[numItems++] = s;
			
		//Worst Case: n+5 --> O(n)
		} else {
			
			//1
			String[] newArr = new String[arr.length * 2]; 
			
			//n 
			for (int i = 0; i < arr.length; i++) {  // 1 step for i=0
				newArr[i] = arr[i]; //1
			}
			arr = newArr; //1
			arr[numItems++] = s; //1
			//1 step increment i
		}
	}

	
	//Best Case: remove last O(1)
	//Worst Case: remover first O(n)
	//normal Case: n/2 --> O(n)
	public void remove(int idx) {
		if (idx < numItems) {
			arr[idx] = null;
			for (int i = idx + 1; i < numItems; i++) { 
				arr[i - 1] = arr[i]; 
			}
			numItems--;
		}
	}

	//Best = Worst = Avg -> O(n)
	private int countItem(String item) {
		int count = 0; //1

		for (int i = 0; i < numItems; i++) { // n iterations
			if (arr[i].equals(item)) { //1 
				count++; //1
			}
		}

		return count; //1
	}

	
	//O(N^2) -- worst - best - avg
	public String findMostFrequest() {
		String mostFreq = "";
		int howMany = 0;

		for (int i = 0; i < numItems; i++) { //n iterations
			int count = countItem(arr[i]); //1 or n?  n
			if (count > howMany) { //1
				howMany = count; //1
				mostFreq = arr[i]; //1
			}
		}

		return mostFreq; //1
	}

	//O(n)
	public String toString() {
		return numItems + ": " + Arrays.toString(arr);
	}

}