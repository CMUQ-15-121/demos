
public class Symbiote extends Monster {
	private int hitsWithoutMissing;
	
	public Symbiote() {
		super("Symbiote", 100, 10);
		this.hitsWithoutMissing = 0;
	}
	
	@Override
	public boolean attacks(Monster other) {
		boolean ret = super.attacks(other);
		if (ret == true) {
			hitsWithoutMissing++;
		} else {
			hitsWithoutMissing = 0;
		}
		
		if (hitsWithoutMissing == 3) {
			other.poison();
			System.out.println(other.getName() + " has been poisoned!");
			hitsWithoutMissing = 0;
		}
		return ret;
	}
}
