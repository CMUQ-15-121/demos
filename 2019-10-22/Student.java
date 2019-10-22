import java.util.Scanner;

public class Student extends Person implements Player {
	private Scanner inp;
	
	public Student(String name) {
		super(name);
	}
	
	public void addScanner(Scanner inp) {
		this.inp = inp;
	}
	
	@Override
	public char choose() {
		System.out.print(getName() + " please choose [r], [p], or [s]: ");
		String line = inp.nextLine();
		return line.charAt(0);
	}
}
