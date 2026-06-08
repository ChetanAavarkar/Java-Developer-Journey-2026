package basic.Day08;

import java.util.Scanner;

public class Overloading {
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = sc.nextInt();
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		System.out.println("Enter c: ");
		int c = sc.nextInt();
		
		System.out.println("Addition is: " + add(a, b));
		System.out.println("Addition is: " + add(a, b, c));
		sc.close();
		
		
	}
}
