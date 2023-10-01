
public class Lion extends Mammal {

	public Lion(String name) {
		super("panthera leo", name);
	}

	@Override
	public void makeSound() {
		System.out.println("Roar");
	}

}
