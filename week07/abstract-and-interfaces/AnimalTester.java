import java.util.ArrayList;

public class AnimalTester {

	public static void main(String[] args) {
		// Not allowed
		// Animal a = new Animal("Acrochordidae", "Fred");
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		Horse h = new Horse("Sprinkles");
		animals.add(h);
		Lion l = new Lion("Simba");
		animals.add(l);
		Snake s = new Snake("SSSaam");
		animals.add(s);
		
		for(Animal a: animals) {
			a.makeSound();
			if (a instanceof Mammal) {
				((Mammal)a).giveMilk();
			}
		}
	
	}

}
