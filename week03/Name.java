
public class Name {
	private String name;
	private String origin;
	private String meaning;

	public Name(String name, String origin, String meaning) {
		this.name = name;
		this.origin = origin;
		this.meaning = meaning;
	}

	@Override
	public String toString() {
		return "Name [name=" + name + ", origin=" + origin + ", meaning=" + meaning + "]";
	}

	public static void main(String[] args) {
		System.out.print("Testing name... ");
		Name n = new Name("Zosima",	"Greek", "lively");
		String expected = "Name [name=Zosima, origin=Greek, meaning=lively]";
		String actual = n.toString();
		if (!expected.equals(actual)) {
			System.out.println("Error!");
			return;
		}
		System.out.println("done");
	}
}
