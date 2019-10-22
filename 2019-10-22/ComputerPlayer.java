import java.util.Random;

public class ComputerPlayer implements Player {
	private Random r;
	private static char[] choices = {'r','p','s'};
	
	public ComputerPlayer() {
		r = new Random();
	}

	public char choose() {
		int choice = r.nextInt(3);
		System.out.println("I choose " + choices[choice]);
		return choices[choice];
	}
}
