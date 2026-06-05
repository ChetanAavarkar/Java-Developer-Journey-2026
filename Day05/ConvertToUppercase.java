package basic.Day05;

import java.util.Scanner;

public class ConvertToUppercase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.println("Your Uppercased String is: " + name.toUpperCase());
		sc.close();
	}
}
