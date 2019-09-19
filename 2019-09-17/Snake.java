
public class Snake extends Monster {
	
	public Snake() {
		super("Snake", 30, 20);
	}
	
	@Override
	public void attack(Monster otherMonster) {
		super.attack(otherMonster);
		
		if (r.nextInt(100) < 20) {
			System.out.println(this.getName() + " stunned " + otherMonster.getName());
			otherMonster.setStunned(2);
		}
	}
	
	@Override
	public void specialAbility() {
		if (r.nextInt(100) < 75) {
			int toHeal = (this.maxHp - this.hp) / 2;
			System.out.println(this.getName() + " heals " + toHeal + " damage");
		}
	}

}
