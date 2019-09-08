
public class Name {
	private String name;
	private String origin;
	private String meaning;
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		String ret = "";
		ret += "Name: " + this.name;
		ret += "; Origin: " + this.origin;
		ret += "; Meaning: " + this.meaning;
		return ret;
	}
	
	public Name(String name, String origin, String meaning) {
		this.name = name;
		this.origin = origin;
		this.meaning = meaning;
	}
}
