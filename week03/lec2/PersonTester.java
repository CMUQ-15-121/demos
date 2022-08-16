
public class PersonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Ryan");
		System.out.println(p.toString());
		
		Person y = new Person(null);
		System.out.println(y);
		System.out.println(y.isBob());
		
		Person q = null;
		if (q == null) {
			System.out.println("q was null");
		}
		System.out.println(q);
		// The next line will crash
		//System.out.println(q.toString());
	}

}
