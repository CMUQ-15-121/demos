package lect1;

public abstract class Animal {

	//latin name
	private String species;
	
	private String name;

	public Animal(String species, String name) {
		//super(); //Object
		this.species = species;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [species=" + species + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void makeSound();
	
	
}
