import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> myMap = new HashMap<String, Integer>();
		
		// Put operation is O(1)
		myMap.put("Ryan", 42);
		myMap.put("Ahmed", 19);
		
		// Get operation is O(1)
		System.out.println(myMap.get("Ryan"));
		System.out.println(myMap.get("Ahmed"));
		
		// containsKey is O(1)
		System.out.println(myMap.containsKey("Ryan"));
		
		// containsValue is O(N)
		System.out.println(myMap.containsValue(42));
		
		System.out.println("---");
		for(String k: myMap.keySet()) {
			System.out.println(k + " " + myMap.get(k));
		}

	}

}
