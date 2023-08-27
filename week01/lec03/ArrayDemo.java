
public class ArrayDemo {

	public static void main(String[] args) {		
		int[] myArray = new int[15];
		int[] newArray = {1,2,3,4};
		double[] myDoubles = new double[5];
		String[] myStrings = {"Ryan", "John"};
		
		myArray[0] = 5;
		myArray[1] = 10;
		myArray[2] = 15;
		myArray[3] = 20;
		myArray[4] = 7;
		
		for(int i = 0; i < myArray.length; i++) {
			System.out.println("index " + i + " is " + myArray[i]);
		}
		
		myArray[14] = 9;
	}

}
