import java.util.Scanner;

public class RPSTester {

	public static void main(String[] args) {
		// Make players
		Scanner inp = new Scanner(System.in);

		Player p1 = new Student("Nadir");
		Player p2 = new ComputerPlayer();
		((Student)p1).addScanner(inp);
		
		Game g = new Game(p1, p2);
		g.play();

	}

}
