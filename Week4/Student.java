package lect1;

public class Student extends Person {
	
	private String major;

	
	public Student(String name, int age, String major) {
		super(name, age);
		// TODO Auto-generated constructor stub
		
		this.major = major;
	}


	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
    public void birthday() {
		super.birthday(); //increment the age
		System.out.println("Birthday Cake for Student: "+ this.getName());
    }
	
	
	@Override
	public String toString() { //new method
		return super.toString()+"( Major: "+this.major+") ";
	}
    
}
