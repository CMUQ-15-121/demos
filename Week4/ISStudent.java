package lect1;

public class ISStudent extends Student{

	public ISStudent(String name, int age) {
		super(name, age, "IS");
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void switchToCs() {
		this.setMajor("CS");
	}
	
	
	@Override
	public String toString() {
		return "IS -- "+ super.toString();
	}
	
	

}
