package lect1;

import java.util.Random;

public class Monster {

	private String name;
	private int hp; // “Hit Points” (Health Points).
	private int dmg; // the max dmg it can cause
	private boolean isPoisened;
	
	public boolean isPoisened() {
		return isPoisened;
	}


	public void setPoisened(boolean isPoisened) {
		this.isPoisened = isPoisened;
	}


	public Random r;
	
	
	public Monster(String name, int hp, int dmg) {
			this.name = name;
			this.hp = hp;
			this.dmg = dmg;
			this.isPoisened= false;
			
			this.r = new Random();
	}
	
	
	public void receiveDmg(int dmg) {
		this.hp-=dmg;
	}
	
	public void attack(Monster other) {
		int pr = this.r.nextInt(1,101);
		
		if(pr < 20 && this.isPoisened) {
			System.out.println(this+" Missed on the attack due to Poison");
			return;
		}
		
		int dmgToCause = this.r.nextInt(1, this.dmg+1); //1 -> dmg
		other.receiveDmg(dmgToCause);
		//System.out.println(this); //toString on the current object
		System.out.println(this + " attacked "+ other + " with dmg "+ dmgToCause);
	}
	
	public boolean isDead() {
		return hp <= 0;
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
