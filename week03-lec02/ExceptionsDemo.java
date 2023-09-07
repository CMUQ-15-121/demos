
public class ExceptionsDemo {

	public static int divide(int a, int b) {
		try {
			return a / b;
		} catch (ArithmeticException e) {
			//System.out.println(e);
			return Integer.MAX_VALUE;
		}
	}

	public static void main(String[] args) {
		System.out.println(divide(5, 2));
		System.out.println(divide(5, 0));
		System.out.println("Finished!");
	}

}
