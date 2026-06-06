package basic.Day06;

import java.util.Scanner;

public class LastChar {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your string: ");
		String name = sc.nextLine();
		
		char c = name.charAt(name.length() - 1);
		System.out.println("Last Charater is: " + c);
		
		sc.close();
	}

}
