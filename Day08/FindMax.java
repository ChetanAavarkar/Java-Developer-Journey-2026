package basic.Day08;

import java.util.Scanner;

public class FindMax {
	
	public static int Max(int a, int b) {
		if(a>b) {
			return a;
		} else {
			return b;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = sc.nextInt();
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		
		int largest = Max(a, b);
		System.out.println("The Maximum number between " + a + " and " + b + " is " + largest);
		sc.close();
	}

}
