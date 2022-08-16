import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NameChooser {
	private Name[] names;
	private int numNames = 0;

	public NameChooser(String filename) {
		// This is a really bad idea, instead I should go through
		// the file and count
		names = new Name[4800]; 

		FileReader fr;
		try {
			fr = new FileReader(filename);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("File not found");
			return;
		}

		Scanner inp = new Scanner(fr);

		while (inp.hasNextLine()) {
			String line = inp.nextLine();
			String[] splitLine = line.split("\t");
			//System.out.println(line);
			//System.out.println(splitLine.length);
			try {
				Name n = new Name(splitLine[0], splitLine[1], splitLine[2]);
				this.names[this.numNames++] = n;
			} catch (ArrayIndexOutOfBoundsException e) {
				//System.out.println("Found a bad name");
			}
		}
		
		inp.close();
	}
	
	public Name randomName() {
		if (this.numNames == 0) {
			return null;
		}
		Random r = new Random();
		int theIndex = r.nextInt(this.numNames);
		return this.names[theIndex];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameChooser n = new NameChooser("GirlName.txt");
		Name theName = n.randomName();
		System.out.println(theName);

		// String bob = "Hi there my name is Bob";
		// System.out.println(Arrays.toString(bob.split("e")));
	}

}
