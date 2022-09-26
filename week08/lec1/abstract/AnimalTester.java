import java.util.ArrayList;

public class AnimalTester {

	public static void main(String[] args) {
		// Can't do this
		// Animal a = new Animal("some latin thing", "Frank");
		
		Horse h = new Horse("Mr. Ed");
		Lion l = new Lion("Simba");
		Snake s = new Snake("Negini");
		
		ArrayList<Animal> myList = new ArrayList<Animal>();
		myList.add(h);
		myList.add(l);
		myList.add(s);
		
		int cnt = 0;
		for(Animal a : myList) {
			a.makeSound();
			
			if (a instanceof Lion) {
				((Lion) a).eatZebra();
			}
			
			// Count the number of mammals in the list
			if (a instanceof Mammal) {
				cnt++;
			}
		}
	}

}
