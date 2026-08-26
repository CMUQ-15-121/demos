package wk1_Lect2;

public class Incrementor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int e = 5;
		System.out.println(e);
		e++; //post increment: returns old value, then increments e 
		System.out.println(e);
		++e; //pre-increment: increments e, returns the new value
		System.out.println(e); //7
		
		System.out.println("-------------"); 
		int a = 5+ ++e; // 5 + 8 .. increments e then adds
		System.out.println(a); 
		System.out.println(e); 
		
		System.out.println("-------------"); 
		int b = 5 + e++; // 5 + 8 ... adds then increments e  
		System.out.println(b); 
		System.out.println(e); //
		
		//statement vs expression
		e++; //expression: evaluates to a useful value 
		System.out.println(e); //statement : doesn't evaluate to any values.. instruction 
		
		//int a = System.out.println(e);
	}

}
