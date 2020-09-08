import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NameChooser {
	private Name[] names;
	private int numNames;

	private int numLinesInFile(String filename) {
		FileReader fr;
		try {
			fr = new FileReader(filename);
		} catch (FileNotFoundException e) {
			System.out.println("I could not open the file.");
			// System.out.println(e);
			return 0;
		}

		Scanner inp = new Scanner(fr);

		int howMany = 0;
		while (inp.hasNextLine()) {
			String line = inp.nextLine();
			howMany++;
		}
		
		return howMany;
	}
	
	public NameChooser(String filename) {
		
		int numLines = numLinesInFile(filename);
		
		this.numNames = 0;
		this.names = new Name[numLines];
		
		System.out.println("I want to open " + filename);

		FileReader fr;
		try {
			fr = new FileReader(filename);
		} catch (FileNotFoundException e) {
			System.out.println("I could not open the file.");
			// System.out.println(e);
			return;
		}

		Scanner inp = new Scanner(fr);

		while (inp.hasNextLine()) {
			String line = inp.nextLine();
			String[] splitLine = line.split("\t");

			Name tempName;
			if (splitLine.length == 2) {
				tempName = new Name(splitLine[0], splitLine[1], "");
			} else if (splitLine.length == 1) {
				tempName = new Name(splitLine[0], "", "");
			} else {
				tempName = new Name(splitLine[0], splitLine[1], splitLine[2]);
			}
			
			this.names[this.numNames++] = tempName;
		}
	}
	
	public Name findName(String name) {
		for(int i = 0; i < this.numNames; i++) {
			String tmpName = this.names[i].getName();
			if (tmpName.equals(name)) {
				return this.names[i];
			}
		}
		return null;
	}

	public Name getRandomName() {
		// This should return a random name from the names array
		Random r = new Random();
		int nameIndex = r.nextInt(this.numNames);
		return this.names[nameIndex];
	}

	public static void main(String[] args) {
		NameChooser nc = new NameChooser("GirlName.txt");
		
		//Name myNewDaughter = nc.getRandomName();
		//System.out.println(myNewDaughter);
		
		Name foundName = nc.findName("Linda");
		if (foundName != null) {
			System.out.println(foundName);
		} else {
			System.out.println("Name not found");
		}
	}
}
