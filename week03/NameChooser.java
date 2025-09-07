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
			System.out.println("File not found " + e);
			return;
		}

		Scanner inp = new Scanner(fr);

		while (inp.hasNextLine()) {
			String line = inp.nextLine();
			String[] splitLine = line.split("\t");
			//System.out.println(Arrays.toString(splitLine));
			Name n;
			try {
				n = new Name(splitLine[0], splitLine[1], splitLine[2]);
			} catch (ArrayIndexOutOfBoundsException e) {
				continue;
			}
			this.names[this.numNames++] = n;
			// System.out.println(line);
		}
		System.out.println(this.numNames);
		inp.close();
	}

	public Name randomName() {
		if (this.numNames == 0) {
			return null;
		}
		Random r = new Random();
		int idx = r.nextInt(this.numNames);
		return this.names[idx];
	}
	
	public static void main(String[] args) {
		NameChooser nc = new NameChooser("GirlName.txt");
		System.out.println("The name is... " + nc.randomName());
	}
}
