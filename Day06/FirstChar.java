package basic.Day06;

import java.util.Scanner;

public class FirstChar {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your String: ");
		String name = sc.nextLine();
		
		char c = name.charAt(0);
		
		System.out.println("First character of string is: " + c);
		sc.close();
	}

}
