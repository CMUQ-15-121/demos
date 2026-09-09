package Lect2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NameChooser {

	
	private ArrayList<Name> names;	
	
	public NameChooser(String filename) {
		this.names = new ArrayList<Name>(); 
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(filename);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		Scanner sc= new Scanner(fr);
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			
			String[] splitLine = line.split("\t");
			Name n;
			try {
				n = new Name(splitLine[0], splitLine[1], splitLine[2]);
				//System.out.println(n);
			}catch(ArrayIndexOutOfBoundsException e) {
				
				//System.out.println(e);
				continue;
			}
			
			this.names.add(n);		
		}
		
	}
	
	public Name selectRandomName() {
		Random r = new Random();
		
		int rIndx= r.nextInt(this.names.size());
		return this.names.get(rIndx);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NameChooser nc = new NameChooser("GirlName.txt");
		System.out.println("The chosen name .... "+ nc.selectRandomName());
		
		for(int i=0; i<5; i++) {
			System.out.println(nc.selectRandomName());

		}
	}

}
