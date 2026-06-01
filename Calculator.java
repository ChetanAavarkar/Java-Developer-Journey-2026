package basic;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a: ");
		double a = sc.nextDouble();
		System.out.println("Enter b: ");
		double b = sc.nextDouble();
		
		System.out.println("Addition: " + (a + b));
		System.out.println("Substraction: " + (a - b));
		System.out.println("Multiplcation: " + (a * b));
		System.out.println("Division: " + (a / b));
		
		sc.close();
	}
}
