package Day18;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter first number: ");
			int num1 = sc.nextInt();
			System.out.println("Enter second number: ");
			int num2 = sc.nextInt();
			
			int result = num1 / num2;
			System.out.println("Result of " + num1 + " / " + num2 + " = " + result);
		} catch (ArithmeticException e) {
			System.out.println("Error: Cannot divide by zero! " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Invalid input! Please enter valid integers.");
		} finally {
			sc.close();
		}
	}
}
