import java.util.ArrayList;

public class AnimalTester {
	public AnimalTester() {
		// Write my testcode here

		// I can't do the next line
		// Animal a = new Animal("pythonidae", "Bob");

		Snake s = new Snake("Harold");
//		System.out.println(s.getSpecies());
//		System.out.println(s.getName());
//		s.makeSound();

		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(s);
		animalList.add(new Lion("Joe"));
		animalList.add(new Horse("Mr. Ed"));

		for (Animal a : animalList) {
			a.makeSound();
			if (a instanceof Mammal) {
				System.out.println(a.getName() + " is a mammal");
			} else {
				System.out.println(a.getName() + " is not a mammal");
			}
		}

//		for(int i = 0; i < animalList.size(); i++) {
//			Animal a = animalList.get(i);
//			// Do stuff
//		}
		
		// Call eatZebra on all Lions
		for (Animal a : animalList) {
			if (a instanceof Lion) {
				Lion tmp = (Lion) a;
				tmp.eatZebra();
			}
		}
	}

	public static void main(String[] args) {
		new AnimalTester();
	}
}
