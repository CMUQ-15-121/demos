
public class Warrior extends Monster {

	public Warrior() {
		super("Warrior", 45, 20, 10);
	}
	
	@Override
	public void attack(Monster otherMonster) {
		if (this.r.nextInt(100) < 25) {
			int dmg = this.r.nextInt(this.attackDmg*2)+1;
			System.out.println("CRITICAL HIT!!!! " + this.name + " attacks " + otherMonster.name + " for " + dmg + " damage");
			otherMonster.defend(dmg);
		} else {
			super.attack(otherMonster);
		}
	}
	
}
