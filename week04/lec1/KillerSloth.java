
public class KillerSloth extends Monster {

	public KillerSloth() {
		super("Killer Sloth", 50, 2);
	}

	@Override
	public void attacks(Monster other) {
		if (this.getHp() < this.getMaxHp() / 2) {
			System.out.println("Sloth is desperate!");
			int atkDmg = r.nextInt(this.getDmg() + 1);
			atkDmg *= 2;
			System.out.println(this + " attacks " + other + " for " + atkDmg + " damage");
			other.setHp(other.getHp() - atkDmg);
		} else {
			super.attacks(other);
		}
	}

}
