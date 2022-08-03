
public class Loops {

	public static void main(String[] args) {
		/* These two loops are functionally identical */
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		
		for(int j = 0; j < 10; j++) {
			System.out.println(j);
		}
		
		/* This loop is different, and more rare */
		int k = 0;
		do {
			System.out.println(k);
			k++;
		} while (k < 10);

	}

}
