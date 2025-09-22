package DEMO;

public class Student extends Person{
	
	private String major;

	public Student(String name, int age, String major) {
		super(name, age);	//calls Person constructor	
		this.major = major;
	}


	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return super.toString()+" (Major: " + this.major + ")";
	}
	
	@Override
	public void birthday() {
		super.birthday();//update age
		System.out.println("Cake for "+ this.getName());
		
	}
	

}
