
public class MyLinkedListTester {

	public static void main(String[] args) {
		MyLinkedList<String> myList = new MyLinkedList<String>();
		System.out.println(myList);
		System.out.println("size: " + myList.size());
		
		myList.addHead("Bob");
		myList.addHead("Fred");
		myList.addHead("Ahmed");
		System.out.println(myList);
		System.out.println("size: " + myList.size());
		myList.add("Ryan");
		System.out.println(myList);
		System.out.println("size: " + myList.size());
		
		System.out.println("---");
		
		MyLinkedList<String> myOtherList = new MyLinkedList<String>();
		myOtherList.add("Bob");
		myOtherList.add("Fred");
		myOtherList.addHead("Ahmed");
		System.out.println(myOtherList);
		System.out.println(myOtherList.get(0));

	}

}
