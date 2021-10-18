import java.util.ArrayList;

public class AnimalTester {

	public static void main(String[] args) {
		// Can't instantiate an abstract class
		// Animal a = new Animal("something", "somename");

		Horse h = new Horse("Mr. Ed");
		Lion l = new Lion("Joe");

		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(h);
		animals.add(l);
		animals.add(new Snake("Snakey"));

		for (Animal a : animals) {
			a.makeSound();
			if (a instanceof Mammal) {
				System.out.println("I found a mammal named " + a.getName());
			}

			if (a instanceof Lion) {
				Lion tmp = (Lion) a;
				tmp.eatZebra();
			}
		}

	}

}
