import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] myArray = new int[5];
		int[] anotherArray = {0, 5, 10, 15, 20};
		
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = 5*i;
		}
		System.out.println(myArray);
		System.out.println(Arrays.toString(myArray));
		
		if (myArray == anotherArray) {
			System.out.println("Same with ==");
		} else {
			System.out.println("Not same with ==");
		}
		
		if (myArray.equals(anotherArray)) {
			System.out.println("Same with .equals");
		} else {
			System.out.println("Not same with .equals");
		}
		
		if (Arrays.equals(myArray, anotherArray)) {
			System.out.println("Same with Arrays.equals");
		} else {
			System.out.println("Not same with Arrays.equals");
		}
		
	}
}
