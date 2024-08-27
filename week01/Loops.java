
public class Loops {

	public static void main(String[] args) {
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("---");
		
		for(int j = 0; j < 10; j++) {
			System.out.println(j);
		}
		
		System.out.println("---");
		
		int k = 0;
		do {
			System.out.println(k);
			k++;
		} while (k < 10);
	}

}
