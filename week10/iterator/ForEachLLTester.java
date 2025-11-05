package iterator;

import mylinkedlist.MyLinkedList;

public class ForEachLLTester {

	public static void main(String[] args) {
		MyLinkedList<String> list = new MyLinkedList<String>();
		list.add("Hi");
		list.add("There");
		list.add("Me");
		

		for(String e: list) {
			System.out.println(e);
		}
		
	}
}