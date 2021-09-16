import java.util.Random;

public class Monster {
	protected String name;
	protected int hp;
	protected int maxHp;
	protected int attackDmg;
	private int defense;
	protected Random r;

	public Monster(String name, int hp, int attackDmg, int defense) {
		this.name = name;
		this.hp = hp;
		this.maxHp = hp;
		this.attackDmg = attackDmg;
		this.defense = defense;
		this.r = new Random();
	}

	public boolean isDead() {
		return this.hp <= 0;
	}

	public void attack(Monster otherMonster) {
		int dmg = this.r.nextInt(this.attackDmg)+1;
		System.out.println(this.name + " attacks " + otherMonster.name + " for " + dmg + " damage");
		otherMonster.defend(dmg);
	}

	public void defend(int damage) {
		int damageReceived = damage - this.getDefense();
		if (damageReceived < 0) {
			damageReceived = 0;
		}
		if (damageReceived > this.hp) {
			damageReceived = this.hp;
		}
		System.out.println(this.name + " received " + damageReceived + " damage");
		this.hp -= damageReceived;
	}
	
	public int getDefense() {
		return this.defense;
	}
	
	public String toString() {
		String ret = "";
		ret += this.name;
		ret += "(" + this.hp + ")";
		return ret;
		
	}

}
