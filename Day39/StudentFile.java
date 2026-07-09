package Day39;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StudentFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"))) {
			bw.write("Name : Chetan");
			bw.newLine();
			
			bw.write("Course : MCA");
			bw.newLine();
			
			bw.write("Goal : Java Developer");
			bw.newLine();
			
			System.out.println("student.txt created and written successfully!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
