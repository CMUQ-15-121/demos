import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortTesting {

	public static void main(String[] args) {
		ArrayList<String> theList = new ArrayList<String>();

		// Add four arbitrary words to the list
		theList.add("reputation");
		theList.add("index");
		theList.add("measure");
		theList.add("budget");

		// Print the list
		System.out.println(theList);

		// Sort the list
		Collections.sort(theList);

		// Print the list again
		System.out.println(theList);
	}
}