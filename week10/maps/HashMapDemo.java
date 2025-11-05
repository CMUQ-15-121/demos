package maps;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> myMap = new HashMap<String, Integer>();
		
		// Put O(1)
		myMap.put("Ryan", 42);
		myMap.put("Ahmed", 19);
		
		// Get O(1)
		System.out.println(myMap.get("Ahmed"));
		
		// containsKey O(1)
		System.out.println(myMap.containsKey("Ryan"));
		
		// containsValue O(N)
		System.out.println(myMap.containsValue(19));
		
		//Looping
		System.out.println("---");
		for(String k: myMap.keySet()) {
			System.out.println(k+": "+myMap.get(k));
		}
	}

}