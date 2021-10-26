
public class MyLinkedListTester {

	public static void main(String[] args) {
		MyLinkedList<String> myList = new MyLinkedList<String>();
		myList.add("Bob");
		myList.add("Fred");
		myList.add("Ahmed");
		myList.printList();
		myList.printListRecursively();
		
		myList.printListReversed();
		myList.printListRevRecursively();
	}

}
