
public class LinkedListTester {

	public static void main(String[] args) {
		MyLinkedList<String> myList = new MyLinkedList<String>();
		System.out.println(myList.size());
		System.out.println(myList);
		myList.addToHead("Hi");
		System.out.println(myList);
		myList.addToHead("There");
		System.out.println(myList);
		
		myList.add("A");
		System.out.println(myList);
		myList.add("B");
		System.out.println(myList);
		System.out.println(myList.size());
		
		MyLinkedList<String> myOtherList = new MyLinkedList<String>();
		myOtherList.add("A");
		System.out.println(myOtherList);
	}

}
