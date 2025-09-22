package MonstersBattle;

public class Snake extends Monster{
	
	public Snake() {
		super("Snake", 60, 4);
	}
	
	@Override
	public void attack(Monster other) {
		
		//20% chance to poison the opponent.
		if(this.r.nextInt(100) <= 20) {
			other.setPoisoned(true);
			System.out.println(this + " poisoned "+ other);
		}
		
		
		super.attack(other);
	}

}
