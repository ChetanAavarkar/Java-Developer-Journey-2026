package basic.Day06;

import java.util.Scanner;

public class Contains {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your String: ");
		String str = sc.nextLine();
		
		System.out.println(str.contains("Ram"));
		
		sc.close();
	}

}
