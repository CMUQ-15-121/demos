import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NameChooser {
	private Name[] theNames;
	private int numNames = 0;
	private Random r;
	
	public NameChooser(String filename) {
		this.r = new Random();
		
		FileReader fr;
		try {
			fr = new FileReader(filename);
		} catch (FileNotFoundException e) {
			System.err.println("Could not find the file!");
			return;
		}
		Scanner inp = new Scanner(fr);
		int numLines = 0;
		while(inp.hasNextLine()) {
			String line = inp.nextLine();
			numLines++;
		}
		inp.close();
		
		System.out.println("Found " + numLines + " names");
		// Now, numLines stores how many names are in the file.
		this.theNames = new Name[numLines];
		
		try {
			fr = new FileReader(filename);
		} catch (FileNotFoundException e) {
			System.err.println("Could not find the file!");
			return;
		}
		inp = new Scanner(fr);
		while(inp.hasNextLine()) {
			// 1. Read in a line containing a name
			String line = inp.nextLine();
			//System.out.println(line);
			
			// 2. Split the line into its components
			String[] splitLine = line.split("\t");
			for(int i = 0; i < splitLine.length; i++) {
				splitLine[i] = splitLine[i].trim();
			}
			//System.out.println(Arrays.toString(splitLine));
			if (splitLine.length != 3) {
				continue;
			}
			
			if (splitLine[0].isBlank() || splitLine[1].isBlank() || splitLine[2].isBlank()) {
				continue;
			}
			
			// 3. Make a name object
			Name n = new Name(splitLine[0], splitLine[1], splitLine[2]);
			
			// 4. Put the name into the array
			this.theNames[this.numNames++] = n; 
		}
		
		System.out.println(Arrays.toString(this.theNames));

		// I have an array of all the names 
		
	}
	
	public Name randomName() {
		return this.theNames[this.r.nextInt(this.numNames)];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameChooser n = new NameChooser("GirlName.txt");
		Name theChosenName = n.randomName();
		System.out.println(theChosenName);
		
	}

}
