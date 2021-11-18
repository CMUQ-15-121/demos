import java.util.HashMap;
import java.util.Set;

public class HashMapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> myMap = new HashMap<String, Integer>();
		
		myMap.put("Ryan", 39);
		myMap.put("Ahmed", 19);
		
		System.out.println(myMap.get("Ryan"));
		System.out.println(myMap.get("Bob"));
		
		System.out.println(myMap.containsKey("Ryan"));
		System.out.println(myMap.containsKey("Bob"));
		
		System.out.println(myMap.containsValue(39));
		System.out.println(myMap.containsValue(40));
		
		Set<String> theKeys = myMap.keySet();
		for (String k: theKeys) {
			System.out.println(k);
		}
	}

}
