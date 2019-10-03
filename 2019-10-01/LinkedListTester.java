
public class LinkedListTester {

	public static void main(String[] args) {
		MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
		System.out.println(myList);
		System.out.println(myList.size());
		myList.add(38);
		
		myList.addHead(10);
		myList.addHead(20);
		myList.addHead(30);
		myList.addHead(40);
		myList.add(100);
		myList.add(120);
		myList.add(20);
		System.out.println(myList);
		System.out.println(myList.size());
		
		System.out.println(myList.contains(100));
		System.out.println(myList.contains(15));	
		System.out.println(myList.indexOf(20));
		
		myList.remove(10);
		myList.remove(100);
		System.out.println(myList);
		myList.remove(20);
		System.out.println(myList.remove(20));
		System.out.println(myList.remove(20));
		System.out.println(myList);
		
		//myList.printList();
		myList.printReverseList();
		
		/*
		MyLinkedList<String> myOtherList = new MyLinkedList<String>();
		myOtherList.add("Hi");
		myOtherList.add("There");
		System.out.println(myOtherList);
		String val = "H";
		val += "i";
		System.out.println(myOtherList.contains(val));
		*/
		


	}

}
