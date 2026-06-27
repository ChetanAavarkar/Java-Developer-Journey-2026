package Day27;

import java.io.*;
public class ReadAndPrint {
	public static void main(String[] args) {
		String fileName = "student.txt";
		
		try (Reader reader = new FileReader(fileName)) {
			int character;
			System.out.println(" Content of " + fileName);
			while ((character = reader.read()) != -1) {
				System.out.print((char) character);			
			}
			System.out.println("\n End of File ");
		} catch (IOException e) {
			System.out.println(" Error reading file: " + e.getMessage());
		}
	}
}
