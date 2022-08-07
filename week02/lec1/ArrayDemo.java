import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] anotherArray = { 0, 5, 10, 15, 20 };

		int[] myArray = new int[5];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = 5 * i;
		}

		System.out.println(Arrays.toString(myArray));
		System.out.println(Arrays.toString(anotherArray));

		if (myArray == anotherArray) {
			System.out.println("The arrays are the same with ==.");
		} else {
			System.out.println("The arrays are not the same with ==.");
		}
		
		if (myArray.equals(anotherArray)) {
			System.out.println("The arrays are the same with .equals");
		} else {
			System.out.println("The arrays are not the same with .equals");
		}
		
		// Do this.  The other things are bad and will lead to pain.
		if (Arrays.equals(myArray, anotherArray)) {
			System.out.println("The arrays are the same with Arrays.equals");
		} else {
			System.out.println("The arrays are not the same with Arrays.equals");
		}
	}
}
