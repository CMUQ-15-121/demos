import java.util.Random;

public class ComputerPlayer implements Player {
	private Random r;

	public ComputerPlayer() {
		this.r = new Random();
	}
	
	public String getName() {
		return "Computer";
	}

	@Override
	public char choose() {
		char[] options = { 'r', 'p', 's' };
		int choice = r.nextInt(3);
		return options[choice];
	}

}
