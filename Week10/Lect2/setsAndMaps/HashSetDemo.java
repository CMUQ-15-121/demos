package setsAndMaps;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> mySet = new HashSet<String>();
		
		//O(1)
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
		mySet.add("Ryan");
		
		//O(1)
		System.out.println(mySet.contains("Ryan"));
		System.out.println(mySet.contains("Hend"));

		
		
		for(String s: mySet) {
			System.out.println(s);
		}
		



	}

}