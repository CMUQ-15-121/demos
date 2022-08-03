
public class DoWhileExample {

	public static void main(String[] args) {
		int i = 11;
		while(i < 10) {
			System.out.println("while:" + i);
			i++;
		}
		
		int k = 11;
		do {
			System.out.println("do while:" + k);
			k++;
		} while (k < 10);
	}

}
