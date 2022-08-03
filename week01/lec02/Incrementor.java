
public class Incrementor {

	public static void main(String[] args) {
		int e = 5;
		System.out.println(e);
		++e; // same as e += 1
		e++; // also same as e+= 1
		System.out.println(e);
		int a = ++e;
		System.out.println(a);
		System.out.println(e);
	}

}
