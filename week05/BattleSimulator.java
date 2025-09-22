package MonstersBattle;

public class BattleSimulator {
	
	public BattleSimulator(Monster a, Monster b) {
		// Run a full battle of Monster a and b attacking
		// each other
		
		while(true) {
			System.out.println("-------------");
			System.out.println(a);
			System.out.println(b);
			
			// Have a attack b
			a.attack(b);
			
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
		Monster m1 = new Monster("Professor", 100, 20);
		Monster m2 = new Monster("Student", 100, 30); //stronger
		//new BattleSimulator(m1, m2);
		
		Turtle t = new Turtle();
		Snake s = new Snake();
		new BattleSimulator(t, s);
		
		
	}

}