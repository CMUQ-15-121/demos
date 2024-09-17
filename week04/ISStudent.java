
public class ISStudent extends Student {

	@Override
	public void haveBirthday() {
		super.haveBirthday(); // I want to call from Person, but I can't
		System.out.println("Cake for " + getName());
	}

	public ISStudent(String name, int age, String major) {
		super(name, age, major);
	}
	
	public void takeMilleux() {
		System.out.println(getName() + " took Milleux");
	}
	
	@Override
	public String toString() {
		String ret = super.toString();
		return "IS"+ret;
	}

}
