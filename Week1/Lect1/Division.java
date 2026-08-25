
public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5; //ints are 32 bits
		int b = 2;
		
		System.out.println(a/b);
		
		double e = 2.5;  //double is like a float. It is just bigger (64 bits).
		
		double c = 3; //Java silently expands the int value and converts it to double (3.0)
		System.out.println(c);

		//division type depends on the operands. 
			//if one of the operands is a double, the output is a double
		System.out.println(c/b);
		
		
		//Error: Java can't convert a double value to an int value (double is bigger)
		//int d = 2.5; 
		
		
		System.out.println(3/4); //both operands are ints, so this is an int division
	}
	
	
	

}
