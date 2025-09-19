package DEMO;

public class ISStudent extends Student{
	
	
	public ISStudent(String name, int age) {
		super(name, age, "IS");
		// TODO Auto-generated constructor stub
	}

	public void switchToCS() {
		this.setMajor("CS");
	}
	
	@Override
	public String toString() {
		return "IS - "+super.toString();
	}

}
