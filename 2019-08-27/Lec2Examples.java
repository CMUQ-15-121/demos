
public class Lec2Examples {

	public static void main(String[] args) {
		/*
		int i = 0;
		System.out.println(i);
		i += 1;
		System.out.println(i);
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		
		int x = 5;
		System.out.println(x++ + ++x);
		System.out.println(x);
		*/
		
		/*
		for (int j = 0; j < 10; j++) {
			System.out.println(j);
		}
		*/
		
		/*
		int k = 10;
		while (k < 10) {
			System.out.println(k);
			k++;
		}
		*/
		
		/*
		int m = 25;
		do {
			System.out.println(m);
			m++;
		} while(m < 10);
		*/
		
		String myString = "Hi there";
		myString += " bob";
		System.out.println(myString);
		System.out.println(myString.length());
		System.out.println(myString.charAt(3));
		
		String myOtherString = "Hi there";
		myOtherString +=" bob";
		System.out.println(myOtherString);
		
		/*
		String myString = "Hi there bob";
		String myOtherString = "Hi there bob";
		*/
		
		if (myString == myOtherString) {
			System.out.println("The references match!");
		}
		else {
			System.out.println("The references don't match!");
		}
		
		if (myString.equals(myOtherString)) {
			System.out.println("The contents match!");
		}
		else {
			System.out.println("The contents don't match!");
		}
	}

}
