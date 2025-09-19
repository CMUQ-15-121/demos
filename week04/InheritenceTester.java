package DEMO;

import java.util.ArrayList;

public class InheritenceTester {

	public static void main(String[] args) {

		Person p = new Person("Ali", 20);
		System.out.println(p.getName());
		System.out.println(p); //toString
		
		System.out.println("-------------");
		
		Student s = new Student("Ahmed", 18, "IS");
		//special
		System.out.println(s.getMajor());
		//inherited
		System.out.println(s.getName()); 
		//customized
		s.birthday();
		
		//System.out.println(s.age);
		
		System.out.println("-------------");
		ISStudent is = new ISStudent("Nour", 23);
		//special
		is.switchToCS();
		//from Student
		System.out.println(is.getMajor());
		//from Person
		System.out.println(is.getName());
		//customized
		System.out.println(is);
		
		System.out.println("-------------");

		
		Person ps = new Student("John", 23, "CS");
		System.out.println(ps.getName());
		//System.out.println(ps.getMajor());
		System.out.println(ps.toString()); //toString
		
		System.out.println("-------------");

		ArrayList<Person> l = new ArrayList<Person>();
		l.add(p);
		l.add(s);
		l.add(is);
		l.add(ps);
		
		for(int i=0; i<l.size(); i++) {
			Person someone = l.get(i);
			System.out.println(someone); //toString
			System.out.printf("My name is %s and I am %d years old.%n", someone.getName(), someone.getAge());

		}
		
		
	}

}
