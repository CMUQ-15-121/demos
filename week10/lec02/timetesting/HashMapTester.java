package timetesting;

import java.util.HashMap;
import java.util.Set;

public class HashMapTester {

	public static void main(String[] args) {
		HashMap<String, Integer> myMap = new HashMap<String, Integer>();
		
		myMap.put("Ryan", 41);
		myMap.put("Ahmed", 19);
		
		System.out.println(myMap.get("Ryan"));
		System.out.println(myMap.get("Ahmed"));
		System.out.println(myMap.get("John")); // Returns null
		
		System.out.println(myMap.containsKey("Ryan"));
		System.out.println(myMap.containsKey("John"));
		
		System.out.println(myMap.containsValue(41));
		System.out.println(myMap.containsValue(40));
		
		Set<String> theKeys = myMap.keySet();
		for(String k: theKeys) {
			System.out.println(k);
		}
		
	}

}
