import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NameChooser {

	private Name[] names;
	private int numNames;

//	public NameChooser(String filename) throws FileNotFoundException {
//		try {
//			FileReader fr = new FileReader(filename);
//		} catch (FileNotFoundException fne) {
//			System.out.println("I could not open the requested file.");
//			throw fne;
//		}
//
//	}

	public NameChooser(String filename) {
		FileReader fr = null;
		try {
			fr = new FileReader(filename);
		} catch (FileNotFoundException fne) {
			System.out.println("I could not open the requested file.");
			return;
		}

		Scanner inp = new Scanner(fr);
		
		this.names = new Name[10000]; // Bad
		this.numNames = 0;
		while(inp.hasNextLine()) {
			String line = inp.nextLine();
			String[] splitLine = line.split("\t");
			//System.out.println(Arrays.toString(splitLine));
			Name n = null;
			if (splitLine.length == 1) {
				n = new Name(splitLine[0], "", "");
			}
			else if (splitLine.length == 2) {
				n = new Name(splitLine[0], splitLine[1], "");
			} else {
				n = new Name(splitLine[0], splitLine[1], splitLine[2]);
			}
			this.names[this.numNames++] = n;
		}
	}

	/**
	 * Choice a random name.
	 * 
	 * @return The name
	 */
	public Name randomName() {
		Random r = new Random();
		int idx = r.nextInt(this.numNames);
		return this.names[idx];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameChooser nc = new NameChooser("GirlName.txt");
		Name theName = nc.randomName();
		System.out.println(theName);
	}

}
