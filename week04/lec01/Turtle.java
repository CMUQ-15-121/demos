
public class Turtle extends Monster {
	
	public Turtle(int hp, int dmg) {
		super("Turtle", hp, dmg);
	}
	
	@Override
	public void receiveDamage(int dmg) {
		if (this.getHp() < this.getMaxHp()/2) {
			System.out.println("Turtle is in his shell!");
			super.receiveDamage(dmg/2);
		} else {
			super.receiveDamage(dmg);
		}
	}

}
