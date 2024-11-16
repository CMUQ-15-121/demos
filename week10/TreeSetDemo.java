import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> mySet = new TreeSet<String>();

		// Add is O(log N)
		mySet.add("Ryan");
		mySet.add("GSOzacAJwz");
		mySet.add("hMMaqbnWsP");
		mySet.add("eNbIEtEhDJ");
		mySet.add("riSlYVjqMq");
		mySet.add("SKpvjPNXLR");
		mySet.add("NeJaZutlpR");
		mySet.add("ZozUuAvmBK");
		mySet.add("lkQXzyauCc");
		mySet.add("rBclKaIdBT");
		mySet.add("TMviYuMGxL");
		
		// Add is O(log N)
		System.out.println(mySet.contains("Ryan"));
		System.out.println(mySet.contains("hMMaqbnWsp"));
		
		for(String s: mySet) {
			System.out.println(s);
		}
		
//		String s = "Ryan";
//		System.out.println(s.hashCode());
//		
//		ArrayList<String> myList = new ArrayList<String>();
//		myList.add("bob");
//		myList.add("fatima");
//		System.out.println(myList.hashCode());


	}

}
