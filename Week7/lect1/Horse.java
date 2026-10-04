package lect1;

public class Horse extends Mammal{

	public Horse(String name) {
		super("Equus ferus caballus", name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Neigh");
	}

}
