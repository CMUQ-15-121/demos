public class Student extends Person {
	private String major;
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	public String getMajor() {
		return this.major;
	}
	
	@Override
	public String toString() {
		String temp = super.toString();
		return temp + " ("+this.major+")";
	}
	
	public static void main(String[] args) {
		Student s = new Student("Ahmed", 18, "Biology");
		System.out.println(s);
		s.birthday();
		System.out.println(s);
	}

}
