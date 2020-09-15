
public class Tester {
	public static void main(String[] args) {
		Person p = new Person("Ryan Riley", 38);
		Student s = new Student("Jassim Al-Kubaisi", 21, "jkubaisi");
		Staff w = new Staff("Ahmed Khan", 44, "akhan", 5000);
		System.out.println(p);
		System.out.println(s);
		System.out.println(w);
		
		System.out.println("---");
		p.birthday();
		s.birthday();
		w.birthday();
		System.out.println(p);
		System.out.println(s);
		System.out.println(w);
		
		System.out.println("---");
		
		Person[] personArray = new Person[4];
		personArray[0] = p;
		personArray[1] = s;
		personArray[2] = w;
		personArray[3] = new Staff("Heather Johnson", 19, "hjohnson", 35000);
		
		for(int i = 0; i < personArray.length; i++) {
			System.out.println(personArray[i]);
		}
		
		System.out.println("---");
		for(int i = 0; i < personArray.length; i++) {
			if (personArray[i] instanceof Student) {
				//System.out.println(personArray[i]);
				Student tmp = (Student) personArray[i];
				String id = tmp.getAndrewId();
				System.out.println(id);
			}
			
		}
		
		System.out.println("---");
		int salarySum = 0;
		for(int i = 0; i < personArray.length; i++) {
			if (personArray[i] instanceof Staff) {
				Staff tmp = (Staff) personArray[i];
				salarySum += tmp.getSalary();
				//salarySum += ((Staff)personArray[i]).getSalary();
			}
		}
		System.out.println(salarySum);
	}
}
