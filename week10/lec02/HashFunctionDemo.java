
public class HashFunctionDemo {
	public static int hashString(String s) {
		int res = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int val = (int)c - (int)'a';
			res += val;
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(hashString("qatar"));
		System.out.println(hashString("ratar"));
		System.out.println(hashString("assignment") % 10);
	}
}
