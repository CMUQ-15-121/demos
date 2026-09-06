package lect1;

public class Name {

	private String name; // null
	private String origin;
	private String meaning;
	
	
	
	public Name(String name, String origin, String meaning) {
		super();
		this.name = name;
		this.origin = origin;
		this.meaning = meaning;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getOrigin() {
		return origin;
	}



	public void setOrigin(String origin) {
		this.origin = origin;
	}



	public String getMeaning() {
		return meaning;
	}



	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}


	

	@Override
	public String toString() {
		return "Name [name=" + name + ", origin=" + origin + ", meaning=" + meaning + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Name n = new Name("Saad", "Arabic", "Happiness");
		System.out.println(n); //toString

	}

}
