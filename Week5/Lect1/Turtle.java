package lect1;

public class Turtle extends Monster {
	
	public Turtle() {
		super("Turtle", 40, 2);
	}
	
	@Override
	public void receiveDmg(int dmg) {
		
		int dmgToReceive;
		
		if(this.getHp() < 8) { //hides in the shell
			dmgToReceive = dmg/2;
		}else {
			dmgToReceive= dmg;
		}
		
		super.receiveDmg(dmgToReceive);
		
	}

}
