package basic.Day08;

import java.util.Scanner;

public class Cube {
	
	public static long cube(long m) {
		return  m * m * m;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		long n  = sc.nextLong();
		
		System.out.println("Its cube is: " + cube(n));
		sc.close();
	}
}
