
public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] myArray = new int[15];
		
		System.out.println("Length of array is " + myArray.length);
		
		int[] myOtherArray = {5, 10, 15, 20};
		
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = 100*i;
		}
		
		for(int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
		System.out.println(myArray[9]);
		
	}
	
}
