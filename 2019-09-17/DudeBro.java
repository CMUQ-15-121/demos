
public class DudeBro extends Monster {

	public DudeBro() {
		super("DudeBro", 42, 7);
	}
	
	@Override
	public void defends(Monster attacker, int dmg) {
		if (r.nextInt(100) < 20) {
			System.out.println("BROFIST!");
			this.hp -= dmg/2;
			attacker.defends(this, dmg/2);
		}
	}
	
}
