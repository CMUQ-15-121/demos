import mylinkedlist.MyLinkedList;

public class ForEachLLTester {

	public static void main(String[] args) {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		list.add(10);
		list.add(5);
		list.add(20);
		
		// O(N^2)
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// O(N)
		for(int e: list) {
			System.out.println(e);
		}
	}
}
