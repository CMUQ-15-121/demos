import java.util.ArrayList;

public class AnimalTester {

	public static void main(String[] args) {
		// Not allowed
		// Animal a = new Animal("blah", "blah2");

		// Animal a = new Horse("Mr. Ed");
		// System.out.println(a);

		ArrayList<Animal> myList = new ArrayList<Animal>();
		myList.add(new Horse("Mr. Lee"));
		myList.add(new Lion("Simba"));
		myList.add(new Snake("Mr. Hissy"));

		int numMammals = 0;
		for (Animal tmp : myList) {
			System.out.println(tmp);
			if (tmp instanceof Lion) {
				((Lion) tmp).eatZebra();
			}
			if (tmp instanceof Mammal) {
				numMammals++;
			}
		}
		System.out.println("Number of Mammals: " + numMammals);
	}

}
