
public class AnimalTester {

	public static void main(String[] args) {
		Horse h = new Horse("Mr. Ed");
		h.makeSound();
		
		if (h instanceof Mammal) {
			System.out.println("It is a mammal!");
		}

	}

}
