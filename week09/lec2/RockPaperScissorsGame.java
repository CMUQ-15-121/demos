
public class RockPaperScissorsGame {
	private Player p1;
	private Player p2;
	
	public RockPaperScissorsGame(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public void play() {
		char choice1 = p1.choose();
		char choice2 = p2.choose();
		// choice should be 'r', 'p', or 's'
		System.out.println(p1 + " picked " + choice1);
		System.out.println(p2 + " picked " + choice2);
		
		// Figure out the winner
		int winner = 1;
		if (choice1 == 'r' && choice2 =='p') {
			winner = 2;
		} else if (choice1 == 'p' && choice2 == 's') {
			winner = 2;
		} else if (choice1 == 's' && choice2 == 'r') {
			winner = 2;
		} else if (choice1 == choice2) {
			winner = 0;
		}
		
		// Print out the winner
		if (winner == 0) {
			System.out.println("It was a tie!");
		} else if (winner == 1) {
			System.out.println(p1 + " was the winner");
		} else {
			System.out.println(p2 + " was the winner");
		}
		return;
	}

}
