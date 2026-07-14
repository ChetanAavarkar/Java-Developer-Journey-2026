package Day44.DSA;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first string: ");
		String str1 = sc.nextLine();
		System.out.print("Enter second string: ");
		String str2 = sc.nextLine();
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
		sc.close();
	}
}
