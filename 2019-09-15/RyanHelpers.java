import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class RyanHelpers {
    /*
     * Helper method to open files for reading.
     * It returns a Scanner object that you can use.
     * Be sure to call .close() on that object when you are done.
     */
    public static Scanner getFileScanner(String filename)
    {
        Scanner myFile;
        try { 
            myFile = new Scanner(new FileReader(filename)); 
        } catch (Exception e) {
            System.out.println("File not found: " + filename);
            return null;
        }
        return myFile;
    }

    /*
     * Helper method to open files for writing.
     * It returns a PrintWriter that you can use.
     * Be sure to call .close() on that object when you are done.
     */
    public static PrintWriter getFileWriter(String filename)
    {
        PrintWriter outFile;
        try { 
            outFile = new PrintWriter(filename);
        }
        catch (Exception e)
        {
            System.out.println("Error opening file: " + filename);
            return null;
        }
        return outFile;
    }	
    
    public static int numLines(String filename) {
		Scanner fileInput = getFileScanner(filename);
		int count = 0;
		
		if (fileInput == null) {
			return 0;
		}
		

		while (fileInput.hasNextLine()) {
			String line = fileInput.nextLine();
			count++;
		}
		
		fileInput.close();
		
		return count;
    }
}
