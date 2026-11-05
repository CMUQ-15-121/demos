package setsAndMaps;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> mySet = new TreeSet<String>();

		//same set ops
		//O(log n)
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
		
		//O(log n)
		System.out.println(mySet.contains("Ryan"));
		System.out.println(mySet.contains("Hend"));

		
		
		for(String s: mySet) {
			System.out.println(s);
		}
		
	
		


	}

}