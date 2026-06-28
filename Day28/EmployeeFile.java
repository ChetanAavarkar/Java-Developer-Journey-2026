package Day28;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeFile {
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
	}
}
