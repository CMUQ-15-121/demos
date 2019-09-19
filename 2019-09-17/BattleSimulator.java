
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
			
			b.specialAbility();
			
			Monster tmp = a;
			a = b;
			b = tmp;
		}
	}
	
	public static void main(String[] args) {
		Monster first = new DudeBro();
		Snake second = new Snake();
		BattleSimulator bs = new BattleSimulator(first, second);
	}
	
}
