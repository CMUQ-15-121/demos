package setsAndMaps;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> myMap = new HashMap<String, Integer>();
		
		//O(1)
		myMap.put("Ryan", 42);
		myMap.put("Ahmed", 19);
		myMap.put("Ahmed", 15);
		
		//O(1) - because of hashing
		System.out.println(myMap.containsKey("Ahmed"));
		
		//O(n) - check all entries
		System.out.println(myMap.containsValue(15));

		
		
		for(String k: myMap.keySet()) {
			
			System.out.println(k+" "+ myMap.get(k));
		}
		
		
		
	}

}