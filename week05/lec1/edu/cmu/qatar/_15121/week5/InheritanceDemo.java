package edu.cmu.qatar._15121.week5;

import org.random.junk.Student;

public class InheritanceDemo {

	public static void main(String[] args) {
		Person[] people = new Person[2];
		
		people[0] = new Person("Ryan","Riley", 1981, 12, 26);
		people[1] = new Student("Mohamed", "AlMarri", 1890, 7, 3, "Cornell");

		for(Person tmp: people) {
			System.out.println(tmp);
		}
		
		for(Person tmp: people) {
			if (tmp instanceof Student) {
				System.out.println("I found a student!");
				Student s = (Student) tmp;
				System.out.println(s.getUniversity());
				System.out.println( ((Student)tmp).getUniversity() );
			}
		}
		
	}
}
