import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class WordCounter {

	private Map<String, Integer> wordFreq;

	public WordCounter(String filename) {
		FileReader fr;
		try {
			fr = new FileReader(filename);
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			return;
		}

		Scanner inp = new Scanner(fr);

		wordFreq = new HashMap<String, Integer>();

		while (inp.hasNextLine()) {
			String line = inp.nextLine().toLowerCase();
			String[] words = line.split(" ");

			for (String w : words) {
				if(w.equals("")) {
					continue;
				}
				if (wordFreq.containsKey(w)) {
					int tmp = wordFreq.get(w);
					wordFreq.put(w, tmp + 1);
				} else {
					wordFreq.put(w, 1);
				}
			}
		}
		
		Set<String> keys = wordFreq.keySet();
		ArrayList<String> wordList = new ArrayList<String>(keys);
		Collections.sort(wordList, new FrequencyComparator());
		for(int i = 0; i < 50; i++) {
			String w = wordList.get(i);
			System.out.println(w + ": " + wordFreq.get(w));
		}
	}
	
	private class FrequencyComparator implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			int freq1 = wordFreq.get(o1);
			int freq2 = wordFreq.get(o2);
			
			return freq2 - freq1;
		}
		
	}
	
	public static void main(String[] args) {
		new WordCounter("alice.txt");
	}
}
