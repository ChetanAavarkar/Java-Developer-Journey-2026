package Day41;

import java.time.LocalDate;
import java.util.Scanner;

public class CalculateAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your birth year");
		int birthyear = sc.nextInt();
		
		int curyear = LocalDate.now().getYear();
		int age = curyear - birthyear;
		
		System.out.println("Your approximate age is: " + age + " years");
		sc.close();
	}
}
