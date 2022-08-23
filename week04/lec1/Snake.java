
public class Snake extends Monster {
	
	public Snake() {
		super("Snake", 15, 2);
	}
	
	@Override
	public void attacks(Monster other) {
		super.attacks(other);
		
		// Does the snake poison them in this turn?
		if (this.r.nextInt(100) < 60) {
			System.out.println(this + " poisons " + other);
			other.poison();
		}
	}

}
