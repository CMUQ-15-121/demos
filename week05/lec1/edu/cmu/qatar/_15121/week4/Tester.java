package edu.cmu.qatar._15121.week4;

public class Tester {

	public static void main(String[] args) {
		Person[] people = new Person[2];

		people[0] = new Person("Ahmed", "Ali", 3, 13, 2003);
		people[1] = new Student("Ibrahim", "Al-Thani", 4, 30, 2001, "CMUQ");

//		for(int i = 0; i < people.length; i++) {
//			Person tmp = people[i];
//			System.out.println(tmp);
//		}
		
//		for(Person tmp: people) {
//			System.out.println(tmp);
//		}

		for (Person tmp : people) {
			System.out.println(tmp);
			if (tmp instanceof Student) {
				Student tmpStudent = (Student) tmp;
				System.out.println(tmpStudent.getUniversity());
			}
		}
	}

}
