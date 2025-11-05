package sets;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> mySet = new TreeSet<String>();

		// Add O(log N)
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
		
		// Contains O(log N)
		System.out.println(mySet.contains("hMMaqbnWsP"));
		System.out.println(mySet.contains("Hend"));
	
		
		
		//Looping
		for(String s: mySet) {
			System.out.println(s);
		}
		


	}

}