
public class Name {
	private String name;
	private String origin;
	private String meaning;
	
	public Name(String name, String origin, String meaning) {
		this.name = name;
		this.origin = origin;
		this.meaning = meaning;
	}
	
	public String toString() {
		return this.name + ", " + this.origin + ", " + this.meaning;
	}
}
