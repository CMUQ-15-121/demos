public class BattleSimulator {

	public BattleSimulator(Monster a, Monster b) {
		// Run a full battle of Monster a and b attacking
		// each other

		while (true) {
			System.out.println("-------------");
			System.out.println(a);
			System.out.println(b);

			// Have a attack b
			a.attacks(b);

			// Check if b is dead
			if (b.isDead()) {
				System.out.println(b + " is dead!");
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
		Monster one = new Monster("Fred", 20, 5);
		Monster two = new Turtle(25, 3);
		new BattleSimulator(one, two);
	}

}
