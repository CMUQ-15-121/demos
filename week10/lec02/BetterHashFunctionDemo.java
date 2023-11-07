
public class BetterHashFunctionDemo {
	public static int hashString(String s) {
		int prime = 31;
		int res = 1;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int val = (int)c - (int)'a';
			res = res * prime + val;
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(hashString("qatar"));
		System.out.println(hashString("ratar"));
	}
}
