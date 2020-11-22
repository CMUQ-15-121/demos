
public class PlayingAround {

	public static void main(String[] args) {
		String s = "Ryan Riley";
		String t = "Ryan" + " Rilfz";
		System.out.println(Math.abs(s.hashCode()) % 16);
		System.out.println(Math.abs(t.hashCode()) % 16);
	}

}
