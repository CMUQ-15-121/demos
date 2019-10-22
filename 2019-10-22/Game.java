import java.util.Scanner;

public class Game {
	private Player p1;
	private Player p2;

	public Game(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	/*
	 * Returns 0 if a draw, 1 if player 1 won, 2 if player 2 won
	 */
	public static int whoWon(char c1, char c2) {
		if (c1 == c2) {
			return 0;
		}

		if (c1 == 'r') {
			if (c2 == 'p') {
				return 2;
			} else if (c2 == 's') {
				return 1;
			}
		} else if (c1 == 'p') {
			if (c2 == 'r') {
				return 1;
			} else if (c2 == 's') {
				return 2;
			}
		} else if (c1 == 's') {
			if (c2 == 'r') {
				return 2;
			} else if (c2 == 'p') {
				return 1;
			}
		}
		return 0;
	}

	public void play() {
		char choice1 = p1.choose();
		char choice2 = p2.choose();

		int winner = whoWon(choice1, choice2);
		
		if (winner == 0) {
			System.out.println("Draw!");
		}
		else if (winner == 1) {
			System.out.println("Player 1 won!");
		}
		else if (winner == 2) {
			System.out.println("Player 2 won!");
		}
	}

}
