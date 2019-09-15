import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ExceptionDemo {
	
	public static void checkedExceptionDemo() {
		try {
			FileReader f = new FileReader("myfile.txt");
		
			Scanner inp = new Scanner(f);
		} catch (Exception e) {
			System.out.println(e);
			return;
		}
	}

	public static int divide(int a, int b) {
		return a/b;
		
		/*
		if (b != 0) {
			return a / b;
		}
		else {
			System.out.println("Don't divide by 0!!!");
			return Integer.MAX_VALUE;
		}
		*/
		
		/*
		try {
			return a/b;
		}
		catch (ArithmeticException caughtException) {
			System.out.println("I got an exception: " + caughtException);
			return Integer.MAX_VALUE;
		}
		catch (Exception e) {
			
		}
		*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide(10, 5));

		System.out.println(divide(10, 0));
	}

}
