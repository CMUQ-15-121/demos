import java.util.Scanner;

public class HiLoGame {

	public static void main(String[] args) {
		Scanner userInp = new Scanner(System.in);
		DeckOfCards theDeck = new DeckOfCards();
		theDeck.shuffle();

		int money = 5000;

		/*
		 * System.out.println("Tell me your name: "); String name = userInp.nextLine();
		 * 
		 * System.out.println("Tell me your age: "); int age = userInp.nextInt();
		 * 
		 * System.out.println(name); System.out.println(age);
		 */

		while (money > 0) {
			System.out.println("You have " + money + " QAR.");

			int bet = 0;
			boolean quitFlag = false;
			while (true) {
				System.out.print("What is your bet? (or -1 to quit) ");
				bet = userInp.nextInt();
				userInp.nextLine();

				if (bet > 0 && bet <= money) {
					money = money - bet;
					break;
				} else if (bet == -1) {
					quitFlag = true;
					break;
				} else {
					System.out.println("That is a stupid response.");
					continue;
				}
			}

			if (quitFlag) {
				break;
			}

			Card theFirstCard = theDeck.drawCard();
			System.out.println("The first card is: " + theFirstCard);
			System.out.print("Do you think the next card will be (H)igher or (L)ower? ");
			String response = userInp.nextLine();

			// System.out.println("DEBUG: RESPONSE IS: " + response);

			Card theSecondCard = theDeck.drawCard();

			System.out.println("The second card is: " + theSecondCard);

			if (response.equals("H") || response.equals("h")) {
				if (theFirstCard.getValue() < theSecondCard.getValue()) {
					System.out.println("You win!");
					money = money + 2 * bet;
				} else {
					System.out.println("You lose!");
				}
			} else {
				if (theFirstCard.getValue() > theSecondCard.getValue()) {
					System.out.println("You win!");
					money = money + 2 * bet;
				} else {
					System.out.println("You lose!");
				}
			}
		}
	}

}
