
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
		System.out.println(myOtherList.get(2));
		
		boolean casePassed = false;
		try {
			System.out.println(myOtherList.get(3));
		} catch (IndexOutOfBoundsException e) {
			casePassed = true;
		}
		if (casePassed) {
			System.out.println("Get raised the correct exception");
		} else {
			System.out.println("Get did not raise the correct exception");
		}
		
		String t = "Ah";
		t += "med";
		System.out.println(myOtherList.contains(t));
		System.out.println(myOtherList.contains("Bob"));
		System.out.println(myOtherList.contains("Fred"));
		System.out.println(myOtherList.contains("Joe"));
		
		System.out.println(myOtherList.indexOf(t));
		System.out.println(myOtherList.indexOf("Bob"));
		System.out.println(myOtherList.indexOf("Fred"));
		System.out.println(myOtherList.indexOf("Joe"));

		//MyLinkedList<Integer> myIntList = new MyLinkedList<Integer>();
		//myIntList.add(56);

		boolean ret;
		myOtherList.add("Faisal");
		myOtherList.add("Mostafa");
		System.out.println(myOtherList);
		ret = myOtherList.remove("Mostafa");
		System.out.println(ret + " " + myOtherList);
		ret = myOtherList.remove("Fred");
		System.out.println(ret + " " + myOtherList);
		ret = myOtherList.remove("Joe");
		System.out.println(ret + " " + myOtherList);
		ret = myOtherList.remove("Bob");
		System.out.println(ret + " " + myOtherList);
		ret = myOtherList.remove("Ahmed");
		System.out.println(ret + " " + myOtherList);
		ret = myOtherList.remove("Faisal");
		System.out.println(ret + " " + myOtherList);
		ret = myOtherList.remove("Ryan");
		System.out.println(ret + " " + myOtherList);
	}

}
