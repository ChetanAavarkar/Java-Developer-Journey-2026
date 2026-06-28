package Day28;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EmolyeeFile2 {
	public static void main(String[] args) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("employee.txt"))) {
			bw.write("Name: Chetan");
			bw.newLine();
			bw.write("Age: 22");
			bw.newLine();
			bw.write("City: Surat");
			bw.newLine();
			
			System.out.println("File Created and data written successfully.");		
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		try (BufferedReader br = new BufferedReader(new FileReader("employee.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("An error occurred while reading.");
			e.printStackTrace();
		}
	}
}
