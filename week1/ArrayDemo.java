
public class ArrayDemo {

	public static void main(String[] args) {
		int[] myArray = new int[15];
		// double[] myDoubleArray = new double[5];
		// int[] myOtherArray = {5, 10, 15, 20};

		System.out.println("Length of array is: " + myArray.length);

		myArray[0] = 5;
		myArray[1] = 10;
		myArray[2] = 15;
		myArray[3] = 20;
		myArray[4] = 7;

		// Remove the item at 2
		for (int i = 2; i < myArray.length - 1; i++) {
			myArray[i] = myArray[i + 1];
		}

		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}

	}
}
