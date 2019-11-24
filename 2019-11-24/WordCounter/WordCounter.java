import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordCounter {
	HashMap<String, Integer> wordFreq = new HashMap<String, Integer>();
	ArrayList<String> badWords = new ArrayList<String>();
	
	public WordCounter(String filename) {
		Scanner inp = MyLib.getFileScanner(filename);
		if (inp == null) {
			System.err.println("Error openning the file.  Get out of here!");
			return;
		}
		
		badWords.add(",");
		badWords.add("'s");
		badWords.add(".");
		badWords.add(";");
		badWords.add(":");
		badWords.add("-");
		badWords.add("\"");
		badWords.add("?");
		badWords.add("!");
		badWords.add("(");
		badWords.add(")");
		
		while(inp.hasNextLine()) {
			String line = inp.nextLine().toLowerCase();
			
			for(String badWord: badWords) {
				line = line.replace(badWord, "");
			}
			
			String[] words = line.split(" ");
			
			for(String w: words) {
				
				if (w.length() < 1) {
					continue;
				}
				
				if (wordFreq.containsKey(w)) {
					/*
					int tmp = wordFreq.get(w);
					wordFreq.put(w, tmp+1);
					*/
					wordFreq.put(w, wordFreq.get(w)+1);
				}
				else {
					wordFreq.put(w,  1);
				}
			}
		}
		
		Set<String> s = wordFreq.keySet();
		ArrayList<String> wordList = new ArrayList<String>(s);
		Collections.sort(wordList, new FrequencyComparator());
		
		for(String w: wordList) {
			System.out.println(w + " | " + wordFreq.get(w));
		}
	}
	
	private class FrequencyComparator implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			int freq1 = wordFreq.get(o1);
			int freq2 = wordFreq.get(o2);
			
			return freq1 - freq2;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WordCounter("alice.txt");
	}

}
