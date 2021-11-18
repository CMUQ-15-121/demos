import java.util.HashSet;

public class HashSetSample {

	public static void main(String[] args) {
		HashSet<String> mySet = new HashSet<String>();

		System.out.println(mySet.isEmpty());

		mySet.add("Ryan");
		mySet.add("fdsfds");
		mySet.add("fdsfds");
		mySet.add("cyGAIBK5h7");
		mySet.add("ms6dSpLyeA");
		mySet.add("qkvDlupflC");
		mySet.add("Wki89KOY7e");
		mySet.add("orwgLz0e9m");
		mySet.add("4s7fi9BWsl");
		mySet.add("fqHaa5hIbv");
		mySet.add("Lgw4SgkH1i");
		mySet.add("RPbyTiuzfh");
		mySet.add("kvdJHsL8FE");

		System.out.println(mySet.isEmpty());
		System.out.println(mySet.size());
		
		System.out.println(mySet.contains("Ryan"));
		
		//mySet.get(0); // This doesn't make sense
		
		// Iterate through items in a set
		System.out.println("---");
		for(String s: mySet) {
			System.out.println(s);
		}

	}

}
