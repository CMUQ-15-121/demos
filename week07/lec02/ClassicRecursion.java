
public class ClassicRecursion {

	public static int factorial(int n) {
		System.out.println("I was called for value: " + n);
		// 1. Base case
		if (n == 0) {
			System.out.println("Stop recursing!");
			return 1;
		} else {
			// 2. Recursive case
			return n * factorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		factorial(5);
	}

}
