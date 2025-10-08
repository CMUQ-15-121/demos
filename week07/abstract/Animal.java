
public abstract class Animal {
	// The latin thing the bio people use
	private String species;
	// The name of the animal (like Fred)
	private String name;

	public Animal(String species, String name) {
		this.species = species;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return "Animal [species=" + species + ", name=" + name + "]";
	}

	public abstract void makeSound();
}
