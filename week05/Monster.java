package MonstersBattle;

import java.util.Random;

public class Monster {

	private String name;
	private int hp; // “Hit Points” (Health Points).
	private int dmg; // the max dmg it can cause

	protected Random r;
	private boolean isPoisoned;

	public Monster(String name, int hp, int dmg) {
			this.name = name;
			this.hp = hp;
			this.dmg = dmg;
			
			this.r = new Random();
			this.isPoisoned = false;
	}
	
	public boolean isPoisoned() {
		return isPoisoned;
	}

	public void setPoisoned(boolean isPoisoned) {
		this.isPoisoned = isPoisoned;
	}

	public void receiveDmg(int dmg) {
		this.hp -= dmg;
	}
	

	public void attack(Monster other) {
		
		boolean willMiss = (this.r.nextInt(100) < 20);
		
		if(this.isPoisoned && willMiss) {
			System.out.println(this+" Missed on the attack due to poison");
			return;
		}
		
		//[1, dmg]
		int dmgToCause = this.r.nextInt(1, this.dmg+1);
		other.receiveDmg(dmgToCause);
		
		System.out.println(this+" attacked "+ other + " with dmg = "+ dmgToCause);
		
	}
	
	//////////// Getters and Setters

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


	public boolean isDead() {
		return this.hp <= 0;
	}
	

	//////// To String
	@Override
	public String toString() {
		return "Monster [name=" + name + ", hp=" + hp + "]"; 
	}


	///////// Main
	public static void main(String[] args) {

		Monster m1 = new Monster("Bob", 100, 20);
		Monster m2 = new Monster("Alex", 100, 30);
		Monster m3 = new Monster("John", 100, 50);

		m1.attack(m3);
		


		
	}
	

}
