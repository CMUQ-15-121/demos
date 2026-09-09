package Lect2;

public class ExceptionsDemo {

	
	public int divide(int a, int b) {
		return a/b;
		
	}
	
	public int safeDivide(int a, int b) {
		
		try {
			return a/b;
		}catch(ArithmeticException ae) {
			System.out.println("Division by 0 is not allowed");
			return Integer.MAX_VALUE;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExceptionsDemo ed = new ExceptionsDemo();
		System.out.println(ed.divide(10, 5));
		//System.out.println(ed.divide(10, 0));

		System.out.println(ed.safeDivide(10, 0));
	}

}
