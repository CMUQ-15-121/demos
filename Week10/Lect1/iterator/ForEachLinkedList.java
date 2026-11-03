package iterator;

import java.util.Iterator;
import java.util.LinkedList;

import mylinkedlist.MyLinkedList;

public class ForEachLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MyLinkedList<Integer> list = new MyLinkedList<Integer> ();
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
		
	}

}
