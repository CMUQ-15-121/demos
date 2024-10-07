
public class Lion extends Mammal {
	
	public Lion(String name) {
		super("Panthera leo", name);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Roar");
	}

}
