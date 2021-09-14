
public class ExceptionsDemo {
	
	public static int divide(int a, int b) {
		try {
			return a/b;
		} catch (ArithmeticException e) {
			System.out.println(e); // Just to show it
			return Integer.MAX_VALUE;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(divide(10,5));
		System.out.println(divide(10,0));
	}

}
