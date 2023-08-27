
public class Incrementor {

	public static void main(String[] args) {
		int e = 5;
		System.out.println(e);
		e++;
		System.out.println(e);
		++e;
		System.out.println(e);
		int a = e++;
		System.out.println("a is " + a);
		System.out.println("e is " + e);
		int b = ++e;
		System.out.println("b is " + b);
		System.out.println("e is " + e);
		int c = ++e + 5 - e++;
		System.out.println("c is " + c);
		System.out.println("e is " + e);
	}

}
