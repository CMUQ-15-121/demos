import java.util.Random;

public class Monster {
	// Number of hitpoints. When these run out, the monster dies.
	private int hp;
	private int maxHp;
	// Amount of damage this monster does when it attacks
	private int dmg;
	private String name;
	Random r;
	private int poisoned;

	public Monster(String name, int hp, int dmg) {
		this.name = name;
		this.hp = hp;
		this.maxHp = hp;
		this.dmg = dmg;
		this.r = new Random();
		this.poisoned = 0;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean isDead() {
		return this.hp <= 0;
	}
	
	public void poison() {
		// Get poisoned for 2 rounds
		this.poisoned = 2;
	}
	
	public void statusEffects() {
		if (poisoned > 0) {
			System.out.println(this.getName() + " received poison damage!");
			this.hp -= 5;
			poisoned--;
		}
	}
	
	// The monster 'this' attacks 'other'
	public boolean attacks(Monster other) {
		System.out.println(this.getName() + " is attacking " + other.getName());
		int t = r.nextInt(100);
		if (t < 25) {
			System.out.println(this.name + " attacked, but missed!");
			return false;
		} else {
			other.receiveDamage(this.dmg);
			return true;
		}
	}
	
	public void receiveDamage(int dmg) {
		this.hp -= dmg;
	}
	
	public int getMaxHp() {
		return this.maxHp;
	}


	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	@Override
	public String toString() {
		return "Monster [hp=" + hp + ", dmg=" + dmg + ", name=" + name + "]";
	}
}
