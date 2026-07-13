package Day43;

import java.util.Scanner;

public class StringBuilderReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(s);
		String reversed = sb.reverse().toString();
		
		System.out.println("\nReversed String: " + reversed);
		sc.close();
	}
}
