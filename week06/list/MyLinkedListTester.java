package list;

public class MyLinkedListTester {

	public static void main(String[] args) {
		MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
		System.out.println(myList.size());
		myList.add(62);
		myList.addToHead(5);
		myList.addToHead(10);
		myList.addToHead(20);
		myList.add(25);
		myList.add(76);
		System.out.println(myList);
		System.out.println(myList.size());

		System.out.println(myList.get(-1));
		
		try {
			System.out.println(myList.get(100));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("I got an exception!: " + e);
		}
	}

}