
public class BattleSimulator {
	
	public BattleSimulator(Monster a, Monster b) {
		// Run a full battle of Monster a and b attacking
		// each other
		
		while(true) {
			System.out.println("-------------");
			System.out.println(a);
			System.out.println(b);
			
			// Process status effects on b
			b.statusEffects();
			
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
		KillerSloth one = new KillerSloth();
		Snake two = new Snake();
		new BattleSimulator(one, two);
	}

}
