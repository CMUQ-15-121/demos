
public class Tester {
	public static void main(String[] args) {
		// Define some players
		Player p1 = new Person("Ryan", 38);
		Player p2 = new ComputerPlayer();

		Game g = new Game(p1, p2);
		g.play();
	}
}
