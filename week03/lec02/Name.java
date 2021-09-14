
public class Name {
	public String name;
	public String origin;
	public String meaning;
	
	public Name(String name, String origin, String meaning) {
		this.name = name;
		this.origin = origin;
		this.meaning = meaning;
	}
	
	public String toString() {
		return this.name + " " + this.origin + " " + this.meaning;
	}
}
