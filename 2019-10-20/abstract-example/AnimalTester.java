import java.util.ArrayList;

public class AnimalTester {
	
	public void provoke(ArrayList<Animal> animalList) {
		/*
		for(int i = 0; i < animalList.size(); i++) {
			Animal a = animalList.get(i);
			a.makeSound();
		}
		*/
		for(Animal a: animalList) {
			a.makeSound();
			
			if (a instanceof Horse) {
				Horse h = (Horse) a;
				h.sleepStandingUp();
			}
			else if (a instanceof Cat) {
				Cat c = (Cat) a;
				c.scratch();
			}
		}
	}

	public AnimalTester() {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		Horse h = new Horse();
		animals.add(h);
		
		animals.add( new Cat() );
		
		animals.add( new Snake() );
		
		provoke(animals);
	}
	
	public static void main(String[] args) {
		new AnimalTester();
	}

}
