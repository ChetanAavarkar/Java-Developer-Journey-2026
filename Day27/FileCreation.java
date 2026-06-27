package Day27;

import java.io.*;

public class FileCreation {
	public static void main(String[] args) {
		String fileName = "student.txt";
		
		try (Writer writer = new FileWriter(fileName)) {
			writer.write("Welcome to Student Records\n");
			writer.write("Name: Chetan Aavarkar\n");
			writer.write("Age: 21\n");
			writer.write("Course: Java Programming\n");
			writer.write("Grade: A");
			
			System.out.println("File '" + fileName + "' created successfully!");
		} catch (IOException e) {
			System.out.println(" Error: " + e.getMessage());
		}
	}
}
