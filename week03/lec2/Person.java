
public class Person {
	private String name;

	public Person(String name) {
		if (name == null) {
			this.name = "";
		} else {
			this.name = name;
		}
	}

	/**
	 * Returns true if this person's name is Bob
	 */
	public boolean isBob() {
		return this.name.equals("Bob");
	}

	public String toString() {
		return "Person: " + this.name;
	}

}
