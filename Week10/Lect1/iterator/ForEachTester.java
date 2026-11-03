package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ForEachTester {

	public static void main(String[] args) {
		
		//ArrayList<Integer> list = new ArrayList<Integer>();
		LinkedList<Integer> list = new LinkedList<Integer> ();
		list.add(10);
		list.add(5);
		list.add(20);
		

		//complexiy?
		//AL - O(n)
		//LL - O(n^2)
		for(int i = 0; i < list.size(); i++) { //N iterations
			System.out.println(list.get(i)); //O(1)
		}
		


		//complexity?
		//AL - O(n)
		//LL - O(n)
		for(int e: list) { //for-each
			System.out.println(e);
		}
		
		//translation
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int e = it.next();
			System.out.println(e);
			
		}
	
	}
	
}