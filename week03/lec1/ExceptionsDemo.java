
public class ExceptionsDemo {
	
	public ExceptionsDemo() {
		System.out.println(divide(10, 2));
		System.out.println(divide(1, 10));
		System.out.println(divide(10, 0));
	}
	
	public int divide(int a, int b) {
		try {
			return a/b;
		} catch(ArithmeticException e) {
			//System.out.println(e);
			return Integer.MAX_VALUE;
		}
	}

	public static void main(String[] args) {
		new ExceptionsDemo();
	}
}
