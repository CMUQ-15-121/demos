import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * A basic hangman game. It reads words from a file, chooses one at random, and
 * then the player can guess letters one at a time until they get the word.
 * 
 * @author Ryan Riley
 * @version 1.0
 * 
 */
public class Hangman {
	private String word;
	private String guesses;
	private static final int NUMGUESSES = 10;

	/**
	 * Allocates a new hangman game. Reads in the list of possible words, and
	 * chooses one at random.
	 * 
	 * @param length   The minimum word length to consider. The chosen word with
	 *                 have a length greater than or equal to this.
	 * @param filename The file containing the words to choose from.
	 */
	public Hangman(int length, String filename) {
		ArrayList<String> words = new ArrayList<String>();

		// Read in all the words
		Scanner wordFile;
		try {
			wordFile = new Scanner(new FileReader(filename));
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + filename);
			return;
		}
		while (wordFile.hasNextLine()) {
			String word = wordFile.nextLine();
			if (word.length() >= length) {
				words.add(word);
			}
		}

		wordFile.close();

		// Chose one at random
		Random r = new Random();
		word = words.get(r.nextInt(words.size()));

		// Initialize the guesses
		guesses = "";
	}

	/**
	 * Build a "blinded" copy of the word being guessed. This combines the word
	 * itself along with the guesses to produce a copy of the word with only the
	 * guessed letters present and _ in place of unguessed letters.
	 * 
	 * @return The blinded word.
	 */
	public String getWord() {
		String ret = "";

		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (guesses.indexOf(c) >= 0) {
				ret += c;
			} else {
				ret += "_";
			}
			ret += " ";
		}

		return ret;
	}

	/**
	 * Play the game. This method is interactive, continually asking the player to
	 * guess a letter and updating the word appropriately.
	 */
	public void play() {
		int numWrong = 0;
		Scanner inp = new Scanner(System.in);
		System.out.println("Welcome to hangman!");

		while (true) {
			if (numWrong == NUMGUESSES) {
				System.out.println("You lose. The word was " + this.word);
				break;
			}

			String wordToShow = getWord();
			if (wordToShow.indexOf('_') < 0) {
				System.out.println("You win!");
				break;
			}

			System.out.println("The word is " + wordToShow);
			System.out.println("You have guessed: " + guesses);
			System.out.println("You have " + (NUMGUESSES - numWrong) + " guesses remaining");
			System.out.print("Next guess? ");
			String guess = inp.nextLine();
			if (guess.length() != 1) {
				continue;
			}
			if (word.indexOf(guess.charAt(0)) < 0) {
				numWrong++;
			}
			guesses += guess.substring(0, 1);
		}

	}

	/**
	 * A simple main to create a new Hangman game and play it.
	 * 
	 * @param args Command line arguments. (Unused.)
	 */
	public static void main(String args[]) {
		Hangman game = new Hangman(5, "words.txt");
		game.play();
	}
}