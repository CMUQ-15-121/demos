package Lect2;

//N: length of word

public class Wordy {
	String word;

	//O(1)
	public Wordy(String s) {
		this.word = s;
	}

	//O(1)
	public String getWord() {
		return word;
	}

	//O(1)
	public boolean startsWith(char c) {
		if (word.charAt(0) == c) {
			return true;
		} else {
			return false;
		}
	}

	//O(N)
	public int countLetter(char c) {
		int lCount = 0;
		for (int j = 0; j < word.length(); j++) { // N iterations
			if (word.charAt(j) == c) { //1
				lCount++; // 1
			}
		}
		return lCount;
	}

	
	//O(N^2)
	public char mostFrequentLetter() {
		char mostFreq = ' ';
		int count = 0;

		for (int i = 0; i < word.length(); i++) { //N iterations
			
			char letter = word.charAt(i);//1

			int lCount = countLetter(letter); //N

			//O(1)
			if (lCount > count) {
				count = lCount;
				mostFreq = letter;
			}
		}

		return mostFreq;
	}

	
	//O(n)
	public String lettersContained() {
		String letters = "abcdefghijklmnopqrstuvwxyz"; //1
		String ret = "";

		for (int i = 0; i < letters.length(); i++) { //26 iterations - O(1)
			char letter = letters.charAt(i); //1
			if (word.indexOf(letter) >= 0) {  //n
				ret += letter; //1
			}
		}

		return ret;
	}

	public static void main(String args[]) {
		Wordy w = new Wordy("HitheremynameisBob");
		System.out.println(w.getWord());
		System.out.println(w.startsWith('h'));
		System.out.println(w.startsWith('i'));
		System.out.println(w.mostFrequentLetter());
		System.out.println(w.lettersContained());
	}

}