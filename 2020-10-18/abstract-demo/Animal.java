
public abstract class Animal {
	// The latin species name that BIO people use
	private String species;
	// The animal's name (like Fred or something)
	private String name;
	
	public Animal() {
	}
	
	public Animal(String species, String name) {
		this.species = species;
		this.name = name;
	}
	
	public String getSpecies() {
		return this.species;
	}
	
	public String getName() {
		return this.name;
	}
	
	public abstract void makeSound();
}
