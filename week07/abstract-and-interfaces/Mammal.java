
public abstract class Mammal extends Animal {

	public Mammal(String species, String name) {
		super(species, name);
	}
	
	public void giveMilk() {
		System.out.println(getName() + " gives milk.");
	}

}
