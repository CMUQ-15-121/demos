
public class GameTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Ryan", 39);
		ComputerPlayer p2 = new ComputerPlayer();
		
		RockPaperScissorsGame game = new RockPaperScissorsGame(p1,p2);
		game.play();
	}

}
