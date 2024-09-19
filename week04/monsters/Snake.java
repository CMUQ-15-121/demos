import java.util.Random;

public class Snake extends Monster {

	public Snake(Random r) {
		super("Snake", 60, 4, r);
	}
	
	@Override
	public void attack(Monster other) {
		boolean willPoison = this.r.nextInt(100) < 25;
		if (willPoison) {
			System.out.println(this + " poisoned " + other);
			other.setPoisoned(3);
		}
		super.attack(other);
	}

}
