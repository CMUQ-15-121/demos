import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NameChooser {
	private ArrayList<Name> names;

	public NameChooser(String fileName) {
		
		names = new ArrayList<Name>();

		Scanner fileInput = RyanHelpers.getFileScanner(fileName);
		
		if (fileInput == null) {
			return;
		}
	

		while (fileInput.hasNextLine()) {
			String line = fileInput.nextLine();
			String[] lineContents = line.split("\t");
			if (lineContents.length != 3) {
				continue;
			}
			Name newName = new Name(lineContents[0], lineContents[1], lineContents[2]);
			names.add(newName);
		}
		
		fileInput.close();

	}
	
	public Name getRandomName() {
		if (names.size() <= 0) {
			return null;
		}
		
		Random r = new Random();
		int randNameNum = r.nextInt(names.size());
		return names.get(randNameNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameChooser daughterName = new NameChooser("GirlName.txt");
		System.out.println("Your daughter's name will be: " + daughterName.getRandomName());
	}

}
