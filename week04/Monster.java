
public class Monster {
	private String name;
	private int hp;
	private int dmg;
	
	public Monster(String name, int hp, int dmg) {
		this.name = name;
		this.hp = hp;
		this.dmg = dmg;
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

	public void attack(Monster other) {
		// `this` references me, but `other` references the monster
		// I am attacking
		int dmgToDo = this.dmg;
		System.out.println(this + " attacks " + other + " for " + dmgToDo + " damge");
		other.hp -= dmgToDo;
	}
	
	public String toString() {
		return this.name + "(" + this.hp + ")";
	}


}
