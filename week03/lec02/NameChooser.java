import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NameChooser {
	private ArrayList<Name> names;

	public NameChooser(String filename) {
		this.names = new ArrayList<Name>();

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
			this.names.add(t);
		}
	}
	
	public Name randomName() {
		if (this.names.size() == 0) {
			return null;
		}
		Random r = new Random();
		int theIndex = r.nextInt(this.names.size());
		return this.names.get(theIndex);
	}

	public static void main(String[] args) {
		NameChooser nc = new NameChooser("GirlName.txt");
		Name theChoice = nc.randomName();
		System.out.println(theChoice);
	}
}
