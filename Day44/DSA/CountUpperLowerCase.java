package Day44.DSA;

import java.util.Scanner;

public class CountUpperLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		int uppercase = 0;
		int lowercase = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (Character.isUpperCase(ch)) {
				uppercase++;
			} else if (Character.isLowerCase(ch)) {
				lowercase++;
			}
		}
		System.out.println("Uppercase = " + uppercase);
		System.out.println("Lowercase = " + lowercase);
		sc.close();
	}
}