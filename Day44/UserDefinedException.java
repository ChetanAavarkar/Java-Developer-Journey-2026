package Day44;

import java.util.Scanner;

public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter your age: ");
			int age = sc.nextInt();
			
			if (age < 18) {
				throw new Exception("Not Eligible");
			}
			System.out.println("You are eligible. Age: " + age);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			sc.close();
		}
		System.out.println("Program continues after handling the exception...");
	}
}