package basic;

import java.util.Scanner;

public class biggerchecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		int a = sc.nextInt();
		
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println("a is bigger number");
		} else {
			System.out.println("b is bigger number");
		}
		sc.close();
	}
}
