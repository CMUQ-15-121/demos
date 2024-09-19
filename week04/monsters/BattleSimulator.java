import java.util.Random;

public class BattleSimulator {

	public BattleSimulator(Monster a, Monster b) {
		// Run a full battle of Monster a and b attacking
		// each other

		while (true) {
			System.out.println("-------------");
			System.out.println(a);
			System.out.println(b);

			// Have a attack b
			a.attack(b);

			// See if b is dead
			if (b.isDead()) {
				System.out.println(b + " has died.");
				break;
			}

			// Switch a and b, and run the loop again
			Monster tmp = a;
			a = b;
			b = tmp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Monster one = new Snake(r);
		Monster two = new Turtle(r);
		new BattleSimulator(one, two);
	}

}