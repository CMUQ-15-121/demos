import java.util.Random;

public class ComputerPlayer implements Player {
	private Random r;
	private char[] options = { 'r', 'p', 's' };

	public ComputerPlayer() {
		r = new Random();
	}

	public char choose() {
		int randInt = r.nextInt(3);
		return options[randInt];
	}
	
	public String toString() {
		return "Computer";
	}
}
