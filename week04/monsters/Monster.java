import java.util.Random;

public class Monster {
	private String name;
	private int hp;
	private int dmg;
	private int poisoned = 0;
	protected Random r;

	public Monster(String name, int hp, int dmg, Random r) {
		this.name = name;
		this.hp = hp;
		this.dmg = dmg;
		this.r = r;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getDmg() {
		return dmg;
	}

	public void setDmg(int dmg) {
		this.dmg = dmg;
	}

	public int getPoisoned() {
		return poisoned;
	}

	public void setPoisoned(int poisoned) {
		this.poisoned = poisoned;
	}

	public void attack(Monster other) {
		// `this` references me, but `other` references the monster
		// I am attacking

		boolean poisonMiss = this.r.nextInt(100) < 50;
		if (this.poisoned > 0 && poisonMiss) {
			System.out.println(this + " missed due to being poisoned");
			return;
		}
		
		// I should do between [0, this.dmg] damage in this attack
		int dmgToDo = this.r.nextInt(this.dmg + 1);
		System.out.println(this + " attacks " + other + " for " + dmgToDo + " damge");

		other.receiveDmg(dmgToDo);
	}

	public void receiveDmg(int dmg) {
		this.hp -= dmg;
	}

	public boolean isDead() {
		return this.hp < 0;
	}

	public String toString() {
		return this.name + "(" + this.hp + ")";
	}

}
