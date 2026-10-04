package lect1;

import java.util.ArrayList;

public class AnimalTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Animal a = new Animal("blah", "blah!");
		
		Animal a = new Horse("Mr. Horse");
		System.out.println(a);
		a.makeSound();
		
		
		ArrayList<Animal> myList= new ArrayList<Animal>();
		myList.add(new Horse("Mr. Lee"));
		myList.add(new Lion("Mr. Sam"));
		myList.add(new Snake("Mr. Hasan"));
		
		int numMammals = 0;
		
		for(Animal tmp: myList) {
			tmp.makeSound();
			
			if(tmp instanceof Lion) {
				//tmp.eatZebra();
				((Lion) tmp).eatZebra();
			}
			
			if(tmp instanceof Mammal) {
				numMammals++;
			}		
			
		}
		
		System.out.println("Num Mammals: "+ numMammals);
		
	}

}
