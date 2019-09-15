
public class ArrayGarbage {

	public static void main(String[] args) {
		int[] myArray = new int[10];
		for(int i = 0; i < 10; i++) {
			myArray[i] = i+8;
		}
		
		// Do stuff
		
		// Decide that I wish myArray had 20 items instead
		int[] myNewArray = new int[20];
		// Put stuff into myNewArray
		for(int i = 0; i < 20; i++) {
			myNewArray[i] = i+12;
		}
		
		// Replace old array with new array
		myArray = myNewArray;
	}
}
