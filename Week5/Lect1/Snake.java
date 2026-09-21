package lect1;

public class Snake extends Monster {

	public Snake() {
		super("Snake", 60, 4);
	}
	
	@Override
	public void attack(Monster other) {

		if(this.r.nextInt(100) <= 20 ) {
			other.setPoisened(true);
			System.out.println(this+" Poisoned "+ other);
		}
		
		super.attack(other);
	}
}
