package timetesting;

import java.util.HashSet;

public class HashSetTester {

	public static void main(String[] args) {
		HashSet<String> mySet = new HashSet<String>();

		mySet.add("Ryan");
		mySet.add("ALgDJVbXkt");
		mySet.add("VkEwjOxhml");
		mySet.add("TNmJwSdZLE");
		mySet.add("urnCyXKDdV");
		mySet.add("EycykSLMAt");
		mySet.add("vwisyjiPdD");
		mySet.add("lLIXtqNGfe");
		mySet.add("sHvZVVGCbK");
		mySet.add("QDPkUrFnUe");
		mySet.add("XAXdcJxfHJ");

		System.out.println(mySet.contains("Ryan"));
		
		for(String s: mySet) {
			System.out.println(s);
		}
	}

}
