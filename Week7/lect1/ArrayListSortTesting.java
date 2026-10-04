package lect1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> theList = new ArrayList<String>();
		theList.add("hello");
		theList.add("data structures");
		theList.add("class");
		theList.add("students");
		
		System.out.println(theList);
		Collections.sort(theList);
		System.out.println(theList);

		

	}

}
