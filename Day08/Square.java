package basic.Day08;

import java.util.Scanner;

public class Square {
	
	public static int findSquare(int n) {
		int square = n * n;
		return square;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int m = sc.nextInt();
		
		System.out.println("its square is: " + findSquare(m));
		sc.close();
	}

}
