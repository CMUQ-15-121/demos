
public class LinkedListTester {

	public static void main(String[] args) {
		MyLinkedList<String> myList = new MyLinkedList<String>();
		myList.addToHead("Hi");
		myList.addToHead("There");
		myList.add("A");
		myList.add("B");
		myList.printList();
		System.out.println(myList.contains("A"));
		System.out.println(myList.contains("C"));
		
		System.out.println(myList.indexOf("A"));
		System.out.println(myList.indexOf("C"));
		
		MyLinkedList<String> myList2 = new MyLinkedList<String>();
		myList2.printList();
	}

}
