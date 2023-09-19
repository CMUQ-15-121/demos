
public class LinkedListTester {

	public static void main(String[] args) {
		MyLinkedList<String> myList = new MyLinkedList<String>();
		System.out.println(myList);
		myList.addToHead("Hi");
		System.out.println(myList);
		myList.addToHead("There");
		System.out.println(myList);
	}

}
