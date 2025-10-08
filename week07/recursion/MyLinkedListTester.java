
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
		//System.out.println(myList);
		//System.out.println(myList.size());
		myList.printList();
		System.out.println(myList.contains(10));
		System.out.println(myList.contains(12));
		System.out.println(myList.indexOf(25));
		System.out.println(myList.indexOf(26));
		System.out.println(myList.indexOf(20));
	}

}
