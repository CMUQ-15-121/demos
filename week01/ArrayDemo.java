
public class ArrayDemo {

	public static void main(String[] args) {
		int[] myArray = new int[15];
		int[] myOtherArray = {5, 10, 15, 20, 7};

		myArray[0] = 5;
		myArray[1] = 10;
		myArray[2] = 15;
		myArray[3] = 20;
		myArray[4] = 7;
		myArray[5] = 0;
		
		for(int i = 0; i < myArray.length; i++) {
			System.out.println("index " + i + " is " + myArray[i]);
		}
	}

}
