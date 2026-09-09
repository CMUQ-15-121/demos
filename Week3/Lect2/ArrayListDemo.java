package Lect2;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr = new ArrayList<Integer>(); //<Object Types>
		
		Random r = new Random();
		for(int i=0; i < 10; i++) {
			int rv= r.nextInt(100);
			arr.add(rv);
		}
		
		System.out.println(arr);
	}

}
