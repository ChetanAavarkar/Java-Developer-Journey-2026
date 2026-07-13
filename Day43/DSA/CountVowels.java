package Day43.DSA;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str = sc.nextLine();
		
		int VowelCount = 0;
		String vowels = "aeiouAEIOU";
		
		for (char ch : str.toCharArray()) {
			if (vowels.indexOf(ch) != -1) {
				VowelCount++;
			}
		}
		System.out.println("Number of vowels: " + VowelCount);
		sc.close();
	}
}