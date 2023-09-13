import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NameChooser {
	private Name[] names;
	private int numNames = 0;

	public NameChooser(String filename) {
		this.names = new Name[4800];

		FileReader fr;

		try {
			fr = new FileReader(filename);
		} catch (FileNotFoundException e) {
			System.out.println(e);
			return;
		}

		Scanner inp = new Scanner(fr);
		while(inp.hasNextLine()) {
			String line = inp.nextLine();
			String[] splitLine = line.split("\t");
			if (splitLine.length != 3) {
				continue;
			}
			Name t = new Name(splitLine[0], splitLine[1], splitLine[2]);
			this.names[this.numNames++] = t;
		}
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
		NameChooser nc = new NameChooser("GirlNames.txt");
		Name theChoice = nc.randomName();
		System.out.println(theChoice);
	}
}
