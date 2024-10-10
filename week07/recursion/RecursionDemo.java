
public class RecursionDemo {

	public static int factorial(int n) {
		// Base case
		if (n == 0) {
			return 1;
		}
		// Recursive case
		return n * factorial(n-1);
	}
	
	public static void main(String[] args) {
		int x = factorial(5);
		System.out.println(x);
	}

}
