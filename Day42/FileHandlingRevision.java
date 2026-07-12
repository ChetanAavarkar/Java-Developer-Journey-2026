package Day42;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileHandlingRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "vehicle.txt";
		
		try (Reader reader = new FileReader(filename)) {
			int character;
			System.out.println("Content of " + filename + ":");
			while ((character = reader.read()) != -1) {
				System.out.print((char) character);
			}
			System.out.println("\n End of file");
		} catch(IOException e) {
			System.out.println("Error reading file:" + e.getMessage());
		}
	}
}
