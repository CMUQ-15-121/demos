import java.util.Random;

public class ComputerPlayer implements Player {
	private Random r;
	private static int num = 0;
	private int thisNum;
	
	public ComputerPlayer() {
		this.r = new Random();
		this.thisNum = ++num;
	}
	
	public char choose() {
		char[] options = {'r','p','s'};
		int choice = r.nextInt(3);
		return options[choice];
	}
	
	public String toString() {
		return "ComputerPlayer"+thisNum;
	}
}
