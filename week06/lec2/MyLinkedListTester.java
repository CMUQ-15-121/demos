
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
		System.out.println(myList.size());
		
		MyLinkedList<String> myOtherList = new MyLinkedList<String>();
		myOtherList.add("A");
		System.out.println(myOtherList);
		System.out.println(myOtherList.size());
		myOtherList.add("B");
		myOtherList.addToHead("Z");
		myOtherList.add("C");
		System.out.println(myOtherList);
		System.out.println(myOtherList.size());
		System.out.println(myOtherList.get(0));
		System.out.println(myOtherList.get(1));
		System.out.println(myOtherList.get(2));
		System.out.println(myOtherList.get(3));
		//System.out.println(myOtherList.get(10));
		System.out.println(myOtherList.get(-1));
		

	}

}
