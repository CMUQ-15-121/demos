public class AnotherIncrementorDemo {
	public static void main(String[] args) {
		int e = 15;
		System.out.println(--e + e++ + e++ + e-- + e++ - --e);
		System.out.println(e);
	}
}
