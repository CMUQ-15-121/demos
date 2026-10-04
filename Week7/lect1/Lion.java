package lect1;

public class Lion extends Mammal{

	public Lion(String name) {
		super("Panthera leo", name);
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Roar!");
	}

	public void eatZebra() {
		System.out.println("Yumm!");
	}
}
