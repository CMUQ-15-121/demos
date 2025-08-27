
public class Incrementor {

	public static void main(String[] args) {
		int e = 5;
		System.out.println(e);
		e++;
		System.out.println(e);
		++e;
		System.out.println(e);
		// e == 7
		int a = 5 + ++e;
		System.out.println(a);
		System.out.println(e);
		
		int b = 5 + e++;
		System.out.println(b);
		System.out.println(e);
	}

}
