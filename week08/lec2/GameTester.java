
public class GameTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Ryan", 40);
		ComputerPlayer cp = new ComputerPlayer();
		ComputerPlayer cp2 = new ComputerPlayer();
		RockPaperScissorsGame r = new RockPaperScissorsGame(p1, cp2);
		r.play();
	}

}
