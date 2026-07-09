package Day39;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppendAndReadStudentFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "student.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
			bw.newLine();
			bw.write("Day39 Completed Successfully.");
			bw.newLine();
			System.out.println("Line appended successfuly.");
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		System.out.println("\n Content of student.txt after appending");
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
