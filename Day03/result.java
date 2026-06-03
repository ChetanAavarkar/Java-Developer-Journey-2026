package basic;

import java.util.Scanner;

public class result {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter your marks: ");
		double marks = sc.nextDouble();
		
		if(marks>=33 && marks<=100) {
			System.out.println("You are passed");
		} else if(marks<=33 && marks>=0) {
			System.out.println("You are fail");
		} else {
			System.out.print("Invalid marks");
		}
		sc.close();
	}
	
	
}
