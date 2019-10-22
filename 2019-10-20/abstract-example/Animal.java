
public abstract class Animal {
	private String species;
	
	public Animal() {
	}
	
	public Animal(String species) {
		this.species = species;
	}
	
	public String getSpecies() {
		return this.species;
	}
	
	abstract public void makeSound();
}
