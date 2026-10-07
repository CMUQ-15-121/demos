package lect2;

public class FactorialRecusrion {

	
	public static int factorial(int n) {
		
		System.out.println("n: "+n);
		//Base Case
		/*if(n==0) {
			return 1;
		}*/
		
		//Recursive
		return n* factorial(n-1);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(factorial(4));

	}

}
