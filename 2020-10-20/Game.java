
public class Game {
	private Player p1;
	private Player p2;
	
	public Game(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	private boolean isValidChoice(char choice) {
		return (choice == 'r' || choice == 'p' || choice == 's');
	}
	
	/**
	 * Given the two choices of the players, decide who won.
	 * 
	 * Valid choices are 'r', 'p', or 's'
	 * 
	 * @param choice1 The choice of player one as a char.
	 * @param choice2 The choice of player two as a char
	 * @return 0 if it is a tie, 1 if player 1 wins, 2 if player 2 wins
	 */
	public int whoWon(char choice1, char choice2) {
		if (choice1 == choice2) {
			return 0;
		}
		
		boolean valid1 = isValidChoice(choice1);
		boolean valid2 = isValidChoice(choice2);
		
		if (valid1 && !valid2) {
			return 1;
		} else if (!valid1 && valid2) {
			return 2;
		} else if (!valid1 && !valid2) {
			return 0;
		}
		
		// Add a check for validity
		
		if (choice1 == 'r' && choice2 == 's') {
			return 1;
		}
		if (choice1 == 'p' && choice2 == 'r') {
			return 1;
		}	
		if (choice1 == 's' && choice2 == 'p') {
			return 1;
		}
		
		return 2;
	}
	
	public void play() {
		char choice1 = p1.choose();
		char choice2 = p2.choose();
		
		System.out.println(p1 + " picked " + choice1);
		System.out.println(p2 + " picked " + choice2);
		
		int winner = whoWon(choice1, choice2);
		if (winner == 0) {
			System.out.println("Tie!");
		}
		else if (winner == 1) {
			System.out.println(p1 + " wins!");
		}
		else if (winner == 2) {
			System.out.println(p2 + " wins!");
		}
	}
	
}
