package basic.Day05;

import java.util.Scanner;

public class CheckStringEquals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your 1st String: ");
		String a = sc.nextLine();
		
		System.out.println("Enter your 2nd String: ");
		String b = sc.nextLine();
		
		if(a.equals(b)) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}
		sc.close();
	}
}
