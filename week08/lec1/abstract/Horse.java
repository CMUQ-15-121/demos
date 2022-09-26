
public class Horse extends Mammal {
	
	public Horse(String name) {
		super("equus ferus caballus", name);
	}

	@Override
	public void makeSound() {
		System.out.println("Neigh");
	}

}
