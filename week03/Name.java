
public class Name {
	private String name;
	private String origin;
	private String meaning;

	public Name(String name, String origin, String meaning) {
		this.name = name;
		this.origin = origin;
		this.meaning = meaning;
	}

	public String getName() {
		return name;
	}

	public String getOrigin() {
		return origin;
	}

	public String getMeaning() {
		return meaning;
	}

	public String toString() {
		return "Name [name=" + name + ", origin=" + origin + ", meaning=" + meaning + "]";
	}
	
	public static void main(String[] args) {
		Name n = new Name("Bob", "USA", "Boring person");
		System.out.println(n);
	}

}
