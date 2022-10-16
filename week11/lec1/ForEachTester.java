import java.util.Iterator;
import java.util.LinkedList;

public class ForEachTester {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
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
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int e = it.next();
			System.out.println(e);
		}
		
	}
}
