package basic.Day07;

import java.util.Scanner;

public class Palindrome {
	public static void isPalindrome(String str) {
		
		String reversed = "";
		
		for(int i = str.length() - 1; i >= 0; i--) {
			reversed = reversed + str.charAt(i);
		}
		
		if(str.equals(reversed)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your String: ");
		String str = sc.nextLine();
		
		isPalindrome(str);
		sc.close();
	}
}

