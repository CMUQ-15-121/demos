import java.util.Arrays;

public class InlineArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		
		if (Arrays.equals(arr, new int[] {1,2,3,4,5})) {
			System.out.println("Equal!");
		} else {
			System.out.println("Not equal");
		}
	}

}
