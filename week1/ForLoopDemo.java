
public class ForLoopDemo {

	public static void main(String[] args) {
		/* These two loops do the exact same thing */

		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}

		for (int j = 0; j < 10; j++) {
			System.out.println(j);
		}

		int k = 0;
		do {
			System.out.println(k);
			k++;
		} while (k < 10);
	}

}
