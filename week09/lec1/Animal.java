
public abstract class Animal {
	// The latin species name that BIO people use
	private String species;
	// The animals' name (like Fred)
	private String name;
	
	public Animal(String species, String name) {
		this.species = species;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public abstract void makeSound();
}
