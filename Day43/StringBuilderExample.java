package Day43;

import java.util.Scanner;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		
		System.out.println("Enter the string to append: ");
		String str = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(s);
		sb.append(str);
		
		System.out.println("\nResult: " + sb.toString());
		sc.close();
	}
}
