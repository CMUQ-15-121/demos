
public class Turtle extends Monster{
	public Turtle() {
		super("Turtle",18,5,8);
	}
	
	@Override
	public int getDefense() {
		if (this.hp < this.maxHp/2) {
			return super.getDefense()*3/2;
		} else {
			return super.getDefense();
		}
	}
}
