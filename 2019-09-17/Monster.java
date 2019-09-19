import java.util.Random;

public class Monster {
	protected int hp;
	protected int maxHp;
	private int attackPoints;
	private String name;
	private int stunned;
	protected Random r;

	public Monster(String name, int hp, int attackPoints) {
		this.name = name;
		this.hp = hp;
		this.maxHp = hp;
		this.attackPoints = attackPoints;
		this.r = new Random();
		this.stunned = 0;
	}

	public void attack(Monster otherMonster) {
		if (this.stunned > 0) {
			System.out.println(this.name + " did not attack");
			this.stunned--;
		} else {
			int dmg = r.nextInt(this.attackPoints);
			otherMonster.defends(this, dmg);
			System.out.println(this.name + " attacked " + otherMonster.name + " for " + dmg + " damage");
		}
	}
	
	public void defends(Monster attacker, int dmg) {
		this.hp -= dmg;
	}

	public void specialAbility() {
		return;
	}
	
	public boolean isDead() {
		return (this.hp <= 0);
	}
	
	public String getName() {
		return this.name;
	}

	public void setStunned(int stunned) {
		this.stunned = stunned;
	}
	
	public String toString() {
		return "Monster: " + this.name + "(" + this.hp + ")";
	}

}
