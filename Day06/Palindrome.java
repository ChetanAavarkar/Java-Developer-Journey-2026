package basic.Day06;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your String: ");
		String original = sc.nextLine();
		
		String reversed = "";
		
		for(int i = original.length() - 1; i >= 0; i--) {
			reversed = reversed + original.charAt(i);
		}
		
		if(original.equals(reversed)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
		sc.close();
	}

}
