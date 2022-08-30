// N is the length of the word
public class Wordy {
	String word;

	// O(1)
	public Wordy(String s) {
		this.word = s;
	}

	// O(1)
	public String getWord() {
		return word;
	}

	// O(1)
	public boolean startsWith(char c) {
		if (word.charAt(0) == c) {
			return true;
		} else {
			return false;
		}
	}

	// O(N)
	public int countLetter(char c) {
		int lCount = 0;
		for (int j = 0; j < word.length(); j++) {
			if (word.charAt(j) == c) {
				lCount++;
			}
		}
		return lCount;
	}

	// O(N^2)
	public char mostFrequentLetter() {
		char mostFreq = ' ';
		int count = 0;

		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);

			// Count how many times letter occurs in the String
			int lCount = countLetter(letter);

			// If it is more than we've seen, remember it.
			if (lCount > count) {
				count = lCount;
				mostFreq = letter;
			}
		}

		return mostFreq;
	}

	// O(N)
	public String lettersContained() {
		String letters = "abcdefghijklmnopqrstuvwxyz";
		String ret = "";

		for (int i = 0; i < letters.length(); i++) { // Loop is O(1) because it always runs 26 times
			char letter = letters.charAt(i);
			if (word.indexOf(letter) >= 0) { // O(N)
				ret += letter;
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