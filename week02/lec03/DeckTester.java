
public class DeckTester {

	public static void main(String[] args) {
		Deck d = new Deck();
		System.out.println(d);
		
		System.out.println("Dealing cards...");
		for(int i = 0; i < 60; i++ ) {
			Card c = d.deal();
			System.out.println(c);
		}
		
		Deck d2 = new Deck();
		System.out.println("Deck before shuffle...");
		System.out.println(d2);
		
		System.out.println("Shuffling cards...");
		d2.shuffle();
		System.out.println(d2);
	}

}
