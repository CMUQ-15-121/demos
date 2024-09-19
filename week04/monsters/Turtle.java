import java.util.Random;

public class Turtle extends Monster {

	public Turtle(Random r) {
		super("Turtle", 40, 2, r);
	}

	@Override
	public void receiveDmg(int dmg) {
		if (this.getHp() <= 20) {
			System.out.println("Turtle is hiding in its shell!");
			super.receiveDmg(dmg / 2);
		} else {
			super.receiveDmg(dmg);
		}
	}

}
