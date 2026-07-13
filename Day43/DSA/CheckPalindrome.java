package Day43.DSA;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(str);
		String reversed = sb.reverse().toString();
		
		if (str.equals(reversed)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
		sc.close();
	}
}
