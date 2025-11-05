package sets;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> mySet = new HashSet<String>();
		
		//Add O(1)
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
		

		//Contains O(1)
		System.out.println(mySet.contains("hMMaqbnWsP"));
		System.out.println(mySet.contains("Hend"));
		
		//Looping 
		for(String s: mySet) {
			System.out.println(s);
		}


	}

}