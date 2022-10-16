
public class RosterTester {

	public static void main(String[] args) {
		Roster r = new Roster();
		r.add(new Student("Ryan", "rdriley"));
		r.add(new Student("Ahmed", "ahmed"));
		r.add(new Student("Fatima", "fsafar"));
		
		//for(int i = 0; i < r.size(); i++) {
		//	System.out.println(r.get(i));
		//}
		
		for(Student s: r) {
			System.out.println(s);
		}
	}

}
