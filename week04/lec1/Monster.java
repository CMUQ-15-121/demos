import java.util.Random;

public class Monster {
	private String name;
	private int hp;
	private int maxHP;
	private int dmg;
	protected Random r;
	
	private boolean poisoned;

	public Monster(String name, int hp, int attackDamage) {
		this.name = name;
		this.hp = hp;
		this.maxHP = hp;
		this.dmg = attackDamage;
		this.poisoned = false;
		this.r = new Random();
	}
	
	public void attacks(Monster other) {
		int atkDmg = r.nextInt(this.dmg+1);
		System.out.println(this + " attacks " + other + " for " + atkDmg + " damage");
		other.hp -= atkDmg;
	}

	public boolean isDead() {
		return this.hp <= 0;
	}
	
	public void statusEffects() {
		// Process poison if I am poisoned
		if (this.poisoned) {
			System.out.println(this + " takes 1 damage from poison");
			this.hp -= 1;
		}
	}

	public String toString() {
		String ret = "";
		ret += this.name;
		ret += "(" + this.hp + ")";
		return ret;
	}
	
	public void poison() {
		this.poisoned = true;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public int getMaxHp() {
		return this.maxHP;
	}
	
	public int getDmg() {
		return this.dmg;
	}
	
	public void setHp(int newHp) {
		this.hp = newHp;
	}
	
	public static void main(String[] args) {
		Monster m = new Monster("Bob", 25, 4);
		System.out.println(m);
	}
}
