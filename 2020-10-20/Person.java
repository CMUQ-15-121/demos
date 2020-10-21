import java.util.Scanner;

public class Person implements Comparable<Person>, Player {
	private String name;
	private int age;
	Scanner inp;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.inp = new Scanner(System.in);
	}

	public String toString() {
		return this.name + "(" + this.age + ")";
	}
	
	public char choose() {
		System.out.print(this.name + " choose (r)ock, (p)aper, or (s)cissors: ");
		String line = inp.nextLine();
		return line.charAt(0);
	}

	@Override
	public int compareTo(Person o) {
		int res = this.name.compareTo(o.name);
		if (res == 0) {
			if (this.age < o.age) {
				return -1;
			} else if (this.age == o.age) {
				return 0;
			} else {
				return 1;
			}
		} else {
			return res;
		}
	}
}
