
public abstract class Animal {
	// The latin term that the bio people use
	private String species;
	// The term to refer to the individual animal (like Bob)
	private String name;
	
	public Animal(String species, String name) {
		this.species = species;
		this.name = name;
	}
	
	// Method 1: Get Name
	public String getName() {
		return this.name;
	}
	
	// Method 2: Make sound
	public abstract void makeSound();
	
}
