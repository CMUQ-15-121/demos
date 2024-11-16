import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> mySet = new HashSet<String>();

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
