package MonstersBattle;

public class Turtle extends Monster{
	
	public Turtle() {
		super("Turtle", 40, 2);
		
	}
	
	@Override
	public void receiveDmg(int dmg) {
		
		
		if(this.getHp() <= 5 ) {//hides inside the shell
			super.receiveDmg(dmg/2);
			
		}else { //behaves like a normal monster
			super.receiveDmg(dmg);
		}
	}

}
