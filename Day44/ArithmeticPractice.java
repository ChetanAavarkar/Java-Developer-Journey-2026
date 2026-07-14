package Day44;

import java.util.Scanner;

public class ArithmeticPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter a number: ");
			int a = sc.nextInt();
			System.out.println("Enter a second number: ");
			int b = sc.nextInt();
			
			int result = a / b;
			System.out.println(a + " / " + b + " = " + result);
		} catch (ArithmeticException e) {
			System.out.println("Error: Division by zero is not allowed.");
		} finally {
			sc.close();
		}
	}
}