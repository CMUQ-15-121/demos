
public class FactorialRecursion {

	public static int factorial(int n) {
		System.out.println("Called with " + n);
		// Base Case
		if (n == 1) {
			return 1;
		}
		// Recursive Case
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		System.out.println(factorial(4));
	}
}
