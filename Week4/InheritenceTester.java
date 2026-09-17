package lect1;

import java.util.ArrayList;

public class InheritenceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person("Ali", 20);
		System.out.println(p.getName());
		System.out.println(p); //toString
		p.birthday();
		System.out.println(p.getAge());
		
		System.out.println("----------");
		Student s = new Student("Ahmed", 18, "IS");
		
		//inherited
		System.out.println(s.getName());
		System.out.println(s); //toString
		
		//new
		System.out.println(s.getMajor());
		
		//Overriden
		s.birthday();
		
		System.out.println("----------");
		ISStudent is = new ISStudent("Nour", 23);
		//new
		is.switchToCs();
		
		//inherited from Student
		System.out.println(is.getMajor());

		//inherited from Person
		System.out.println(is.getName());
		
		//customized method
		System.out.println(is); 
		
		System.out.println("----------");
		
		//ISStudent is2 = is; //alias
		ISStudent is2 = new ISStudent(is.getName(), is.getAge());
		is.setName("Amr");
		System.out.println(is);
		s.setAge(10);
		System.out.println(s);
		System.out.println(is2); 
		
		System.out.println("----------");

		
		Person ps = new Student("John", 18, "CS");
		System.out.println(ps.getName());
		//System.out.println(ps.getMajor());
		System.out.println(ps);
		
//		/Student sp= new Person("John", 18);
		
		System.out.println("----------");

		
		ArrayList<Person> l = new ArrayList<Person>();
		l.add(p);
		l.add(s);
		l.add(is);
		l.add(ps);
		
		for(int i =0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}

	}

}
