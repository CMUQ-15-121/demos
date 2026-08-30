
public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray = new int[15];
		// System.out.println(myArray[5]);

		//int[] myArray2 = {1,2,3,4,5};
		
		myArray[0] = 10;
		myArray[10] = 15;
		myArray[14] = 20;

		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}

}
