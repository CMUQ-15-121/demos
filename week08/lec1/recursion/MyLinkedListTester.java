
public class MyLinkedListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList<String> myList = new MyLinkedList<String>();
		myList.addToHead("Q");
		System.out.println(myList);
		System.out.println(myList.size());
		myList.addToHead("B");
		myList.addToHead("D");
		System.out.println(myList);
		System.out.println(myList.size());
		myList.add("C");
		System.out.println(myList);

		System.out.println("---");
		
		myList.printList();
		myList.otherPrintList();
	}

}
