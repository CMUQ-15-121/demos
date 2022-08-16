import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NameChooserWithArrayList {
	private ArrayList<Name> names;

	public NameChooserWithArrayList(String filename) {
		this.names = new ArrayList<Name>();
		
		// Actually read the names
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
				this.names.add(n);
			} catch (ArrayIndexOutOfBoundsException e) {
				//System.out.println("Found a bad name");
			}
		}
		
		inp.close();
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
		// TODO Auto-generated method stub
		NameChooserWithArrayList n = new NameChooserWithArrayList("GirlName.txt");
		Name theName = n.randomName();
		System.out.println(theName);

		// String bob = "Hi there my name is Bob";
		// System.out.println(Arrays.toString(bob.split("e")));
	}

}
