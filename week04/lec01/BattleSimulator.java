
public class BattleSimulator {

	public BattleSimulator(Monster a, Monster b) {
		while(true) {
			System.out.println("-------------");
			System.out.println(a);
			System.out.println(b);
			
			a.attack(b);
			
			if (b.isDead()) {
				System.out.println(a + " is the winner!");
				break;
			}
			
			Monster tmp = a;
			a = b;
			b = tmp;
		}
	}
	
	public static void main(String[] args) {
		Monster first = new Monster("Fred", 20, 5, 3);
		Monster second = new Warrior();
		BattleSimulator bs = new BattleSimulator(first, second);
	}
	
}
