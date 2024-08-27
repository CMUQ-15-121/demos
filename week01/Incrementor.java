
public class Incrementor {

	public static void main(String[] args) {
		int e = 5;
		System.out.println(e);
		e++;
		++e;
		System.out.println(e);
		// here, e is... 7
		int a = e++;
		// here, e is... 8
		// here, a is... 
		System.out.println("a is: " + a);
		System.out.println("e is: " + e);
		int b = ++e;
		System.out.println("b is: " + b);
		System.out.println("e is: " + e);
	}

}
