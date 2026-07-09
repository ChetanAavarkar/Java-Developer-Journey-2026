package Day39;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadStudentFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new FileReader("student.txt"))) {
			String line;
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
