package wk1_Lect2;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		while(i < 10) {
			//System.out.println(i);
			//i++;
			//++i;
			
			//System.out.println(i++);
			System.out.println(++i);
		}
		
		System.out.println("---------");
		
		for(int j = 0; j < 10; j++) { // for(int j=10; j>-1; j--)
			System.out.println(j);
		}
		
		for(int j = 0; j < 10; j+=2) { //increment by more than one
			System.out.println(j);
		}
		
		System.out.println("---------------");

		int x=0;
		for(int outer= 0; outer< 4; outer++) { //4
			for(int inner = 0; inner<3; inner++) {//3
				//System.out.println(inner);
				x++;
				System.out.println(x);
			}	
		}
		

		System.out.println("---------");
		int e = 0;
		do { //body
			System.out.println(e);
			e++;
			
		}while(e < 10); //condition
		
		
	}
	
	


}
