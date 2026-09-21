package lect1;

public class BattleSimulator {
	
	public BattleSimulator(Monster a, Monster b) {
		// Run a full battle of Monster a and b attacking
		// each other
		
		while(true) {
			System.out.println("-------------");
			System.out.println(a);
			System.out.println(b);
			
			a.attack(b);
			
			if (b.isDead()) {
				System.out.println(b + " is dead!");
				break;
			}
			
			Monster tmp = a;
			a = b;
			b = tmp;
		}
		
	
	}

	public static void main(String[] args) {		
		Monster m2 = new Monster("Alex", 100, 30);
		Monster m3 = new Monster("John", 100, 50);
		
		//new BattleSimulator(m2, m3);
		
		Turtle t = new Turtle();
		Snake s = new Snake();
		new BattleSimulator(t, s);
	}

}