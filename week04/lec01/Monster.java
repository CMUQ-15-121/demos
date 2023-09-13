import java.util.Random;

public class Monster {
	// Number of hitpoints. When these run out, the monster dies.
	private int hp;
	private int maxHp;
	// Amount of damage this monster does when it attacks
	private int dmg;
	private String name;
	Random r;

	public Monster(String name, int hp, int dmg) {
		this.name = name;
		this.hp = hp;
		this.maxHp = hp;
		this.dmg = dmg;
		this.r = new Random();
	}
	
	public boolean isDead() {
		return this.hp <= 0;
	}
	
	// The monster 'this' attacks 'other'
	public void attacks(Monster other) {
		int t = r.nextInt(100);
		if (t < 25) {
			System.out.println(this.name + " attacked, but missed!");
		} else {
			other.receiveDamage(this.dmg);
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
