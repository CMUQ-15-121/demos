import java.util.Arrays;

public class MyList {  
    String[] arr;  
    int numItems;  
  
    // O(1) - Constant time
    public MyList() {  
        numItems = 0;  
        arr = new String[100];  
    }  
  
    // Return the number of items in the array.
    // O(1)
    public int getSize() {  
        return numItems;  
    }  
  
    // Add an item to the end of the array.  If the arrays if full, double its size.  
    // O(N) - Linear
    public void add(String s) {  
        if (numItems < arr.length) { // This if is O(1)
            arr[numItems++] = s;  
        } else {  
            String[] newArr = new String[arr.length * 2];  
            for (int i = 0; i < arr.length; i++) {  // O(N)
                newArr[i] = arr[i];  
            }  
            arr = newArr;  
            arr[numItems++] = s;  
        }  
    }  
  
    // Remove an item from the array, and shift items to remove the empty space.  
    // O(N)
    public void remove(int idx) {  
        if (idx < numItems) {  
            // Remove the item  
            arr[idx] = null;  
            // Slide all the others back to remove the hole.  
            // This varies from O(1) to O(N) depending on which item I am removing
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
  
        for (int i = 0; i < numItems/2; i++) {  
            if (arr[i].equals(item)) {  
                count++;  
            }  
        }  
  
        return count;  
    }  
  
    // Return which items occurs most frequently in the array.  
    // O(N^2) - Quadratic
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