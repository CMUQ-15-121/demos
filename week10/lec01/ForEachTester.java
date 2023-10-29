import java.util.ArrayList;
import java.util.Iterator;

public class ForEachTester {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(20);
		
		// O(N)
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// O(N)
		for(int e: list) {
			System.out.println(e);
		}
		
		// What a for-each loop really does
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int e = it.next();
			System.out.println(e);
		}
	}

}
