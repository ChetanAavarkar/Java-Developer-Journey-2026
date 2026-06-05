package basic.Day05;

import java.util.Scanner;

public class CountVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your string: ");
		String a = sc.nextLine();
		
		int vowelCount = 0;
		a = a.toLowerCase();
		
		for(int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			}
		}
		System.out.println("Number of vowels: " + vowelCount);
		sc.close();
	}

}
