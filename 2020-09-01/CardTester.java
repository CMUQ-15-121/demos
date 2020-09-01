
public class CardTester {

	public static void main(String[] args) {
		/*
		Card testCard;
		testCard = new Card(1, 5);
		Card anotherCard = new Card(3, 12);
		
		System.out.println(testCard);
		System.out.println(anotherCard);
		*/
		
		for(int suit = 0; suit < 4; suit++) {
			for(int number = 1; number <= 13; number++) {
				Card tempCard = new Card(suit, number);
				System.out.println(tempCard);
			}
		}
		
		System.out.println("--------");
		Card myCard = new Card(5, -1);
		System.out.println(myCard);
		
		/*
		System.out.println(myCard.suit);
		System.out.println(myCard.number);
		myCard.suit = -1;
		myCard.number = 10;
		System.out.println(myCard);
		*/

	}
}
